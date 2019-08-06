# UserApi

All URIs are relative to *http://localhost:8080/api-1.0-SNAPSHOT/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**signInWithApi**](UserApi.md#signInWithApi) | **POST** /1.0/signInWithApi | 


<a name="signInWithApi"></a>
# **signInWithApi**
> ApiSignInResponse signInWithApi(merchantSignInRequest)



Sign in link for api users

### Example
```java
// Import classes:
import com.prepaidforge.client.ApiClient;
import com.prepaidforge.client.ApiException;
import com.prepaidforge.client.Configuration;
import com.prepaidforge.client.models.*;
import com.prepaidforge.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api-1.0-SNAPSHOT/v1");

    UserApi apiInstance = new UserApi(defaultClient);
    MerchantSignInRequest merchantSignInRequest = new MerchantSignInRequest(); // MerchantSignInRequest | 
    try {
      ApiSignInResponse result = apiInstance.signInWithApi(merchantSignInRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#signInWithApi");
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
 **merchantSignInRequest** | [**MerchantSignInRequest**](MerchantSignInRequest.md)|  | [optional]

### Return type

[**ApiSignInResponse**](ApiSignInResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | default response |  -  |

