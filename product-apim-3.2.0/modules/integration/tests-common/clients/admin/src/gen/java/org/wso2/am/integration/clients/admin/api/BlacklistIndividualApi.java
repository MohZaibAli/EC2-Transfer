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


import org.wso2.am.integration.clients.admin.api.dto.BlockingConditionDTO;
import org.wso2.am.integration.clients.admin.api.dto.BlockingConditionStatusDTO;
import org.wso2.am.integration.clients.admin.api.dto.ErrorDTO;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BlacklistIndividualApi {
    private ApiClient apiClient;

    public BlacklistIndividualApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BlacklistIndividualApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for throttlingBlacklistConditionIdDelete
     * @param conditionId Blocking condition identifier  (required)
     * @param ifMatch Validator for conditional requests; based on ETag (Will be supported in future).  (optional)
     * @param ifUnmodifiedSince Validator for conditional requests; based on Last Modified header (Will be supported in future).  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call throttlingBlacklistConditionIdDeleteCall(String conditionId, String ifMatch, String ifUnmodifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/throttling/blacklist/{conditionId}"
            .replaceAll("\\{" + "conditionId" + "\\}", apiClient.escapeString(conditionId.toString()));

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
    private com.squareup.okhttp.Call throttlingBlacklistConditionIdDeleteValidateBeforeCall(String conditionId, String ifMatch, String ifUnmodifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'conditionId' is set
        if (conditionId == null) {
            throw new ApiException("Missing the required parameter 'conditionId' when calling throttlingBlacklistConditionIdDelete(Async)");
        }
        

        com.squareup.okhttp.Call call = throttlingBlacklistConditionIdDeleteCall(conditionId, ifMatch, ifUnmodifiedSince, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete a Blocking condition
     * Deletes an existing Blocking condition 
     * @param conditionId Blocking condition identifier  (required)
     * @param ifMatch Validator for conditional requests; based on ETag (Will be supported in future).  (optional)
     * @param ifUnmodifiedSince Validator for conditional requests; based on Last Modified header (Will be supported in future).  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void throttlingBlacklistConditionIdDelete(String conditionId, String ifMatch, String ifUnmodifiedSince) throws ApiException {
        throttlingBlacklistConditionIdDeleteWithHttpInfo(conditionId, ifMatch, ifUnmodifiedSince);
    }

    /**
     * Delete a Blocking condition
     * Deletes an existing Blocking condition 
     * @param conditionId Blocking condition identifier  (required)
     * @param ifMatch Validator for conditional requests; based on ETag (Will be supported in future).  (optional)
     * @param ifUnmodifiedSince Validator for conditional requests; based on Last Modified header (Will be supported in future).  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> throttlingBlacklistConditionIdDeleteWithHttpInfo(String conditionId, String ifMatch, String ifUnmodifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = throttlingBlacklistConditionIdDeleteValidateBeforeCall(conditionId, ifMatch, ifUnmodifiedSince, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete a Blocking condition (asynchronously)
     * Deletes an existing Blocking condition 
     * @param conditionId Blocking condition identifier  (required)
     * @param ifMatch Validator for conditional requests; based on ETag (Will be supported in future).  (optional)
     * @param ifUnmodifiedSince Validator for conditional requests; based on Last Modified header (Will be supported in future).  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call throttlingBlacklistConditionIdDeleteAsync(String conditionId, String ifMatch, String ifUnmodifiedSince, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = throttlingBlacklistConditionIdDeleteValidateBeforeCall(conditionId, ifMatch, ifUnmodifiedSince, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for throttlingBlacklistConditionIdGet
     * @param conditionId Blocking condition identifier  (required)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resource (Will be supported in future).  (optional)
     * @param ifModifiedSince Validator for conditional requests; based on Last Modified header of the formerly retrieved variant of the resource (Will be supported in future).  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call throttlingBlacklistConditionIdGetCall(String conditionId, String ifNoneMatch, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/throttling/blacklist/{conditionId}"
            .replaceAll("\\{" + "conditionId" + "\\}", apiClient.escapeString(conditionId.toString()));

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
    private com.squareup.okhttp.Call throttlingBlacklistConditionIdGetValidateBeforeCall(String conditionId, String ifNoneMatch, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'conditionId' is set
        if (conditionId == null) {
            throw new ApiException("Missing the required parameter 'conditionId' when calling throttlingBlacklistConditionIdGet(Async)");
        }
        

        com.squareup.okhttp.Call call = throttlingBlacklistConditionIdGetCall(conditionId, ifNoneMatch, ifModifiedSince, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get a Blocking Condition
     * Retrieves a Blocking Condition providing the condition Id 
     * @param conditionId Blocking condition identifier  (required)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resource (Will be supported in future).  (optional)
     * @param ifModifiedSince Validator for conditional requests; based on Last Modified header of the formerly retrieved variant of the resource (Will be supported in future).  (optional)
     * @return BlockingConditionDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public BlockingConditionDTO throttlingBlacklistConditionIdGet(String conditionId, String ifNoneMatch, String ifModifiedSince) throws ApiException {
        ApiResponse<BlockingConditionDTO> resp = throttlingBlacklistConditionIdGetWithHttpInfo(conditionId, ifNoneMatch, ifModifiedSince);
        return resp.getData();
    }

    /**
     * Get a Blocking Condition
     * Retrieves a Blocking Condition providing the condition Id 
     * @param conditionId Blocking condition identifier  (required)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resource (Will be supported in future).  (optional)
     * @param ifModifiedSince Validator for conditional requests; based on Last Modified header of the formerly retrieved variant of the resource (Will be supported in future).  (optional)
     * @return ApiResponse&lt;BlockingConditionDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BlockingConditionDTO> throttlingBlacklistConditionIdGetWithHttpInfo(String conditionId, String ifNoneMatch, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = throttlingBlacklistConditionIdGetValidateBeforeCall(conditionId, ifNoneMatch, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<BlockingConditionDTO>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a Blocking Condition (asynchronously)
     * Retrieves a Blocking Condition providing the condition Id 
     * @param conditionId Blocking condition identifier  (required)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resource (Will be supported in future).  (optional)
     * @param ifModifiedSince Validator for conditional requests; based on Last Modified header of the formerly retrieved variant of the resource (Will be supported in future).  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call throttlingBlacklistConditionIdGetAsync(String conditionId, String ifNoneMatch, String ifModifiedSince, final ApiCallback<BlockingConditionDTO> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = throttlingBlacklistConditionIdGetValidateBeforeCall(conditionId, ifNoneMatch, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BlockingConditionDTO>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for throttlingBlacklistConditionIdPatch
     * @param conditionId Blocking condition identifier  (required)
     * @param body Blocking condition with updated status  (required)
     * @param contentType Media type of the entity in the body. Default is application/json.  (required)
     * @param ifMatch Validator for conditional requests; based on ETag (Will be supported in future).  (optional)
     * @param ifUnmodifiedSince Validator for conditional requests; based on Last Modified header (Will be supported in future).  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call throttlingBlacklistConditionIdPatchCall(String conditionId, BlockingConditionStatusDTO body, String contentType, String ifMatch, String ifUnmodifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/throttling/blacklist/{conditionId}"
            .replaceAll("\\{" + "conditionId" + "\\}", apiClient.escapeString(conditionId.toString()));

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
        return apiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call throttlingBlacklistConditionIdPatchValidateBeforeCall(String conditionId, BlockingConditionStatusDTO body, String contentType, String ifMatch, String ifUnmodifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'conditionId' is set
        if (conditionId == null) {
            throw new ApiException("Missing the required parameter 'conditionId' when calling throttlingBlacklistConditionIdPatch(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling throttlingBlacklistConditionIdPatch(Async)");
        }
        
        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new ApiException("Missing the required parameter 'contentType' when calling throttlingBlacklistConditionIdPatch(Async)");
        }
        

        com.squareup.okhttp.Call call = throttlingBlacklistConditionIdPatchCall(conditionId, body, contentType, ifMatch, ifUnmodifiedSince, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Update a blocking condition
     * Update a blocking condition by Id 
     * @param conditionId Blocking condition identifier  (required)
     * @param body Blocking condition with updated status  (required)
     * @param contentType Media type of the entity in the body. Default is application/json.  (required)
     * @param ifMatch Validator for conditional requests; based on ETag (Will be supported in future).  (optional)
     * @param ifUnmodifiedSince Validator for conditional requests; based on Last Modified header (Will be supported in future).  (optional)
     * @return BlockingConditionDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public BlockingConditionDTO throttlingBlacklistConditionIdPatch(String conditionId, BlockingConditionStatusDTO body, String contentType, String ifMatch, String ifUnmodifiedSince) throws ApiException {
        ApiResponse<BlockingConditionDTO> resp = throttlingBlacklistConditionIdPatchWithHttpInfo(conditionId, body, contentType, ifMatch, ifUnmodifiedSince);
        return resp.getData();
    }

    /**
     * Update a blocking condition
     * Update a blocking condition by Id 
     * @param conditionId Blocking condition identifier  (required)
     * @param body Blocking condition with updated status  (required)
     * @param contentType Media type of the entity in the body. Default is application/json.  (required)
     * @param ifMatch Validator for conditional requests; based on ETag (Will be supported in future).  (optional)
     * @param ifUnmodifiedSince Validator for conditional requests; based on Last Modified header (Will be supported in future).  (optional)
     * @return ApiResponse&lt;BlockingConditionDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BlockingConditionDTO> throttlingBlacklistConditionIdPatchWithHttpInfo(String conditionId, BlockingConditionStatusDTO body, String contentType, String ifMatch, String ifUnmodifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = throttlingBlacklistConditionIdPatchValidateBeforeCall(conditionId, body, contentType, ifMatch, ifUnmodifiedSince, null, null);
        Type localVarReturnType = new TypeToken<BlockingConditionDTO>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update a blocking condition (asynchronously)
     * Update a blocking condition by Id 
     * @param conditionId Blocking condition identifier  (required)
     * @param body Blocking condition with updated status  (required)
     * @param contentType Media type of the entity in the body. Default is application/json.  (required)
     * @param ifMatch Validator for conditional requests; based on ETag (Will be supported in future).  (optional)
     * @param ifUnmodifiedSince Validator for conditional requests; based on Last Modified header (Will be supported in future).  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call throttlingBlacklistConditionIdPatchAsync(String conditionId, BlockingConditionStatusDTO body, String contentType, String ifMatch, String ifUnmodifiedSince, final ApiCallback<BlockingConditionDTO> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = throttlingBlacklistConditionIdPatchValidateBeforeCall(conditionId, body, contentType, ifMatch, ifUnmodifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BlockingConditionDTO>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
