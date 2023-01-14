/*
 * 0CodeAPI Manager - Store
 * This document specifies a **RESTful API** for WSO2 **API Manager** - Store.  It is written with [swagger 2](http://swagger.io/). 
 *
 * OpenAPI spec version: v1.1
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.am.integration.clients.store.api.v1;

import org.wso2.am.integration.clients.store.api.ApiCallback;
import org.wso2.am.integration.clients.store.api.ApiClient;
import org.wso2.am.integration.clients.store.api.ApiException;
import org.wso2.am.integration.clients.store.api.ApiResponse;
import org.wso2.am.integration.clients.store.api.Configuration;
import org.wso2.am.integration.clients.store.api.Pair;
import org.wso2.am.integration.clients.store.api.ProgressRequestBody;
import org.wso2.am.integration.clients.store.api.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.wso2.am.integration.clients.store.api.v1.dto.ErrorDTO;
import org.wso2.am.integration.clients.store.api.v1.dto.ThrottlingPolicyDTO;
import org.wso2.am.integration.clients.store.api.v1.dto.ThrottlingPolicyListDTO;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThrottlingPoliciesApi {
    private ApiClient apiClient;

    public ThrottlingPoliciesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ThrottlingPoliciesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for throttlingPoliciesPolicyLevelGet
     * @param policyLevel List Application or Subscription type thro.  (required)
     * @param limit Maximum size of resource array to return.  (optional, default to 25)
     * @param offset Starting point within the complete list of items qualified.  (optional, default to 0)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec.  (optional)
     * @param xWSO2Tenant For cross-tenant invocations, this is used to specify the tenant domain, where the resource need to be   retirieved from.  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call throttlingPoliciesPolicyLevelGetCall(String policyLevel, Integer limit, Integer offset, String ifNoneMatch, String xWSO2Tenant, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/throttling-policies/{policyLevel}"
            .replaceAll("\\{" + "policyLevel" + "\\}", apiClient.escapeString(policyLevel.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifNoneMatch != null)
        localVarHeaderParams.put("If-None-Match", apiClient.parameterToString(ifNoneMatch));
        if (xWSO2Tenant != null)
        localVarHeaderParams.put("X-WSO2-Tenant", apiClient.parameterToString(xWSO2Tenant));

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
    private com.squareup.okhttp.Call throttlingPoliciesPolicyLevelGetValidateBeforeCall(String policyLevel, Integer limit, Integer offset, String ifNoneMatch, String xWSO2Tenant, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'policyLevel' is set
        if (policyLevel == null) {
            throw new ApiException("Missing the required parameter 'policyLevel' when calling throttlingPoliciesPolicyLevelGet(Async)");
        }
        

        com.squareup.okhttp.Call call = throttlingPoliciesPolicyLevelGetCall(policyLevel, limit, offset, ifNoneMatch, xWSO2Tenant, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get all available throttling policies
     * Get available Throttling Policies 
     * @param policyLevel List Application or Subscription type thro.  (required)
     * @param limit Maximum size of resource array to return.  (optional, default to 25)
     * @param offset Starting point within the complete list of items qualified.  (optional, default to 0)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec.  (optional)
     * @param xWSO2Tenant For cross-tenant invocations, this is used to specify the tenant domain, where the resource need to be   retirieved from.  (optional)
     * @return List&lt;ThrottlingPolicyListDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<ThrottlingPolicyListDTO> throttlingPoliciesPolicyLevelGet(String policyLevel, Integer limit, Integer offset, String ifNoneMatch, String xWSO2Tenant) throws ApiException {
        ApiResponse<List<ThrottlingPolicyListDTO>> resp = throttlingPoliciesPolicyLevelGetWithHttpInfo(policyLevel, limit, offset, ifNoneMatch, xWSO2Tenant);
        return resp.getData();
    }

    /**
     * Get all available throttling policies
     * Get available Throttling Policies 
     * @param policyLevel List Application or Subscription type thro.  (required)
     * @param limit Maximum size of resource array to return.  (optional, default to 25)
     * @param offset Starting point within the complete list of items qualified.  (optional, default to 0)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec.  (optional)
     * @param xWSO2Tenant For cross-tenant invocations, this is used to specify the tenant domain, where the resource need to be   retirieved from.  (optional)
     * @return ApiResponse&lt;List&lt;ThrottlingPolicyListDTO&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<ThrottlingPolicyListDTO>> throttlingPoliciesPolicyLevelGetWithHttpInfo(String policyLevel, Integer limit, Integer offset, String ifNoneMatch, String xWSO2Tenant) throws ApiException {
        com.squareup.okhttp.Call call = throttlingPoliciesPolicyLevelGetValidateBeforeCall(policyLevel, limit, offset, ifNoneMatch, xWSO2Tenant, null, null);
        Type localVarReturnType = new TypeToken<List<ThrottlingPolicyListDTO>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get all available throttling policies (asynchronously)
     * Get available Throttling Policies 
     * @param policyLevel List Application or Subscription type thro.  (required)
     * @param limit Maximum size of resource array to return.  (optional, default to 25)
     * @param offset Starting point within the complete list of items qualified.  (optional, default to 0)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec.  (optional)
     * @param xWSO2Tenant For cross-tenant invocations, this is used to specify the tenant domain, where the resource need to be   retirieved from.  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call throttlingPoliciesPolicyLevelGetAsync(String policyLevel, Integer limit, Integer offset, String ifNoneMatch, String xWSO2Tenant, final ApiCallback<List<ThrottlingPolicyListDTO>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = throttlingPoliciesPolicyLevelGetValidateBeforeCall(policyLevel, limit, offset, ifNoneMatch, xWSO2Tenant, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<ThrottlingPolicyListDTO>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for throttlingPoliciesPolicyLevelPolicyIdGet
     * @param policyId Policy Id represented as a UUID  (required)
     * @param policyLevel List Application or Subscription type thro.  (required)
     * @param xWSO2Tenant For cross-tenant invocations, this is used to specify the tenant domain, where the resource need to be   retirieved from.  (optional)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec.  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call throttlingPoliciesPolicyLevelPolicyIdGetCall(String policyId, String policyLevel, String xWSO2Tenant, String ifNoneMatch, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/throttling-policies/{policyLevel}/{policyId}"
            .replaceAll("\\{" + "policyId" + "\\}", apiClient.escapeString(policyId.toString()))
            .replaceAll("\\{" + "policyLevel" + "\\}", apiClient.escapeString(policyLevel.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xWSO2Tenant != null)
        localVarHeaderParams.put("X-WSO2-Tenant", apiClient.parameterToString(xWSO2Tenant));
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
    private com.squareup.okhttp.Call throttlingPoliciesPolicyLevelPolicyIdGetValidateBeforeCall(String policyId, String policyLevel, String xWSO2Tenant, String ifNoneMatch, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'policyId' is set
        if (policyId == null) {
            throw new ApiException("Missing the required parameter 'policyId' when calling throttlingPoliciesPolicyLevelPolicyIdGet(Async)");
        }
        
        // verify the required parameter 'policyLevel' is set
        if (policyLevel == null) {
            throw new ApiException("Missing the required parameter 'policyLevel' when calling throttlingPoliciesPolicyLevelPolicyIdGet(Async)");
        }
        

        com.squareup.okhttp.Call call = throttlingPoliciesPolicyLevelPolicyIdGetCall(policyId, policyLevel, xWSO2Tenant, ifNoneMatch, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get details of a throttling policy 
     * This operation can be used to retrieve details of a single throttling policy by specifying the policy level and policy name.  &#x60;X-WSO2-Tenant&#x60; header can be used to retrive throttling policy that belongs to a different tenant domain. If not specified super tenant will be used. If Authorization header is present in the request, the user&#39;s tenant associated with the access token will be used. 
     * @param policyId Policy Id represented as a UUID  (required)
     * @param policyLevel List Application or Subscription type thro.  (required)
     * @param xWSO2Tenant For cross-tenant invocations, this is used to specify the tenant domain, where the resource need to be   retirieved from.  (optional)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec.  (optional)
     * @return ThrottlingPolicyDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ThrottlingPolicyDTO throttlingPoliciesPolicyLevelPolicyIdGet(String policyId, String policyLevel, String xWSO2Tenant, String ifNoneMatch) throws ApiException {
        ApiResponse<ThrottlingPolicyDTO> resp = throttlingPoliciesPolicyLevelPolicyIdGetWithHttpInfo(policyId, policyLevel, xWSO2Tenant, ifNoneMatch);
        return resp.getData();
    }

    /**
     * Get details of a throttling policy 
     * This operation can be used to retrieve details of a single throttling policy by specifying the policy level and policy name.  &#x60;X-WSO2-Tenant&#x60; header can be used to retrive throttling policy that belongs to a different tenant domain. If not specified super tenant will be used. If Authorization header is present in the request, the user&#39;s tenant associated with the access token will be used. 
     * @param policyId Policy Id represented as a UUID  (required)
     * @param policyLevel List Application or Subscription type thro.  (required)
     * @param xWSO2Tenant For cross-tenant invocations, this is used to specify the tenant domain, where the resource need to be   retirieved from.  (optional)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec.  (optional)
     * @return ApiResponse&lt;ThrottlingPolicyDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ThrottlingPolicyDTO> throttlingPoliciesPolicyLevelPolicyIdGetWithHttpInfo(String policyId, String policyLevel, String xWSO2Tenant, String ifNoneMatch) throws ApiException {
        com.squareup.okhttp.Call call = throttlingPoliciesPolicyLevelPolicyIdGetValidateBeforeCall(policyId, policyLevel, xWSO2Tenant, ifNoneMatch, null, null);
        Type localVarReturnType = new TypeToken<ThrottlingPolicyDTO>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get details of a throttling policy  (asynchronously)
     * This operation can be used to retrieve details of a single throttling policy by specifying the policy level and policy name.  &#x60;X-WSO2-Tenant&#x60; header can be used to retrive throttling policy that belongs to a different tenant domain. If not specified super tenant will be used. If Authorization header is present in the request, the user&#39;s tenant associated with the access token will be used. 
     * @param policyId Policy Id represented as a UUID  (required)
     * @param policyLevel List Application or Subscription type thro.  (required)
     * @param xWSO2Tenant For cross-tenant invocations, this is used to specify the tenant domain, where the resource need to be   retirieved from.  (optional)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec.  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call throttlingPoliciesPolicyLevelPolicyIdGetAsync(String policyId, String policyLevel, String xWSO2Tenant, String ifNoneMatch, final ApiCallback<ThrottlingPolicyDTO> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = throttlingPoliciesPolicyLevelPolicyIdGetValidateBeforeCall(policyId, policyLevel, xWSO2Tenant, ifNoneMatch, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ThrottlingPolicyDTO>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
