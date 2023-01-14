# org.wso2.client.CompaniesHouseIdentityService

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>org.wso2</groupId>
    <artifactId>org.wso2.client.CompaniesHouseIdentityService</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.wso2:org.wso2.client.CompaniesHouseIdentityService:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

- target/org.wso2.client.CompaniesHouseIdentityService-1.0.0.jar
- target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import org.wso2.client.api.CompaniesHouseIdentityService.Oauth2Api;

public class Oauth2ApiExample {

    public static void main(String[] args) {
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://identity.company-information.service.gov.uk*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*Oauth2Api* | [**authorizationCode**](docs/Oauth2Api.md#authorizationCode) | **GET** /oauth2/authorise | Request user authorisation code
*Oauth2Api* | [**oauth2TokenPost**](docs/Oauth2Api.md#oauth2TokenPost) | **POST** /oauth2/token | Obtain an access token
*Oauth2Api* | [**oauth2VerifyGet**](docs/Oauth2Api.md#oauth2VerifyGet) | **GET** /oauth2/verify | Verify an access token
*UserApi* | [**userProfile**](docs/UserApi.md#userProfile) | **GET** /user/profile | Request user information


## Documentation for Models

 - [AccessToken](docs/AccessToken.md)
 - [TokenVerify](docs/TokenVerify.md)
 - [UserProfile](docs/UserProfile.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### default


- **Type**: OAuth
- **Flow**: implicit
- **Authorization URL**: https://test.com
- **Scopes**: 
  - https://identity.company-information.service.gov.uk/user/profile.read: User profile read permission

### oauth2


- **Type**: OAuth
- **Flow**: implicit
- **Authorization URL**: https://identity.company-information.service.gov.uk/oauth2/authorise
- **Scopes**: 
  - https://identity.company-information.service.gov.uk/user/profile.read: User profile read permission


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



