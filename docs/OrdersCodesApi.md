# OrdersCodesApi

All URIs are relative to *http://localhost:8080/api-1.0-SNAPSHOT/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSingleOrder**](OrdersCodesApi.md#createSingleOrder) | **POST** /1.0/createOrder | 
[**getResponseOfSingleCodeRequest**](OrdersCodesApi.md#getResponseOfSingleCodeRequest) | **POST** /1.0/getResponseOfSingleCodeRequest | 


<a name="createSingleOrder"></a>
# **createSingleOrder**
> CodeDeliveryPojo createSingleOrder(skuRequest)



creates order

### Example
```java
// Import classes:
import com.prepaidforge.client.ApiClient;
import com.prepaidforge.client.ApiException;
import com.prepaidforge.client.Configuration;
import com.prepaidforge.client.auth.*;
import com.prepaidforge.client.models.*;
import com.prepaidforge.client.api.OrdersCodesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api-1.0-SNAPSHOT/v1");
    
    // Configure API key authorization: PrepaidforgeAPIToken
    ApiKeyAuth PrepaidforgeAPIToken = (ApiKeyAuth) defaultClient.getAuthentication("PrepaidforgeAPIToken");
    PrepaidforgeAPIToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //PrepaidforgeAPIToken.setApiKeyPrefix("Token");

    OrdersCodesApi apiInstance = new OrdersCodesApi(defaultClient);
    SkuRequest skuRequest = new SkuRequest(); // SkuRequest | 
    try {
      CodeDeliveryPojo result = apiInstance.createSingleOrder(skuRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersCodesApi#createSingleOrder");
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
 **skuRequest** | [**SkuRequest**](SkuRequest.md)|  | [optional]

### Return type

[**CodeDeliveryPojo**](CodeDeliveryPojo.md)

### Authorization

[PrepaidforgeAPIToken](../README.md#PrepaidforgeAPIToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | default response |  -  |

<a name="getResponseOfSingleCodeRequest"></a>
# **getResponseOfSingleCodeRequest**
> CodeDeliveryPojo getResponseOfSingleCodeRequest(skuRequest)



Retrieve code using custom order reference

### Example
```java
// Import classes:
import com.prepaidforge.client.ApiClient;
import com.prepaidforge.client.ApiException;
import com.prepaidforge.client.Configuration;
import com.prepaidforge.client.auth.*;
import com.prepaidforge.client.models.*;
import com.prepaidforge.client.api.OrdersCodesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api-1.0-SNAPSHOT/v1");
    
    // Configure API key authorization: PrepaidforgeAPIToken
    ApiKeyAuth PrepaidforgeAPIToken = (ApiKeyAuth) defaultClient.getAuthentication("PrepaidforgeAPIToken");
    PrepaidforgeAPIToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //PrepaidforgeAPIToken.setApiKeyPrefix("Token");

    OrdersCodesApi apiInstance = new OrdersCodesApi(defaultClient);
    SkuRequest skuRequest = new SkuRequest(); // SkuRequest | 
    try {
      CodeDeliveryPojo result = apiInstance.getResponseOfSingleCodeRequest(skuRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersCodesApi#getResponseOfSingleCodeRequest");
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
 **skuRequest** | [**SkuRequest**](SkuRequest.md)|  | [optional]

### Return type

[**CodeDeliveryPojo**](CodeDeliveryPojo.md)

### Authorization

[PrepaidforgeAPIToken](../README.md#PrepaidforgeAPIToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | default response |  -  |

