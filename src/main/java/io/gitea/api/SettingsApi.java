/*
 * Gitea API.
 * This documentation describes the Gitea API.
 *
 * OpenAPI spec version: 1.14.0&#43;dev-803-gf1da46622
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.gitea.api;

import io.gitea.ApiCallback;
import io.gitea.ApiClient;
import io.gitea.ApiException;
import io.gitea.ApiResponse;
import io.gitea.Configuration;
import io.gitea.Pair;
import io.gitea.ProgressRequestBody;
import io.gitea.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.gitea.model.GeneralAPISettings;
import io.gitea.model.GeneralAttachmentSettings;
import io.gitea.model.GeneralRepoSettings;
import io.gitea.model.GeneralUISettings;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SettingsApi {
    private ApiClient apiClient;

    public SettingsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SettingsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getGeneralAPISettings
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getGeneralAPISettingsCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/settings/api";

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
            "application/json", "text/plain"
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

        String[] localVarAuthNames = new String[] { "AccessToken", "AuthorizationHeaderToken", "BasicAuth", "SudoHeader", "SudoParam", "TOTPHeader", "Token" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getGeneralAPISettingsValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getGeneralAPISettingsCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get instance&#39;s global settings for api
     * 
     * @return GeneralAPISettings
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GeneralAPISettings getGeneralAPISettings() throws ApiException {
        ApiResponse<GeneralAPISettings> resp = getGeneralAPISettingsWithHttpInfo();
        return resp.getData();
    }

    /**
     * Get instance&#39;s global settings for api
     * 
     * @return ApiResponse&lt;GeneralAPISettings&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GeneralAPISettings> getGeneralAPISettingsWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getGeneralAPISettingsValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<GeneralAPISettings>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get instance&#39;s global settings for api (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getGeneralAPISettingsAsync(final ApiCallback<GeneralAPISettings> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getGeneralAPISettingsValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GeneralAPISettings>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getGeneralAttachmentSettings
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getGeneralAttachmentSettingsCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/settings/attachment";

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
            "application/json", "text/plain"
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

        String[] localVarAuthNames = new String[] { "AccessToken", "AuthorizationHeaderToken", "BasicAuth", "SudoHeader", "SudoParam", "TOTPHeader", "Token" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getGeneralAttachmentSettingsValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getGeneralAttachmentSettingsCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get instance&#39;s global settings for Attachment
     * 
     * @return GeneralAttachmentSettings
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GeneralAttachmentSettings getGeneralAttachmentSettings() throws ApiException {
        ApiResponse<GeneralAttachmentSettings> resp = getGeneralAttachmentSettingsWithHttpInfo();
        return resp.getData();
    }

    /**
     * Get instance&#39;s global settings for Attachment
     * 
     * @return ApiResponse&lt;GeneralAttachmentSettings&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GeneralAttachmentSettings> getGeneralAttachmentSettingsWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getGeneralAttachmentSettingsValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<GeneralAttachmentSettings>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get instance&#39;s global settings for Attachment (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getGeneralAttachmentSettingsAsync(final ApiCallback<GeneralAttachmentSettings> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getGeneralAttachmentSettingsValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GeneralAttachmentSettings>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getGeneralRepositorySettings
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getGeneralRepositorySettingsCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/settings/repository";

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
            "application/json", "text/plain"
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

        String[] localVarAuthNames = new String[] { "AccessToken", "AuthorizationHeaderToken", "BasicAuth", "SudoHeader", "SudoParam", "TOTPHeader", "Token" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getGeneralRepositorySettingsValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getGeneralRepositorySettingsCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get instance&#39;s global settings for repositories
     * 
     * @return GeneralRepoSettings
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GeneralRepoSettings getGeneralRepositorySettings() throws ApiException {
        ApiResponse<GeneralRepoSettings> resp = getGeneralRepositorySettingsWithHttpInfo();
        return resp.getData();
    }

    /**
     * Get instance&#39;s global settings for repositories
     * 
     * @return ApiResponse&lt;GeneralRepoSettings&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GeneralRepoSettings> getGeneralRepositorySettingsWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getGeneralRepositorySettingsValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<GeneralRepoSettings>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get instance&#39;s global settings for repositories (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getGeneralRepositorySettingsAsync(final ApiCallback<GeneralRepoSettings> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getGeneralRepositorySettingsValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GeneralRepoSettings>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getGeneralUISettings
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getGeneralUISettingsCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/settings/ui";

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
            "application/json", "text/plain"
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

        String[] localVarAuthNames = new String[] { "AccessToken", "AuthorizationHeaderToken", "BasicAuth", "SudoHeader", "SudoParam", "TOTPHeader", "Token" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getGeneralUISettingsValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getGeneralUISettingsCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get instance&#39;s global settings for ui
     * 
     * @return GeneralUISettings
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GeneralUISettings getGeneralUISettings() throws ApiException {
        ApiResponse<GeneralUISettings> resp = getGeneralUISettingsWithHttpInfo();
        return resp.getData();
    }

    /**
     * Get instance&#39;s global settings for ui
     * 
     * @return ApiResponse&lt;GeneralUISettings&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GeneralUISettings> getGeneralUISettingsWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getGeneralUISettingsValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<GeneralUISettings>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get instance&#39;s global settings for ui (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getGeneralUISettingsAsync(final ApiCallback<GeneralUISettings> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getGeneralUISettingsValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GeneralUISettings>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
