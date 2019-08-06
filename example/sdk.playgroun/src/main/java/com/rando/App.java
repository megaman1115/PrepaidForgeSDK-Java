package com.rando;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.prepaidforge.client.ApiException;
import com.prepaidforge.client.Configuration;
import com.prepaidforge.client.api.OrdersCodesApi;
import com.prepaidforge.client.api.ProductsStocksApi;
import com.prepaidforge.client.api.UserApi;
import com.prepaidforge.client.model.ApiSignInResponse;
import com.prepaidforge.client.model.CodeDeliveryPojo;
import com.prepaidforge.client.model.MerchantSignInRequest;
import com.prepaidforge.client.model.SimpleStockPojo;
import com.prepaidforge.client.model.SkuRequest;
import com.prepaidforge.client.model.StockRequest;
import com.prepaidforge.client.model.SkuRequest.CodeTypeEnum;
import com.prepaidforge.client.model.StockRequest.TypesEnum;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     * @throws ApiException
     */
    public static void main(String[] args) throws ApiException {
        Configuration.getDefaultApiClient().setBasePath("https://api.prepaidforge.com/v1").setReadTimeout(10000000);
        MerchantSignInRequest merchantSignInRequest = new MerchantSignInRequest().email("USERNAME")
                .password("PASSWORD");

        String apiKey = new UserApi().signInWithApi(merchantSignInRequest).getApiToken();
        Configuration.getDefaultApiClient().setApiKey(apiKey);

        Map<String, CodeDeliveryPojo> purchasedProducts = purchaseProducts("iTunes-10-USD", TypesEnum.TEXT, 5);
        System.out.println(purchasedProducts);
    }

    private static Map<String, CodeDeliveryPojo> purchaseProducts(String sku, TypesEnum type, int quantity) {

        StockRequest stockRequest = new StockRequest();
        stockRequest.addTypesItem(type);
        stockRequest.addSkusItem(sku);
        OrdersCodesApi ordersCodesApi = new OrdersCodesApi();

        Map<String, CodeDeliveryPojo> purchasedItems = new HashMap<>();
        for (int i = 0; i < quantity; i++) {
            String customOrderReference = "internal_" + sku + purchasedItems.size() + "_" + new Date().getTime();
            CodeDeliveryPojo codeDeliveryPojo = null;
            try {
                Optional<SimpleStockPojo> response = new ProductsStocksApi().findAllStocks(stockRequest).stream()
                        .sorted((one, two) -> {
                            return one.getPurchasePrice().compareTo(two.getPurchasePrice());
                        }).findFirst();
                if (!response.isPresent()) {
                    return purchasedItems;
                }
                SkuRequest skuRequest = new SkuRequest().codeType(CodeTypeEnum.fromValue(type.toString()))
                        .customOrderReference(customOrderReference).price(response.get().getPurchasePrice())
                        .quantity(new BigDecimal("1")).sku(sku);
                codeDeliveryPojo = ordersCodesApi.createSingleOrder(skuRequest);
            } catch (ApiException e) {
                e.printStackTrace();
            }
            purchasedItems.put(customOrderReference, codeDeliveryPojo);
        }
        return purchasedItems;
    }

    private static Map<String, CodeDeliveryPojo> purchaseProducts(String sku, TypesEnum type) {
        return purchaseProducts(sku, type, 1);
    }
}
