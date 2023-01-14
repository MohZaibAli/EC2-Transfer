

# AccessToken

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessToken** | **String** | The token that can be sent to a Companies House API. | 
**expiresIn** | **Integer** | Time in seconds until token expires. | 
**tokenType** | [**TokenTypeEnum**](#TokenTypeEnum) | The type of token. | 
**refreshToken** | **String** | The token to be used to refresh the access token. Only returned if the &#x60;grant_type&#x60; is &#x60;authorization_code&#x60;. |  [optional]


## Enum: TokenTypeEnum

Name | Value
---- | -----




