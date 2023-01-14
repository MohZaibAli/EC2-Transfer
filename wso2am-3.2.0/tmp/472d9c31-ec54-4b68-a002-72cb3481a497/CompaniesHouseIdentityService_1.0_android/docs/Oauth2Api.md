# Oauth2Api

All URIs are relative to *https://identity.company-information.service.gov.uk*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authorizationCode**](Oauth2Api.md#authorizationCode) | **GET** /oauth2/authorise | Request user authorisation code
[**oauth2TokenPost**](Oauth2Api.md#oauth2TokenPost) | **POST** /oauth2/token | Obtain an access token
[**oauth2VerifyGet**](Oauth2Api.md#oauth2VerifyGet) | **GET** /oauth2/verify | Verify an access token



## authorizationCode

> authorizationCode(responseType, clientId, redirectUri, state, scope, reauthenticate, hint)

Request user authorisation code

Request authentication credentials for a web application user.

### Example

```java
// Import classes:
//import org.wso2.client.api.CompaniesHouseIdentityService.Oauth2Api;

Oauth2Api apiInstance = new Oauth2Api();
String responseType = null; // String | Requests the type of response the authorisation API should return. For server-side web applications, this would be `code`, for JavaScript applications this would be `token`.
String clientId = null; // String | Identifies the client that is making the request. This is the requestors client ID.
String redirectUri = null; // String | One of the redirect URIs registered at the time of obtaining a `client_id` and `client_secret`. Must be the same as sent during the authorisation request that returned the code.
String state = null; // String | This parameter contains any state which your application may want returned in the response roundtrip. The value should contain a nonce that your application can check to prevent cross-site-request-forgery attempts.
String scope = null; // String | Indicates the service access your application is requesting, the user will be asked to give their consent of these permissions to be given to your application. Scope is given as a space delimited set of permissions requested by the application.
Boolean reauthenticate = null; // Boolean | This parameter is used to force the user to reauthenticate for the application. This may be required to protect some user resources owned by the application.
String hint = null; // String | This parameter is used to supply an email address to the authentication service. The value is used to pre-populate the email address web-screen field.
try {
    apiInstance.authorizationCode(responseType, clientId, redirectUri, state, scope, reauthenticate, hint);
} catch (ApiException e) {
    System.err.println("Exception when calling Oauth2Api#authorizationCode");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **responseType** | **String**| Requests the type of response the authorisation API should return. For server-side web applications, this would be &#x60;code&#x60;, for JavaScript applications this would be &#x60;token&#x60;. | [default to null] [enum: code, token]
 **clientId** | **String**| Identifies the client that is making the request. This is the requestors client ID. | [default to null]
 **redirectUri** | **String**| One of the redirect URIs registered at the time of obtaining a &#x60;client_id&#x60; and &#x60;client_secret&#x60;. Must be the same as sent during the authorisation request that returned the code. | [default to null]
 **state** | **String**| This parameter contains any state which your application may want returned in the response roundtrip. The value should contain a nonce that your application can check to prevent cross-site-request-forgery attempts. | [default to null]
 **scope** | **String**| Indicates the service access your application is requesting, the user will be asked to give their consent of these permissions to be given to your application. Scope is given as a space delimited set of permissions requested by the application. | [optional] [default to null]
 **reauthenticate** | **Boolean**| This parameter is used to force the user to reauthenticate for the application. This may be required to protect some user resources owned by the application. | [optional] [default to null]
 **hint** | **String**| This parameter is used to supply an email address to the authentication service. The value is used to pre-populate the email address web-screen field. | [optional] [default to null]

### Return type

null (empty response body)

### Authorization

[default](../README.md#default)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## oauth2TokenPost

> AccessToken oauth2TokenPost(clientId, clientSecret, grantType, code, refreshToken, redirectUri)

Obtain an access token

### Example

```java
// Import classes:
//import org.wso2.client.api.CompaniesHouseIdentityService.Oauth2Api;

Oauth2Api apiInstance = new Oauth2Api();
String clientId = null; // String | Identifies the client that is making the request.
String clientSecret = null; // String | The requesters client secret that was obtained when registering the application.
String grantType = null; // String | The grant type defined by the OAuth 2.0 specification.
String code = null; // String | The authorisation code returned by the authorisation API request. Required if `grant_type` is `authorization_code`.
String refreshToken = null; // String | The refresh token returned from the original authorisation code exchange. Required if `grant_type` is `refresh_token`.
String redirectUri = null; // String | One of the redirect URIs registered at the time of obtaining a client_id and secret. Must be the same as sent during the authorisation request that returned the code. Required if `grant_type` is `authorization_code`.
try {
    AccessToken result = apiInstance.oauth2TokenPost(clientId, clientSecret, grantType, code, refreshToken, redirectUri);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Oauth2Api#oauth2TokenPost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Identifies the client that is making the request. | [default to null]
 **clientSecret** | **String**| The requesters client secret that was obtained when registering the application. | [default to null]
 **grantType** | **String**| The grant type defined by the OAuth 2.0 specification. | [default to null] [enum: authorization_code, refresh_token]
 **code** | **String**| The authorisation code returned by the authorisation API request. Required if &#x60;grant_type&#x60; is &#x60;authorization_code&#x60;. | [optional] [default to null]
 **refreshToken** | **String**| The refresh token returned from the original authorisation code exchange. Required if &#x60;grant_type&#x60; is &#x60;refresh_token&#x60;. | [optional] [default to null]
 **redirectUri** | **String**| One of the redirect URIs registered at the time of obtaining a client_id and secret. Must be the same as sent during the authorisation request that returned the code. Required if &#x60;grant_type&#x60; is &#x60;authorization_code&#x60;. | [optional] [default to null]

### Return type

[**AccessToken**](AccessToken.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: */*


## oauth2VerifyGet

> TokenVerify oauth2VerifyGet(accessToken)

Verify an access token

Query an access token, and fetch some metadata such as when the token expires and which scopes have been granted.

### Example

```java
// Import classes:
//import org.wso2.client.api.CompaniesHouseIdentityService.Oauth2Api;

Oauth2Api apiInstance = new Oauth2Api();
String accessToken = null; // String | Access token to verify.
try {
    TokenVerify result = apiInstance.oauth2VerifyGet(accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Oauth2Api#oauth2VerifyGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Access token to verify. | [optional] [default to null]

### Return type

[**TokenVerify**](TokenVerify.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

