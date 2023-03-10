/*
 * 0CodeAPI Manager - Publisher API
 * This specifies a **RESTful API** for WSO2 **API Manager** - Publisher.  Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.1.66/components/apimgt/org.wso2.carbon.apimgt.rest.api.publisher/src/main/resources/publisher-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification.
 *
 * OpenAPI spec version: 0.11.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.carbon.apimgt.samples.utils.publisher.rest.client.api;

import org.wso2.carbon.apimgt.samples.utils.publisher.rest.client.ApiCallback;
import org.wso2.carbon.apimgt.samples.utils.publisher.rest.client.ApiClient;
import org.wso2.carbon.apimgt.samples.utils.publisher.rest.client.ApiException;
import org.wso2.carbon.apimgt.samples.utils.publisher.rest.client.ApiResponse;
import org.wso2.carbon.apimgt.samples.utils.publisher.rest.client.Configuration;
import org.wso2.carbon.apimgt.samples.utils.publisher.rest.client.Pair;
import org.wso2.carbon.apimgt.samples.utils.publisher.rest.client.ProgressRequestBody;
import org.wso2.carbon.apimgt.samples.utils.publisher.rest.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.wso2.carbon.apimgt.samples.utils.publisher.rest.client.model.Error;
import org.wso2.carbon.apimgt.samples.utils.publisher.rest.client.model.SubscriptionList;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubscriptionCollectionApi {
    private ApiClient apiClient;

    public SubscriptionCollectionApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SubscriptionCollectionApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for subscriptionsGet */
    private com.squareup.okhttp.Call subscriptionsGetCall(String apiId, Integer limit, Integer offset, String accept, String ifNoneMatch, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/subscriptions".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (apiId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "apiId", apiId));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (accept != null)
        localVarHeaderParams.put("Accept", apiClient.parameterToString(accept));
        if (ifNoneMatch != null)
        localVarHeaderParams.put("If-None-Match", apiClient.parameterToString(ifNoneMatch));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call subscriptionsGetValidateBeforeCall(String apiId, Integer limit, Integer offset, String accept, String ifNoneMatch, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        // verify the required parameter 'apiId' is set
        if (apiId == null) {
            throw new ApiException("Missing the required parameter 'apiId' when calling subscriptionsGet(Async)");
        }


        com.squareup.okhttp.Call call = subscriptionsGetCall(apiId, limit, offset, accept, ifNoneMatch, progressListener, progressRequestListener);
        return call;





    }

    /**
     * Get all Subscriptions
     * This operation can be used to retrieve a list of subscriptions of the user associated with the provided access token. This operation is capable of  1. Retrieving all subscriptions for the user&#39;s APIs. &#x60;GET https://127.0.0.1:9443/api/am/publisher/v0.16/subscriptions&#x60;  2. Retrieving subscriptions for a specific API. &#x60;GET https://127.0.0.1:9443/api/am/publisher/v0.16/subscriptions?apiId&#x3D;c43a325c-260b-4302-81cb-768eafaa3aed&#x60;
     * @param apiId **API ID** consisting of the **UUID** of the API. Using the **UUID** in the API call is recommended. The combination of the provider of the API, name of the API and the version is also accepted as a valid API I. Should be formatted as **provider-name-version**.  (required)
     * @param limit Maximum size of resource array to return.  (optional, default to 25)
     * @param offset Starting point within the complete list of items qualified.  (optional, default to 0)
     * @param accept Media types acceptable for the response. Default is application/json.  (optional, default to application/json)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resource (Will be supported in future).  (optional)
     * @return SubscriptionList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SubscriptionList subscriptionsGet(String apiId, Integer limit, Integer offset, String accept, String ifNoneMatch) throws ApiException {
        ApiResponse<SubscriptionList> resp = subscriptionsGetWithHttpInfo(apiId, limit, offset, accept, ifNoneMatch);
        return resp.getData();
    }

    /**
     * Get all Subscriptions
     * This operation can be used to retrieve a list of subscriptions of the user associated with the provided access token. This operation is capable of  1. Retrieving all subscriptions for the user&#39;s APIs. &#x60;GET https://127.0.0.1:9443/api/am/publisher/v0.16/subscriptions&#x60;  2. Retrieving subscriptions for a specific API. &#x60;GET https://127.0.0.1:9443/api/am/publisher/v0.16/subscriptions?apiId&#x3D;c43a325c-260b-4302-81cb-768eafaa3aed&#x60;
     * @param apiId **API ID** consisting of the **UUID** of the API. Using the **UUID** in the API call is recommended. The combination of the provider of the API, name of the API and the version is also accepted as a valid API I. Should be formatted as **provider-name-version**.  (required)
     * @param limit Maximum size of resource array to return.  (optional, default to 25)
     * @param offset Starting point within the complete list of items qualified.  (optional, default to 0)
     * @param accept Media types acceptable for the response. Default is application/json.  (optional, default to application/json)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resource (Will be supported in future).  (optional)
     * @return ApiResponse&lt;SubscriptionList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SubscriptionList> subscriptionsGetWithHttpInfo(String apiId, Integer limit, Integer offset, String accept, String ifNoneMatch) throws ApiException {
        com.squareup.okhttp.Call call = subscriptionsGetValidateBeforeCall(apiId, limit, offset, accept, ifNoneMatch, null, null);
        Type localVarReturnType = new TypeToken<SubscriptionList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get all Subscriptions (asynchronously)
     * This operation can be used to retrieve a list of subscriptions of the user associated with the provided access token. This operation is capable of  1. Retrieving all subscriptions for the user&#39;s APIs. &#x60;GET https://127.0.0.1:9443/api/am/publisher/v0.16/subscriptions&#x60;  2. Retrieving subscriptions for a specific API. &#x60;GET https://127.0.0.1:9443/api/am/publisher/v0.16/subscriptions?apiId&#x3D;c43a325c-260b-4302-81cb-768eafaa3aed&#x60;
     * @param apiId **API ID** consisting of the **UUID** of the API. Using the **UUID** in the API call is recommended. The combination of the provider of the API, name of the API and the version is also accepted as a valid API I. Should be formatted as **provider-name-version**.  (required)
     * @param limit Maximum size of resource array to return.  (optional, default to 25)
     * @param offset Starting point within the complete list of items qualified.  (optional, default to 0)
     * @param accept Media types acceptable for the response. Default is application/json.  (optional, default to application/json)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resource (Will be supported in future).  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call subscriptionsGetAsync(String apiId, Integer limit, Integer offset, String accept, String ifNoneMatch, final ApiCallback<SubscriptionList> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = subscriptionsGetValidateBeforeCall(apiId, limit, offset, accept, ifNoneMatch, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SubscriptionList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
