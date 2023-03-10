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


import org.wso2.am.integration.clients.admin.api.dto.ApplicationListDTO;
import org.wso2.am.integration.clients.admin.api.dto.ErrorDTO;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApplicationCollectionApi {
    private ApiClient apiClient;

    public ApplicationCollectionApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ApplicationCollectionApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for applicationsGet
     * @param user username of the application creator  (optional)
     * @param limit Maximum size of resource array to return.  (optional, default to 25)
     * @param offset Starting point within the complete list of items qualified.  (optional, default to 0)
     * @param accept Media types acceptable for the response. Default is application/json.  (optional, default to application/json)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resource (Will be supported in future).  (optional)
     * @param tenantDomain Tenant domain of the applications to get. This has to be specified only if require to get applications of another tenant other than the requester&#39;s tenant. So, if not specified, the default will be set as the requester&#39;s tenant domain. This cross tenant Application access is allowed only for super tenant admin users only at a migration process.  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call applicationsGetCall(String user, Integer limit, Integer offset, String accept, String ifNoneMatch, String tenantDomain, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/applications";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (user != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("user", user));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
        if (tenantDomain != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("tenantDomain", tenantDomain));

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

        String[] localVarAuthNames = new String[] { "OAuth2Security" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call applicationsGetValidateBeforeCall(String user, Integer limit, Integer offset, String accept, String ifNoneMatch, String tenantDomain, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = applicationsGetCall(user, limit, offset, accept, ifNoneMatch, tenantDomain, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieve/Search applications 
     * This operation can be used to retrieve list of applications that is belonged to the given user, If no user is provided then the application for the user associated with the provided access token will be returned. 
     * @param user username of the application creator  (optional)
     * @param limit Maximum size of resource array to return.  (optional, default to 25)
     * @param offset Starting point within the complete list of items qualified.  (optional, default to 0)
     * @param accept Media types acceptable for the response. Default is application/json.  (optional, default to application/json)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resource (Will be supported in future).  (optional)
     * @param tenantDomain Tenant domain of the applications to get. This has to be specified only if require to get applications of another tenant other than the requester&#39;s tenant. So, if not specified, the default will be set as the requester&#39;s tenant domain. This cross tenant Application access is allowed only for super tenant admin users only at a migration process.  (optional)
     * @return ApplicationListDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApplicationListDTO applicationsGet(String user, Integer limit, Integer offset, String accept, String ifNoneMatch, String tenantDomain) throws ApiException {
        ApiResponse<ApplicationListDTO> resp = applicationsGetWithHttpInfo(user, limit, offset, accept, ifNoneMatch, tenantDomain);
        return resp.getData();
    }

    /**
     * Retrieve/Search applications 
     * This operation can be used to retrieve list of applications that is belonged to the given user, If no user is provided then the application for the user associated with the provided access token will be returned. 
     * @param user username of the application creator  (optional)
     * @param limit Maximum size of resource array to return.  (optional, default to 25)
     * @param offset Starting point within the complete list of items qualified.  (optional, default to 0)
     * @param accept Media types acceptable for the response. Default is application/json.  (optional, default to application/json)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resource (Will be supported in future).  (optional)
     * @param tenantDomain Tenant domain of the applications to get. This has to be specified only if require to get applications of another tenant other than the requester&#39;s tenant. So, if not specified, the default will be set as the requester&#39;s tenant domain. This cross tenant Application access is allowed only for super tenant admin users only at a migration process.  (optional)
     * @return ApiResponse&lt;ApplicationListDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApplicationListDTO> applicationsGetWithHttpInfo(String user, Integer limit, Integer offset, String accept, String ifNoneMatch, String tenantDomain) throws ApiException {
        com.squareup.okhttp.Call call = applicationsGetValidateBeforeCall(user, limit, offset, accept, ifNoneMatch, tenantDomain, null, null);
        Type localVarReturnType = new TypeToken<ApplicationListDTO>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieve/Search applications  (asynchronously)
     * This operation can be used to retrieve list of applications that is belonged to the given user, If no user is provided then the application for the user associated with the provided access token will be returned. 
     * @param user username of the application creator  (optional)
     * @param limit Maximum size of resource array to return.  (optional, default to 25)
     * @param offset Starting point within the complete list of items qualified.  (optional, default to 0)
     * @param accept Media types acceptable for the response. Default is application/json.  (optional, default to application/json)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resource (Will be supported in future).  (optional)
     * @param tenantDomain Tenant domain of the applications to get. This has to be specified only if require to get applications of another tenant other than the requester&#39;s tenant. So, if not specified, the default will be set as the requester&#39;s tenant domain. This cross tenant Application access is allowed only for super tenant admin users only at a migration process.  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call applicationsGetAsync(String user, Integer limit, Integer offset, String accept, String ifNoneMatch, String tenantDomain, final ApiCallback<ApplicationListDTO> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = applicationsGetValidateBeforeCall(user, limit, offset, accept, ifNoneMatch, tenantDomain, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApplicationListDTO>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
