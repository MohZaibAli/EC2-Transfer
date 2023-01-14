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


import org.wso2.carbon.apimgt.samples.utils.admin.rest.client.model.CustomRule;
import org.wso2.carbon.apimgt.samples.utils.admin.rest.client.model.CustomRuleList;
import org.wso2.carbon.apimgt.samples.utils.admin.rest.client.model.Error;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomRulesCollectionApi {
    private ApiClient apiClient;

    public CustomRulesCollectionApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CustomRulesCollectionApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for throttlingPoliciesCustomGet */
    private com.squareup.okhttp.Call throttlingPoliciesCustomGetCall(String accept, String ifNoneMatch, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/throttling/policies/custom".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (accept != null)
        localVarHeaderParams.put("Accept", apiClient.parameterToString(accept));
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
    private com.squareup.okhttp.Call throttlingPoliciesCustomGetValidateBeforeCall(String accept, String ifNoneMatch, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = throttlingPoliciesCustomGetCall(accept, ifNoneMatch, ifModifiedSince, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get all Custom Rules
     * Retrieves all Custom Rules.  **NOTE:** * Only super tenant users are allowed for this operation. 
     * @param accept Media types acceptable for the response. Default is application/json.  (optional, default to application/json)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resource (Will be supported in future).  (optional)
     * @param ifModifiedSince Validator for conditional requests; based on Last Modified header of the formerly retrieved variant of the resource (Will be supported in future).  (optional)
     * @return CustomRuleList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CustomRuleList throttlingPoliciesCustomGet(String accept, String ifNoneMatch, String ifModifiedSince) throws ApiException {
        ApiResponse<CustomRuleList> resp = throttlingPoliciesCustomGetWithHttpInfo(accept, ifNoneMatch, ifModifiedSince);
        return resp.getData();
    }

    /**
     * Get all Custom Rules
     * Retrieves all Custom Rules.  **NOTE:** * Only super tenant users are allowed for this operation. 
     * @param accept Media types acceptable for the response. Default is application/json.  (optional, default to application/json)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resource (Will be supported in future).  (optional)
     * @param ifModifiedSince Validator for conditional requests; based on Last Modified header of the formerly retrieved variant of the resource (Will be supported in future).  (optional)
     * @return ApiResponse&lt;CustomRuleList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CustomRuleList> throttlingPoliciesCustomGetWithHttpInfo(String accept, String ifNoneMatch, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = throttlingPoliciesCustomGetValidateBeforeCall(accept, ifNoneMatch, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<CustomRuleList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get all Custom Rules (asynchronously)
     * Retrieves all Custom Rules.  **NOTE:** * Only super tenant users are allowed for this operation. 
     * @param accept Media types acceptable for the response. Default is application/json.  (optional, default to application/json)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resource (Will be supported in future).  (optional)
     * @param ifModifiedSince Validator for conditional requests; based on Last Modified header of the formerly retrieved variant of the resource (Will be supported in future).  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call throttlingPoliciesCustomGetAsync(String accept, String ifNoneMatch, String ifModifiedSince, final ApiCallback<CustomRuleList> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = throttlingPoliciesCustomGetValidateBeforeCall(accept, ifNoneMatch, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CustomRuleList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for throttlingPoliciesCustomPost */
    private com.squareup.okhttp.Call throttlingPoliciesCustomPostCall(CustomRule body, String contentType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/throttling/policies/custom".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (contentType != null)
        localVarHeaderParams.put("Content-Type", apiClient.parameterToString(contentType));

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call throttlingPoliciesCustomPostValidateBeforeCall(CustomRule body, String contentType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling throttlingPoliciesCustomPost(Async)");
        }
        
        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new ApiException("Missing the required parameter 'contentType' when calling throttlingPoliciesCustomPost(Async)");
        }
        
        
        com.squareup.okhttp.Call call = throttlingPoliciesCustomPostCall(body, contentType, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Add a Custom Rule
     * Adds a new Custom Rule.  **NOTE:** * Only super tenant users are allowed for this operation. 
     * @param body Custom Rule object that should to be added  (required)
     * @param contentType Media type of the entity in the body. Default is application/json.  (required)
     * @return CustomRule
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CustomRule throttlingPoliciesCustomPost(CustomRule body, String contentType) throws ApiException {
        ApiResponse<CustomRule> resp = throttlingPoliciesCustomPostWithHttpInfo(body, contentType);
        return resp.getData();
    }

    /**
     * Add a Custom Rule
     * Adds a new Custom Rule.  **NOTE:** * Only super tenant users are allowed for this operation. 
     * @param body Custom Rule object that should to be added  (required)
     * @param contentType Media type of the entity in the body. Default is application/json.  (required)
     * @return ApiResponse&lt;CustomRule&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CustomRule> throttlingPoliciesCustomPostWithHttpInfo(CustomRule body, String contentType) throws ApiException {
        com.squareup.okhttp.Call call = throttlingPoliciesCustomPostValidateBeforeCall(body, contentType, null, null);
        Type localVarReturnType = new TypeToken<CustomRule>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Add a Custom Rule (asynchronously)
     * Adds a new Custom Rule.  **NOTE:** * Only super tenant users are allowed for this operation. 
     * @param body Custom Rule object that should to be added  (required)
     * @param contentType Media type of the entity in the body. Default is application/json.  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call throttlingPoliciesCustomPostAsync(CustomRule body, String contentType, final ApiCallback<CustomRule> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = throttlingPoliciesCustomPostValidateBeforeCall(body, contentType, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CustomRule>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
