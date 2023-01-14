/*
 * 0CodeAPI Manager - Admin
 * This document specifies a **RESTful API** for WSO2 **API Manager** - Admin Portal. Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.5.176/components/apimgt/org.wso2.carbon.apimgt.rest.api.admin/src/main/resources/admin-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: v1.2
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.am.integration.clients.admin.api;

import org.wso2.am.integration.clients.admin.ApiCallback;
import org.wso2.am.integration.clients.admin.ApiClient;
import org.wso2.am.integration.clients.admin.ApiException;
import org.wso2.am.integration.clients.admin.ApiResponse;
import org.wso2.am.integration.clients.admin.Configuration;
import org.wso2.am.integration.clients.admin.Pair;
import org.wso2.am.integration.clients.admin.ProgressRequestBody;
import org.wso2.am.integration.clients.admin.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.wso2.am.integration.clients.admin.api.dto.CustomRuleDTO;
import org.wso2.am.integration.clients.admin.api.dto.ErrorDTO;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomRulesIndividualApi {
    private ApiClient apiClient;

    public CustomRulesIndividualApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CustomRulesIndividualApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for throttlingPoliciesCustomRuleIdDelete
     * @param ruleId Custom rule UUID  (required)
     * @param ifMatch Validator for conditional requests; based on ETag (Will be supported in future).  (optional)
     * @param ifUnmodifiedSince Validator for conditional requests; based on Last Modified header (Will be supported in future).  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call throttlingPoliciesCustomRuleIdDeleteCall(String ruleId, String ifMatch, String ifUnmodifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/throttling/policies/custom/{ruleId}"
            .replaceAll("\\{" + "ruleId" + "\\}", apiClient.escapeString(ruleId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

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

        String[] localVarAuthNames = new String[] { "OAuth2Security" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call throttlingPoliciesCustomRuleIdDeleteValidateBeforeCall(String ruleId, String ifMatch, String ifUnmodifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'ruleId' is set
        if (ruleId == null) {
            throw new ApiException("Missing the required parameter 'ruleId' when calling throttlingPoliciesCustomRuleIdDelete(Async)");
        }
        

        com.squareup.okhttp.Call call = throttlingPoliciesCustomRuleIdDeleteCall(ruleId, ifMatch, ifUnmodifiedSince, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete a Custom Rule
     * Delete a Custom Rule. We need to provide the Id of the policy as a path parameter.  **NOTE:** * Only super tenant users are allowed for this operation. 
     * @param ruleId Custom rule UUID  (required)
     * @param ifMatch Validator for conditional requests; based on ETag (Will be supported in future).  (optional)
     * @param ifUnmodifiedSince Validator for conditional requests; based on Last Modified header (Will be supported in future).  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void throttlingPoliciesCustomRuleIdDelete(String ruleId, String ifMatch, String ifUnmodifiedSince) throws ApiException {
        throttlingPoliciesCustomRuleIdDeleteWithHttpInfo(ruleId, ifMatch, ifUnmodifiedSince);
    }

    /**
     * Delete a Custom Rule
     * Delete a Custom Rule. We need to provide the Id of the policy as a path parameter.  **NOTE:** * Only super tenant users are allowed for this operation. 
     * @param ruleId Custom rule UUID  (required)
     * @param ifMatch Validator for conditional requests; based on ETag (Will be supported in future).  (optional)
     * @param ifUnmodifiedSince Validator for conditional requests; based on Last Modified header (Will be supported in future).  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> throttlingPoliciesCustomRuleIdDeleteWithHttpInfo(String ruleId, String ifMatch, String ifUnmodifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = throttlingPoliciesCustomRuleIdDeleteValidateBeforeCall(ruleId, ifMatch, ifUnmodifiedSince, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete a Custom Rule (asynchronously)
     * Delete a Custom Rule. We need to provide the Id of the policy as a path parameter.  **NOTE:** * Only super tenant users are allowed for this operation. 
     * @param ruleId Custom rule UUID  (required)
     * @param ifMatch Validator for conditional requests; based on ETag (Will be supported in future).  (optional)
     * @param ifUnmodifiedSince Validator for conditional requests; based on Last Modified header (Will be supported in future).  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call throttlingPoliciesCustomRuleIdDeleteAsync(String ruleId, String ifMatch, String ifUnmodifiedSince, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = throttlingPoliciesCustomRuleIdDeleteValidateBeforeCall(ruleId, ifMatch, ifUnmodifiedSince, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for throttlingPoliciesCustomRuleIdGet
     * @param ruleId Custom rule UUID  (required)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resource (Will be supported in future).  (optional)
     * @param ifModifiedSince Validator for conditional requests; based on Last Modified header of the formerly retrieved variant of the resource (Will be supported in future).  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call throttlingPoliciesCustomRuleIdGetCall(String ruleId, String ifNoneMatch, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/throttling/policies/custom/{ruleId}"
            .replaceAll("\\{" + "ruleId" + "\\}", apiClient.escapeString(ruleId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

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

        String[] localVarAuthNames = new String[] { "OAuth2Security" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call throttlingPoliciesCustomRuleIdGetValidateBeforeCall(String ruleId, String ifNoneMatch, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'ruleId' is set
        if (ruleId == null) {
            throw new ApiException("Missing the required parameter 'ruleId' when calling throttlingPoliciesCustomRuleIdGet(Async)");
        }
        

        com.squareup.okhttp.Call call = throttlingPoliciesCustomRuleIdGetCall(ruleId, ifNoneMatch, ifModifiedSince, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get a Custom Rule
     * Retrieves a Custom Rule. We need to provide the policy Id as a path parameter.  **NOTE:** * Only super tenant users are allowed for this operation. 
     * @param ruleId Custom rule UUID  (required)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resource (Will be supported in future).  (optional)
     * @param ifModifiedSince Validator for conditional requests; based on Last Modified header of the formerly retrieved variant of the resource (Will be supported in future).  (optional)
     * @return CustomRuleDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CustomRuleDTO throttlingPoliciesCustomRuleIdGet(String ruleId, String ifNoneMatch, String ifModifiedSince) throws ApiException {
        ApiResponse<CustomRuleDTO> resp = throttlingPoliciesCustomRuleIdGetWithHttpInfo(ruleId, ifNoneMatch, ifModifiedSince);
        return resp.getData();
    }

    /**
     * Get a Custom Rule
     * Retrieves a Custom Rule. We need to provide the policy Id as a path parameter.  **NOTE:** * Only super tenant users are allowed for this operation. 
     * @param ruleId Custom rule UUID  (required)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resource (Will be supported in future).  (optional)
     * @param ifModifiedSince Validator for conditional requests; based on Last Modified header of the formerly retrieved variant of the resource (Will be supported in future).  (optional)
     * @return ApiResponse&lt;CustomRuleDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CustomRuleDTO> throttlingPoliciesCustomRuleIdGetWithHttpInfo(String ruleId, String ifNoneMatch, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = throttlingPoliciesCustomRuleIdGetValidateBeforeCall(ruleId, ifNoneMatch, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<CustomRuleDTO>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a Custom Rule (asynchronously)
     * Retrieves a Custom Rule. We need to provide the policy Id as a path parameter.  **NOTE:** * Only super tenant users are allowed for this operation. 
     * @param ruleId Custom rule UUID  (required)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resource (Will be supported in future).  (optional)
     * @param ifModifiedSince Validator for conditional requests; based on Last Modified header of the formerly retrieved variant of the resource (Will be supported in future).  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call throttlingPoliciesCustomRuleIdGetAsync(String ruleId, String ifNoneMatch, String ifModifiedSince, final ApiCallback<CustomRuleDTO> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = throttlingPoliciesCustomRuleIdGetValidateBeforeCall(ruleId, ifNoneMatch, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CustomRuleDTO>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for throttlingPoliciesCustomRuleIdPut
     * @param ruleId Custom rule UUID  (required)
     * @param body Policy object that needs to be modified  (required)
     * @param contentType Media type of the entity in the body. Default is application/json.  (required)
     * @param ifMatch Validator for conditional requests; based on ETag (Will be supported in future).  (optional)
     * @param ifUnmodifiedSince Validator for conditional requests; based on Last Modified header (Will be supported in future).  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call throttlingPoliciesCustomRuleIdPutCall(String ruleId, CustomRuleDTO body, String contentType, String ifMatch, String ifUnmodifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/throttling/policies/custom/{ruleId}"
            .replaceAll("\\{" + "ruleId" + "\\}", apiClient.escapeString(ruleId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

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

        String[] localVarAuthNames = new String[] { "OAuth2Security" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call throttlingPoliciesCustomRuleIdPutValidateBeforeCall(String ruleId, CustomRuleDTO body, String contentType, String ifMatch, String ifUnmodifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'ruleId' is set
        if (ruleId == null) {
            throw new ApiException("Missing the required parameter 'ruleId' when calling throttlingPoliciesCustomRuleIdPut(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling throttlingPoliciesCustomRuleIdPut(Async)");
        }
        
        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new ApiException("Missing the required parameter 'contentType' when calling throttlingPoliciesCustomRuleIdPut(Async)");
        }
        

        com.squareup.okhttp.Call call = throttlingPoliciesCustomRuleIdPutCall(ruleId, body, contentType, ifMatch, ifUnmodifiedSince, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Update a Custom Rule
     * Updates an existing Custom Rule.  **NOTE:** * Only super tenant users are allowed for this operation. 
     * @param ruleId Custom rule UUID  (required)
     * @param body Policy object that needs to be modified  (required)
     * @param contentType Media type of the entity in the body. Default is application/json.  (required)
     * @param ifMatch Validator for conditional requests; based on ETag (Will be supported in future).  (optional)
     * @param ifUnmodifiedSince Validator for conditional requests; based on Last Modified header (Will be supported in future).  (optional)
     * @return CustomRuleDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CustomRuleDTO throttlingPoliciesCustomRuleIdPut(String ruleId, CustomRuleDTO body, String contentType, String ifMatch, String ifUnmodifiedSince) throws ApiException {
        ApiResponse<CustomRuleDTO> resp = throttlingPoliciesCustomRuleIdPutWithHttpInfo(ruleId, body, contentType, ifMatch, ifUnmodifiedSince);
        return resp.getData();
    }

    /**
     * Update a Custom Rule
     * Updates an existing Custom Rule.  **NOTE:** * Only super tenant users are allowed for this operation. 
     * @param ruleId Custom rule UUID  (required)
     * @param body Policy object that needs to be modified  (required)
     * @param contentType Media type of the entity in the body. Default is application/json.  (required)
     * @param ifMatch Validator for conditional requests; based on ETag (Will be supported in future).  (optional)
     * @param ifUnmodifiedSince Validator for conditional requests; based on Last Modified header (Will be supported in future).  (optional)
     * @return ApiResponse&lt;CustomRuleDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CustomRuleDTO> throttlingPoliciesCustomRuleIdPutWithHttpInfo(String ruleId, CustomRuleDTO body, String contentType, String ifMatch, String ifUnmodifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = throttlingPoliciesCustomRuleIdPutValidateBeforeCall(ruleId, body, contentType, ifMatch, ifUnmodifiedSince, null, null);
        Type localVarReturnType = new TypeToken<CustomRuleDTO>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update a Custom Rule (asynchronously)
     * Updates an existing Custom Rule.  **NOTE:** * Only super tenant users are allowed for this operation. 
     * @param ruleId Custom rule UUID  (required)
     * @param body Policy object that needs to be modified  (required)
     * @param contentType Media type of the entity in the body. Default is application/json.  (required)
     * @param ifMatch Validator for conditional requests; based on ETag (Will be supported in future).  (optional)
     * @param ifUnmodifiedSince Validator for conditional requests; based on Last Modified header (Will be supported in future).  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call throttlingPoliciesCustomRuleIdPutAsync(String ruleId, CustomRuleDTO body, String contentType, String ifMatch, String ifUnmodifiedSince, final ApiCallback<CustomRuleDTO> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = throttlingPoliciesCustomRuleIdPutValidateBeforeCall(ruleId, body, contentType, ifMatch, ifUnmodifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CustomRuleDTO>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
