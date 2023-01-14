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
import org.wso2.am.integration.clients.admin.api.dto.WorkflowDTO;
import org.wso2.am.integration.clients.admin.api.dto.WorkflowInfoDTO;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WorkflowsIndividualApi {
    private ApiClient apiClient;

    public WorkflowsIndividualApi() {
        this(Configuration.getDefaultApiClient());
    }

    public WorkflowsIndividualApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for workflowsExternalWorkflowRefGet
     * @param externalWorkflowRef from the externel workflow reference we decide what is the the pending request that the are requesting.  (required)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resource (Will be supported in future).  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call workflowsExternalWorkflowRefGetCall(String externalWorkflowRef, String ifNoneMatch, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/workflows/{externalWorkflowRef}"
            .replaceAll("\\{" + "externalWorkflowRef" + "\\}", apiClient.escapeString(externalWorkflowRef.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
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
    private com.squareup.okhttp.Call workflowsExternalWorkflowRefGetValidateBeforeCall(String externalWorkflowRef, String ifNoneMatch, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'externalWorkflowRef' is set
        if (externalWorkflowRef == null) {
            throw new ApiException("Missing the required parameter 'externalWorkflowRef' when calling workflowsExternalWorkflowRefGet(Async)");
        }
        

        com.squareup.okhttp.Call call = workflowsExternalWorkflowRefGetCall(externalWorkflowRef, ifNoneMatch, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get details of a the pending workflow request according to the External Workflow Reference. 
     * Using this operation, you can retrieve complete details of a pending workflow request that either belongs to application creation, application subscription, application registration, api state change, user self sign up.. You need to provide the External_Workflow_Reference of the workflow Request to retrive it. 
     * @param externalWorkflowRef from the externel workflow reference we decide what is the the pending request that the are requesting.  (required)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resource (Will be supported in future).  (optional)
     * @return WorkflowInfoDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public WorkflowInfoDTO workflowsExternalWorkflowRefGet(String externalWorkflowRef, String ifNoneMatch) throws ApiException {
        ApiResponse<WorkflowInfoDTO> resp = workflowsExternalWorkflowRefGetWithHttpInfo(externalWorkflowRef, ifNoneMatch);
        return resp.getData();
    }

    /**
     * Get details of a the pending workflow request according to the External Workflow Reference. 
     * Using this operation, you can retrieve complete details of a pending workflow request that either belongs to application creation, application subscription, application registration, api state change, user self sign up.. You need to provide the External_Workflow_Reference of the workflow Request to retrive it. 
     * @param externalWorkflowRef from the externel workflow reference we decide what is the the pending request that the are requesting.  (required)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resource (Will be supported in future).  (optional)
     * @return ApiResponse&lt;WorkflowInfoDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<WorkflowInfoDTO> workflowsExternalWorkflowRefGetWithHttpInfo(String externalWorkflowRef, String ifNoneMatch) throws ApiException {
        com.squareup.okhttp.Call call = workflowsExternalWorkflowRefGetValidateBeforeCall(externalWorkflowRef, ifNoneMatch, null, null);
        Type localVarReturnType = new TypeToken<WorkflowInfoDTO>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get details of a the pending workflow request according to the External Workflow Reference.  (asynchronously)
     * Using this operation, you can retrieve complete details of a pending workflow request that either belongs to application creation, application subscription, application registration, api state change, user self sign up.. You need to provide the External_Workflow_Reference of the workflow Request to retrive it. 
     * @param externalWorkflowRef from the externel workflow reference we decide what is the the pending request that the are requesting.  (required)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resource (Will be supported in future).  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call workflowsExternalWorkflowRefGetAsync(String externalWorkflowRef, String ifNoneMatch, final ApiCallback<WorkflowInfoDTO> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = workflowsExternalWorkflowRefGetValidateBeforeCall(externalWorkflowRef, ifNoneMatch, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<WorkflowInfoDTO>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for workflowsUpdateWorkflowStatusPost
     * @param workflowReferenceId Workflow reference id  (required)
     * @param body Workflow event that need to be updated  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call workflowsUpdateWorkflowStatusPostCall(String workflowReferenceId, WorkflowDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/workflows/update-workflow-status";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (workflowReferenceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("workflowReferenceId", workflowReferenceId));

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call workflowsUpdateWorkflowStatusPostValidateBeforeCall(String workflowReferenceId, WorkflowDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'workflowReferenceId' is set
        if (workflowReferenceId == null) {
            throw new ApiException("Missing the required parameter 'workflowReferenceId' when calling workflowsUpdateWorkflowStatusPost(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling workflowsUpdateWorkflowStatusPost(Async)");
        }
        

        com.squareup.okhttp.Call call = workflowsUpdateWorkflowStatusPostCall(workflowReferenceId, body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Update workflow status
     * This operation can be used to approve or reject a workflow task. 
     * @param workflowReferenceId Workflow reference id  (required)
     * @param body Workflow event that need to be updated  (required)
     * @return WorkflowDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public WorkflowDTO workflowsUpdateWorkflowStatusPost(String workflowReferenceId, WorkflowDTO body) throws ApiException {
        ApiResponse<WorkflowDTO> resp = workflowsUpdateWorkflowStatusPostWithHttpInfo(workflowReferenceId, body);
        return resp.getData();
    }

    /**
     * Update workflow status
     * This operation can be used to approve or reject a workflow task. 
     * @param workflowReferenceId Workflow reference id  (required)
     * @param body Workflow event that need to be updated  (required)
     * @return ApiResponse&lt;WorkflowDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<WorkflowDTO> workflowsUpdateWorkflowStatusPostWithHttpInfo(String workflowReferenceId, WorkflowDTO body) throws ApiException {
        com.squareup.okhttp.Call call = workflowsUpdateWorkflowStatusPostValidateBeforeCall(workflowReferenceId, body, null, null);
        Type localVarReturnType = new TypeToken<WorkflowDTO>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update workflow status (asynchronously)
     * This operation can be used to approve or reject a workflow task. 
     * @param workflowReferenceId Workflow reference id  (required)
     * @param body Workflow event that need to be updated  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call workflowsUpdateWorkflowStatusPostAsync(String workflowReferenceId, WorkflowDTO body, final ApiCallback<WorkflowDTO> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = workflowsUpdateWorkflowStatusPostValidateBeforeCall(workflowReferenceId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<WorkflowDTO>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
