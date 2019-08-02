/*
 * Prepaidforge API
 * The public api for prepaidforge
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.CodeDeliveryPojo;
import org.openapitools.client.model.SkuRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrdersCodesApi {
    private ApiClient localVarApiClient;

    public OrdersCodesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OrdersCodesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for createSingleOrder
     * @param skuRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call createSingleOrderCall(SkuRequest skuRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = skuRequest;

        // create path and map variables
        String localVarPath = "/1.0/createOrder";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "PrepaidforgeAPIToken" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createSingleOrderValidateBeforeCall(SkuRequest skuRequest, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = createSingleOrderCall(skuRequest, _callback);
        return localVarCall;

    }

    /**
     * 
     * creates order
     * @param skuRequest  (optional)
     * @return CodeDeliveryPojo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CodeDeliveryPojo createSingleOrder(SkuRequest skuRequest) throws ApiException {
        ApiResponse<CodeDeliveryPojo> localVarResp = createSingleOrderWithHttpInfo(skuRequest);
        return localVarResp.getData();
    }

    /**
     * 
     * creates order
     * @param skuRequest  (optional)
     * @return ApiResponse&lt;CodeDeliveryPojo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CodeDeliveryPojo> createSingleOrderWithHttpInfo(SkuRequest skuRequest) throws ApiException {
        okhttp3.Call localVarCall = createSingleOrderValidateBeforeCall(skuRequest, null);
        Type localVarReturnType = new TypeToken<CodeDeliveryPojo>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * creates order
     * @param skuRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call createSingleOrderAsync(SkuRequest skuRequest, final ApiCallback<CodeDeliveryPojo> _callback) throws ApiException {

        okhttp3.Call localVarCall = createSingleOrderValidateBeforeCall(skuRequest, _callback);
        Type localVarReturnType = new TypeToken<CodeDeliveryPojo>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getResponseOfSingleCodeRequest
     * @param skuRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getResponseOfSingleCodeRequestCall(SkuRequest skuRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = skuRequest;

        // create path and map variables
        String localVarPath = "/1.0/getResponseOfSingleCodeRequest";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "PrepaidforgeAPIToken" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getResponseOfSingleCodeRequestValidateBeforeCall(SkuRequest skuRequest, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getResponseOfSingleCodeRequestCall(skuRequest, _callback);
        return localVarCall;

    }

    /**
     * 
     * Retrieve code using custom order reference
     * @param skuRequest  (optional)
     * @return CodeDeliveryPojo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CodeDeliveryPojo getResponseOfSingleCodeRequest(SkuRequest skuRequest) throws ApiException {
        ApiResponse<CodeDeliveryPojo> localVarResp = getResponseOfSingleCodeRequestWithHttpInfo(skuRequest);
        return localVarResp.getData();
    }

    /**
     * 
     * Retrieve code using custom order reference
     * @param skuRequest  (optional)
     * @return ApiResponse&lt;CodeDeliveryPojo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CodeDeliveryPojo> getResponseOfSingleCodeRequestWithHttpInfo(SkuRequest skuRequest) throws ApiException {
        okhttp3.Call localVarCall = getResponseOfSingleCodeRequestValidateBeforeCall(skuRequest, null);
        Type localVarReturnType = new TypeToken<CodeDeliveryPojo>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Retrieve code using custom order reference
     * @param skuRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getResponseOfSingleCodeRequestAsync(SkuRequest skuRequest, final ApiCallback<CodeDeliveryPojo> _callback) throws ApiException {

        okhttp3.Call localVarCall = getResponseOfSingleCodeRequestValidateBeforeCall(skuRequest, _callback);
        Type localVarReturnType = new TypeToken<CodeDeliveryPojo>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
