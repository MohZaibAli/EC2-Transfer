# UserApi

All URIs are relative to *https://identity.company-information.service.gov.uk*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userProfile**](UserApi.md#userProfile) | **GET** /user/profile | Request user information



## userProfile

> UserProfile userProfile()

Request user information

### Example

```java
// Import classes:
//import org.wso2.client.api.CompaniesHouseIdentityService.UserApi;

UserApi apiInstance = new UserApi();
try {
    UserProfile result = apiInstance.userProfile();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userProfile");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**UserProfile**](UserProfile.md)

### Authorization

[default](../README.md#default)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

