/*
 * 0CodeAPI Manager - Admin
 * This document specifies a **RESTful API** for WSO2 **API Manager** - Admin Portal. Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.1.66/components/apimgt/org.wso2.carbon.apimgt.rest.api.admin/src/main/resources/admin-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: 0.11.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.carbon.apimgt.samples.utils.admin.rest.client.api;

import org.wso2.carbon.apimgt.samples.utils.admin.rest.client.ApiCallback;
import org.wso2.carbon.apimgt.samples.utils.admin.rest.client.ApiClient;
import org.wso2.carbon.apimgt.samples.utils.admin.rest.client.ApiException;
import org.wso2.carbon.apimgt.samples.utils.admin.rest.client.ApiResponse;
import org.wso2.carbon.apimgt.samples.utils.admin.rest.client.Configuration;
import org.wso2.carbon.apimgt.samples.utils.admin.rest.client.Pair;
import org.wso2.carbon.apimgt.samples.utils.admin.rest.client.ProgressRequestBody;
import org.wso2.carbon.apimgt.samples.utils.admin.rest.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.wso2.carbon.apimgt.samples.utils.admin.rest.client.model.AdvancedThrottlePolicy;
import org.wso2.carbon.apimgt.samples.utils.admin.rest.client.model.Error;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdvancedPolicyIndividualApi {
    private ApiClient apiClient;

    public AdvancedPolicyIndividualApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AdvancedPolicyIndividualApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for throttlingPoliciesAdvancedPolicyIdDelete */
    private com.squareup.okhttp.Call throttlingPoliciesAdvancedPolicyIdDeleteCall(String policyId, String ifMatch, String ifUnmodifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/throttling/policies/advanced/{policyId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "policyId" + "\\}", apiClient.escapeString(policyId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifMatch != null)
        localVarHeaderParams.put("If-Match", apiClient.parameterToString(ifMatch));
        if (ifUnmodifiedSince != null)
        localVarHeaderParams.put("If-Unmodified-Since", apiClient.parameterToString(ifUnmodifiedSince));

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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call throttlingPoliciesAdvancedPolicyIdDeleteValidateBeforeCall(String policyId, String ifMatch, String ifUnmodifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'policyId' is set
        if (policyId == null) {
            throw new ApiException("Missing the required parameter 'policyId' when calling throttlingPoliciesAdvancedPolicyIdDelete(Async)");
        }
        
        
        com.squareup.okhttp.Call call = throttlingPoliciesAdvancedPolicyIdDeleteCall(policyId, ifMatch, ifUnmodifiedSince, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete an Advanced Throttling Policy
     * Deletes an Advanced level throttling policy. 
     * @param policyId Thorttle policy UUID  (required)
     * @param ifMatch Validator for conditional requests; based on ETag (Will be supported in future).  (optional)
     * @param ifUnmodifiedSince Validator for conditional requests; based on Last Modified header (Will be supported in future).  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void throttlingPoliciesAdvancedPolicyIdDelete(String policyId, String ifMatch, String ifUnmodifiedSince) throws ApiException {
        throttlingPoliciesAdvancedPolicyIdDeleteWithHttpInfo(policyId, ifMatch, ifUnmodifiedSince);
    }

    /**
     * Delete an Advanced Throttling Policy
     * Deletes an Advanced level throttling policy. 
     * @param policyId Thorttle policy UUID  (required)
     * @param ifMatch Validator for conditional requests; based on ETag (Will be supported in future).  (optional)
     * @param ifUnmodifiedSince Validator for conditional requests; based on Last Modified header (Will be supported in future).  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> throttlingPoliciesAdvancedPolicyIdDeleteWithHttpInfo(String policyId, String ifMatch, String ifUnmodifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = throttlingPoliciesAdvancedPolicyIdDeleteValidateBeforeCall(policyId, ifMatch, ifUnmodifiedSince, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete an Advanced Throttling Policy (asynchronously)
     * Deletes an Advanced level throttling policy. 
     * @param policyId Thorttle policy UUID  (required)
     * @param ifMatch Validator for conditional requests; based on ETag (Will be supported in future).  (optional)
     * @param ifUnmodifiedSince Validator for conditional requests; based on Last Modified header (Will be supported in future).  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call throttlingPoliciesAdvancedPolicyIdDeleteAsync(String policyId, String ifMatch, String ifUnmodifiedSince, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = throttlingPoliciesAdvancedPolicyIdDeleteValidateBeforeCall(policyId, ifMatch, ifUnmodifiedSince, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for throttlingPoliciesAdvancedPolicyIdGet */
    private com.squareup.okhttp.Call throttlingPoliciesAdvancedPolicyIdGetCall(String policyId, String ifNoneMatch, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/throttling/policies/advanced/{policyId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "policyId" + "\\}", apiClient.escapeString(policyId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifNoneMatch != null)
        localVarHeaderParams.put("If-None-Match", apiClient.parameterToString(ifNoneMatch));
        if (ifModifiedSince != null)
        localVarHeaderParams.put("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

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
    private com.squareup.okhttp.Call throttlingPoliciesAdvancedPolicyIdGetValidateBeforeCall(String policyId, String ifNoneMatch, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'policyId' is set
        if (policyId == null) {
            throw new ApiException("Missing the required parameter 'policyId' when calling throttlingPoliciesAdvancedPolicyIdGet(Async)");
        }
        
        
        com.squareup.okhttp.Call call = throttlingPoliciesAdvancedPolicyIdGetCall(policyId, ifNoneMatch, ifModifiedSince, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get an Advanced Policy
     * Retrieves an Advanced Policy. 
     * @param policyId Thorttle policy UUID  (required)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resource (Will be supported in future).  (optional)
     * @param ifModifiedSince Validator for conditional requests; based on Last Modified header of the formerly retrieved variant of the resource (Will be supported in future).  (optional)
     * @return AdvancedThrottlePolicy
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AdvancedThrottlePolicy throttlingPoliciesAdvancedPolicyIdGet(String policyId, String ifNoneMatch, String ifModifiedSince) throws ApiException {
        ApiResponse<AdvancedThrottlePolicy> resp = throttlingPoliciesAdvancedPolicyIdGetWithHttpInfo(policyId, ifNoneMatch, ifModifiedSince);
        return resp.getData();
    }

    /**
     * Get an Advanced Policy
     * Retrieves an Advanced Policy. 
     * @param policyId Thorttle policy UUID  (required)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resource (Will be supported in future).  (optional)
     * @param ifModifiedSince Validator for conditional requests; based on Last Modified header of the formerly retrieved variant of the resource (Will be supported in future).  (optional)
     * @return ApiResponse&lt;AdvancedThrottlePolicy&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AdvancedThrottlePolicy> throttlingPoliciesAdvancedPolicyIdGetWithHttpInfo(String policyId, String ifNoneMatch, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = throttlingPoliciesAdvancedPolicyIdGetValidateBeforeCall(policyId, ifNoneMatch, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<AdvancedThrottlePolicy>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get an Advanced Policy (asynchronously)
     * Retrieves an Advanced Policy. 
     * @param policyId Thorttle policy UUID  (required)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resource (Will be supported in future).  (optional)
     * @param ifModifiedSince Validator for conditional requests; based on Last Modified header of the formerly retrieved variant of the resource (Will be supported in future).  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call throttlingPoliciesAdvancedPolicyIdGetAsync(String policyId, String ifNoneMatch, String ifModifiedSince, final ApiCallback<AdvancedThrottlePolicy> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = throttlingPoliciesAdvancedPolicyIdGetValidateBeforeCall(policyId, ifNoneMatch, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AdvancedThrottlePolicy>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for throttlingPoliciesAdvancedPolicyIdPut */
    private com.squareup.okhttp.Call throttlingPoliciesAdvancedPolicyIdPutCall(String policyId, AdvancedThrottlePolicy body, String contentType, String ifMatch, String ifUnmodifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/throttling/policies/advanced/{policyId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "policyId" + "\\}", apiClient.escapeString(policyId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (contentType != null)
        localVarHeaderParams.put("Content-Type", apiClient.parameterToString(contentType));
        if (ifMatch != null)
        localVarHeaderParams.put("If-Match", apiClient.parameterToString(ifMatch));
        if (ifUnmodifiedSince != null)
        localVarHeaderParams.put("If-Unmodified-Since", apiClient.parameterToString(ifUnmodifiedSince));

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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call throttlingPoliciesAdvancedPolicyIdPutValidateBeforeCall(String policyId, AdvancedThrottlePolicy body, String contentType, String ifMatch, String ifUnmodifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'policyId' is set
        if (policyId == null) {
            throw new ApiException("Missing the required parameter 'policyId' when calling throttlingPoliciesAdvancedPolicyIdPut(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling throttlingPoliciesAdvancedPolicyIdPut(Async)");
        }
        
        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new ApiException("Missing the required parameter 'contentType' when calling throttlingPoliciesAdvancedPolicyIdPut(Async)");
        }
        
        
        com.squareup.okhttp.Call call = throttlingPoliciesAdvancedPolicyIdPutCall(policyId, body, contentType, ifMatch, ifUnmodifiedSince, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update an Advanced Throttling Policy
     * Updates an existing Advanced level throttling policy. 
     * @param policyId Thorttle policy UUID  (required)
     * @param body Policy object that needs to be modified  (required)
     * @param contentType Media type of the entity in the body. Default is application/json.  (required)
     * @param ifMatch Validator for conditional requests; based on ETag (Will be supported in future).  (optional)
     * @param ifUnmodifiedSince Validator for conditional requests; based on Last Modified header (Will be supported in future).  (optional)
     * @return AdvancedThrottlePolicy
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AdvancedThrottlePolicy throttlingPoliciesAdvancedPolicyIdPut(String policyId, AdvancedThrottlePolicy body, String contentType, String ifMatch, String ifUnmodifiedSince) throws ApiException {
        ApiResponse<AdvancedThrottlePolicy> resp = throttlingPoliciesAdvancedPolicyIdPutWithHttpInfo(policyId, body, contentType, ifMatch, ifUnmodifiedSince);
        return resp.getData();
    }

    /**
     * Update an Advanced Throttling Policy
     * Updates an existing Advanced level throttling policy. 
     * @param policyId Thorttle policy UUID  (required)
     * @param body Policy object that needs to be modified  (required)
     * @param contentType Media type of the entity in the body. Default is application/json.  (required)
     * @param ifMatch Validator for conditional requests; based on ETag (Will be supported in future).  (optional)
     * @param ifUnmodifiedSince Validator for conditional requests; based on Last Modified header (Will be supported in future).  (optional)
     * @return ApiResponse&lt;AdvancedThrottlePolicy&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AdvancedThrottlePolicy> throttlingPoliciesAdvancedPolicyIdPutWithHttpInfo(String policyId, AdvancedThrottlePolicy body, String contentType, String ifMatch, String ifUnmodifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = throttlingPoliciesAdvancedPolicyIdPutValidateBeforeCall(policyId, body, contentType, ifMatch, ifUnmodifiedSince, null, null);
        Type localVarReturnType = new TypeToken<AdvancedThrottlePolicy>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update an Advanced Throttling Policy (asynchronously)
     * Updates an existing Advanced level throttling policy. 
     * @param policyId Thorttle policy UUID  (required)
     * @param body Policy object that needs to be modified  (required)
     * @param contentType Media type of the entity in the body. Default is application/json.  (required)
     * @param ifMatch Validator for conditional requests; based on ETag (Will be supported in future).  (optional)
     * @param ifUnmodifiedSince Validator for conditional requests; based on Last Modified header (Will be supported in future).  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call throttlingPoliciesAdvancedPolicyIdPutAsync(String policyId, AdvancedThrottlePolicy body, String contentType, String ifMatch, String ifUnmodifiedSince, final ApiCallback<AdvancedThrottlePolicy> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = throttlingPoliciesAdvancedPolicyIdPutValidateBeforeCall(policyId, body, contentType, ifMatch, ifUnmodifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AdvancedThrottlePolicy>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
