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
import com.prepaidforge.client.ApiClient;
import com.prepaidforge.client.ApiException;
import com.prepaidforge.client.Configuration;
import com.prepaidforge.client.models.*;
import com.prepaidforge.client.api.ProductsStocksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api-1.0-SNAPSHOT/v1");

    ProductsStocksApi apiInstance = new ProductsStocksApi(defaultClient);
    try {
      List<Product> result = apiInstance.findAllProducts();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsStocksApi#findAllProducts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | default response |  -  |

<a name="findAllStocks"></a>
# **findAllStocks**
> List&lt;SimpleStockPojo&gt; findAllStocks(stockRequest)



Find Stocks

### Example
```java
// Import classes:
import com.prepaidforge.client.ApiClient;
import com.prepaidforge.client.ApiException;
import com.prepaidforge.client.Configuration;
import com.prepaidforge.client.auth.*;
import com.prepaidforge.client.models.*;
import com.prepaidforge.client.api.ProductsStocksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api-1.0-SNAPSHOT/v1");
    
    // Configure API key authorization: PrepaidforgeAPIToken
    ApiKeyAuth PrepaidforgeAPIToken = (ApiKeyAuth) defaultClient.getAuthentication("PrepaidforgeAPIToken");
    PrepaidforgeAPIToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //PrepaidforgeAPIToken.setApiKeyPrefix("Token");

    ProductsStocksApi apiInstance = new ProductsStocksApi(defaultClient);
    StockRequest stockRequest = new StockRequest(); // StockRequest | 
    try {
      List<SimpleStockPojo> result = apiInstance.findAllStocks(stockRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsStocksApi#findAllStocks");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | default response |  -  |

