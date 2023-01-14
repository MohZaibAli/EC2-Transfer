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


import org.wso2.am.integration.clients.admin.api.dto.ErrorDTO;
import org.wso2.am.integration.clients.admin.api.dto.KeyManagerDTO;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeyManagerIndividualApi {
    private ApiClient apiClient;

    public KeyManagerIndividualApi() {
        this(Configuration.getDefaultApiClient());
    }

    public KeyManagerIndividualApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for keyManagersKeyManagerIdDelete
     * @param keyManagerId Key Manager UUID  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call keyManagersKeyManagerIdDeleteCall(String keyManagerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/key-managers/{keyManagerId}"
            .replaceAll("\\{" + "keyManagerId" + "\\}", apiClient.escapeString(keyManagerId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

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
    private com.squareup.okhttp.Call keyManagersKeyManagerIdDeleteValidateBeforeCall(String keyManagerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'keyManagerId' is set
        if (keyManagerId == null) {
            throw new ApiException("Missing the required parameter 'keyManagerId' when calling keyManagersKeyManagerIdDelete(Async)");
        }
        

        com.squareup.okhttp.Call call = keyManagersKeyManagerIdDeleteCall(keyManagerId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete a Key Manager
     * Delete a Key Manager by keyManager id 
     * @param keyManagerId Key Manager UUID  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void keyManagersKeyManagerIdDelete(String keyManagerId) throws ApiException {
        keyManagersKeyManagerIdDeleteWithHttpInfo(keyManagerId);
    }

    /**
     * Delete a Key Manager
     * Delete a Key Manager by keyManager id 
     * @param keyManagerId Key Manager UUID  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> keyManagersKeyManagerIdDeleteWithHttpInfo(String keyManagerId) throws ApiException {
        com.squareup.okhttp.Call call = keyManagersKeyManagerIdDeleteValidateBeforeCall(keyManagerId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete a Key Manager (asynchronously)
     * Delete a Key Manager by keyManager id 
     * @param keyManagerId Key Manager UUID  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call keyManagersKeyManagerIdDeleteAsync(String keyManagerId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = keyManagersKeyManagerIdDeleteValidateBeforeCall(keyManagerId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for keyManagersKeyManagerIdGet
     * @param keyManagerId Key Manager UUID  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call keyManagersKeyManagerIdGetCall(String keyManagerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/key-managers/{keyManagerId}"
            .replaceAll("\\{" + "keyManagerId" + "\\}", apiClient.escapeString(keyManagerId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

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
    private com.squareup.okhttp.Call keyManagersKeyManagerIdGetValidateBeforeCall(String keyManagerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'keyManagerId' is set
        if (keyManagerId == null) {
            throw new ApiException("Missing the required parameter 'keyManagerId' when calling keyManagersKeyManagerIdGet(Async)");
        }
        

        com.squareup.okhttp.Call call = keyManagersKeyManagerIdGetCall(keyManagerId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get a Key Manager Configuration
     * Retrieve a single Key Manager Configuration. We should provide the Id of the KeyManager as a path parameter. 
     * @param keyManagerId Key Manager UUID  (required)
     * @return KeyManagerDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public KeyManagerDTO keyManagersKeyManagerIdGet(String keyManagerId) throws ApiException {
        ApiResponse<KeyManagerDTO> resp = keyManagersKeyManagerIdGetWithHttpInfo(keyManagerId);
        return resp.getData();
    }

    /**
     * Get a Key Manager Configuration
     * Retrieve a single Key Manager Configuration. We should provide the Id of the KeyManager as a path parameter. 
     * @param keyManagerId Key Manager UUID  (required)
     * @return ApiResponse&lt;KeyManagerDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<KeyManagerDTO> keyManagersKeyManagerIdGetWithHttpInfo(String keyManagerId) throws ApiException {
        com.squareup.okhttp.Call call = keyManagersKeyManagerIdGetValidateBeforeCall(keyManagerId, null, null);
        Type localVarReturnType = new TypeToken<KeyManagerDTO>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a Key Manager Configuration (asynchronously)
     * Retrieve a single Key Manager Configuration. We should provide the Id of the KeyManager as a path parameter. 
     * @param keyManagerId Key Manager UUID  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call keyManagersKeyManagerIdGetAsync(String keyManagerId, final ApiCallback<KeyManagerDTO> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = keyManagersKeyManagerIdGetValidateBeforeCall(keyManagerId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<KeyManagerDTO>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for keyManagersKeyManagerIdPut
     * @param keyManagerId Key Manager UUID  (required)
     * @param body Key Manager object with updated information  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call keyManagersKeyManagerIdPutCall(String keyManagerId, KeyManagerDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/key-managers/{keyManagerId}"
            .replaceAll("\\{" + "keyManagerId" + "\\}", apiClient.escapeString(keyManagerId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

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
    private com.squareup.okhttp.Call keyManagersKeyManagerIdPutValidateBeforeCall(String keyManagerId, KeyManagerDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'keyManagerId' is set
        if (keyManagerId == null) {
            throw new ApiException("Missing the required parameter 'keyManagerId' when calling keyManagersKeyManagerIdPut(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling keyManagersKeyManagerIdPut(Async)");
        }
        

        com.squareup.okhttp.Call call = keyManagersKeyManagerIdPutCall(keyManagerId, body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Update a Key Manager
     * Update a Key Manager by keyManager id 
     * @param keyManagerId Key Manager UUID  (required)
     * @param body Key Manager object with updated information  (required)
     * @return KeyManagerDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public KeyManagerDTO keyManagersKeyManagerIdPut(String keyManagerId, KeyManagerDTO body) throws ApiException {
        ApiResponse<KeyManagerDTO> resp = keyManagersKeyManagerIdPutWithHttpInfo(keyManagerId, body);
        return resp.getData();
    }

    /**
     * Update a Key Manager
     * Update a Key Manager by keyManager id 
     * @param keyManagerId Key Manager UUID  (required)
     * @param body Key Manager object with updated information  (required)
     * @return ApiResponse&lt;KeyManagerDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<KeyManagerDTO> keyManagersKeyManagerIdPutWithHttpInfo(String keyManagerId, KeyManagerDTO body) throws ApiException {
        com.squareup.okhttp.Call call = keyManagersKeyManagerIdPutValidateBeforeCall(keyManagerId, body, null, null);
        Type localVarReturnType = new TypeToken<KeyManagerDTO>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update a Key Manager (asynchronously)
     * Update a Key Manager by keyManager id 
     * @param keyManagerId Key Manager UUID  (required)
     * @param body Key Manager object with updated information  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call keyManagersKeyManagerIdPutAsync(String keyManagerId, KeyManagerDTO body, final ApiCallback<KeyManagerDTO> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = keyManagersKeyManagerIdPutValidateBeforeCall(keyManagerId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<KeyManagerDTO>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
