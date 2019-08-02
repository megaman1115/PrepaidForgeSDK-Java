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
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.UserApi;


UserApi apiInstance = new UserApi();
MerchantSignInRequest merchantSignInRequest = new MerchantSignInRequest(); // MerchantSignInRequest | 
try {
    ApiSignInResponse result = apiInstance.signInWithApi(merchantSignInRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#signInWithApi");
    e.printStackTrace();
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

