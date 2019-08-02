# ProductsStocksApi

All URIs are relative to *http://localhost:8080/api-1.0-SNAPSHOT/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findAllProducts**](ProductsStocksApi.md#findAllProducts) | **GET** /1.0/findAllProducts | 
[**findAllStocks**](ProductsStocksApi.md#findAllStocks) | **POST** /1.0/findStocks | 


<a name="findAllProducts"></a>
# **findAllProducts**
> List&lt;Product&gt; findAllProducts()



Retrieves all products

### Example
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.ProductsStocksApi;


ProductsStocksApi apiInstance = new ProductsStocksApi();
try {
    List<Product> result = apiInstance.findAllProducts();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsStocksApi#findAllProducts");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Product&gt;**](Product.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findAllStocks"></a>
# **findAllStocks**
> List&lt;SimpleStockPojo&gt; findAllStocks(stockRequest)



Find Stocks

### Example
```java
// Import classes:
//import org.openapitools.client.ApiClient;
//import org.openapitools.client.ApiException;
//import org.openapitools.client.Configuration;
//import org.openapitools.client.auth.*;
//import org.openapitools.client.api.ProductsStocksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: PrepaidforgeAPIToken
ApiKeyAuth PrepaidforgeAPIToken = (ApiKeyAuth) defaultClient.getAuthentication("PrepaidforgeAPIToken");
PrepaidforgeAPIToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//PrepaidforgeAPIToken.setApiKeyPrefix("Token");

ProductsStocksApi apiInstance = new ProductsStocksApi();
StockRequest stockRequest = new StockRequest(); // StockRequest | 
try {
    List<SimpleStockPojo> result = apiInstance.findAllStocks(stockRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsStocksApi#findAllStocks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stockRequest** | [**StockRequest**](StockRequest.md)|  | [optional]

### Return type

[**List&lt;SimpleStockPojo&gt;**](SimpleStockPojo.md)

### Authorization

[PrepaidforgeAPIToken](../README.md#PrepaidforgeAPIToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

