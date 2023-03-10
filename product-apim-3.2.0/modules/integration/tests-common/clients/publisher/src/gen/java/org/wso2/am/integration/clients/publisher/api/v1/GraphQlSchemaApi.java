/*
 * 0CodeAPI Manager - Publisher API
 * This specifies a **RESTful API** for WSO2 **API Manager** - Publisher.  Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.0.4/components/apimgt/org.wso2.carbon.apimgt.rest.api.publisher/src/main/resources/publisher-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: v1.1
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.am.integration.clients.publisher.api.v1;

import org.wso2.am.integration.clients.publisher.api.ApiCallback;
import org.wso2.am.integration.clients.publisher.api.ApiClient;
import org.wso2.am.integration.clients.publisher.api.ApiException;
import org.wso2.am.integration.clients.publisher.api.ApiResponse;
import org.wso2.am.integration.clients.publisher.api.Configuration;
import org.wso2.am.integration.clients.publisher.api.Pair;
import org.wso2.am.integration.clients.publisher.api.ProgressRequestBody;
import org.wso2.am.integration.clients.publisher.api.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.wso2.am.integration.clients.publisher.api.v1.dto.ErrorDTO;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GraphQlSchemaApi {
    private ApiClient apiClient;

    public GraphQlSchemaApi() {
        this(Configuration.getDefaultApiClient());
    }

    public GraphQlSchemaApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for apisApiIdGraphqlSchemaPut
     * @param apiId **API ID** consisting of the **UUID** of the API.  (required)
     * @param schemaDefinition schema definition of the GraphQL API (required)
     * @param ifMatch Validator for conditional requests; based on ETag.  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call apisApiIdGraphqlSchemaPutCall(String apiId, String schemaDefinition, String ifMatch, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/apis/{apiId}/graphql-schema"
            .replaceAll("\\{" + "apiId" + "\\}", apiClient.escapeString(apiId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifMatch != null)
        localVarHeaderParams.put("If-Match", apiClient.parameterToString(ifMatch));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (schemaDefinition != null)
        localVarFormParams.put("schemaDefinition", schemaDefinition);

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
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
    private com.squareup.okhttp.Call apisApiIdGraphqlSchemaPutValidateBeforeCall(String apiId, String schemaDefinition, String ifMatch, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiId' is set
        if (apiId == null) {
            throw new ApiException("Missing the required parameter 'apiId' when calling apisApiIdGraphqlSchemaPut(Async)");
        }
        
        // verify the required parameter 'schemaDefinition' is set
        if (schemaDefinition == null) {
            throw new ApiException("Missing the required parameter 'schemaDefinition' when calling apisApiIdGraphqlSchemaPut(Async)");
        }
        

        com.squareup.okhttp.Call call = apisApiIdGraphqlSchemaPutCall(apiId, schemaDefinition, ifMatch, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Add a Schema to a GraphQL API
     * This operation can be used to add a GraphQL Schema definition to an existing GraphQL API. 
     * @param apiId **API ID** consisting of the **UUID** of the API.  (required)
     * @param schemaDefinition schema definition of the GraphQL API (required)
     * @param ifMatch Validator for conditional requests; based on ETag.  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void apisApiIdGraphqlSchemaPut(String apiId, String schemaDefinition, String ifMatch) throws ApiException {
        apisApiIdGraphqlSchemaPutWithHttpInfo(apiId, schemaDefinition, ifMatch);
    }

    /**
     * Add a Schema to a GraphQL API
     * This operation can be used to add a GraphQL Schema definition to an existing GraphQL API. 
     * @param apiId **API ID** consisting of the **UUID** of the API.  (required)
     * @param schemaDefinition schema definition of the GraphQL API (required)
     * @param ifMatch Validator for conditional requests; based on ETag.  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> apisApiIdGraphqlSchemaPutWithHttpInfo(String apiId, String schemaDefinition, String ifMatch) throws ApiException {
        com.squareup.okhttp.Call call = apisApiIdGraphqlSchemaPutValidateBeforeCall(apiId, schemaDefinition, ifMatch, null, null);
        return apiClient.execute(call);
    }

    /**
     * Add a Schema to a GraphQL API (asynchronously)
     * This operation can be used to add a GraphQL Schema definition to an existing GraphQL API. 
     * @param apiId **API ID** consisting of the **UUID** of the API.  (required)
     * @param schemaDefinition schema definition of the GraphQL API (required)
     * @param ifMatch Validator for conditional requests; based on ETag.  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call apisApiIdGraphqlSchemaPutAsync(String apiId, String schemaDefinition, String ifMatch, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = apisApiIdGraphqlSchemaPutValidateBeforeCall(apiId, schemaDefinition, ifMatch, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
