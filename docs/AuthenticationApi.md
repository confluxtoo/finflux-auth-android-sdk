# AuthenticationApi

All URIs are relative to *https://develop.finflux.io/fineract-provider/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchAccessToken**](AuthenticationApi.md#fetchAccessToken) | **POST** oauth/token | Fetch Access Token



Fetch Access Token

Fetch Access Token using User-Password or Refresh Token

### Example
```kotlin
// Import classes:
//import co.finflux.openapi.*
//import co.finflux.openapi.infrastructure.*
//import co.finflux.openapi.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AuthenticationApi::class.java)
val clientId : kotlin.String = community-app // kotlin.String | 
val clientSecret : kotlin.String = clientSecret_example // kotlin.String | 
val grantType : kotlin.String = password/mobile_otp // kotlin.String | 
val username : kotlin.String = conflux // kotlin.String | required when grant_type is password
val password : kotlin.String = password_example // kotlin.String | required when grant_type is password
val otpreferenceid : kotlin.String = otpreferenceid_example // kotlin.String | required when grant_type is mobile_otp
val token : kotlin.String = token_example // kotlin.String | required when grant_type is mobile_otp

val result : AccessTokenResponse = webService.fetchAccessToken(clientId, clientSecret, grantType, username, password, otpreferenceid, token)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **kotlin.String**|  |
 **clientSecret** | **kotlin.String**|  |
 **grantType** | **kotlin.String**|  |
 **username** | **kotlin.String**| required when grant_type is password | [optional]
 **password** | **kotlin.String**| required when grant_type is password | [optional]
 **otpreferenceid** | **kotlin.String**| required when grant_type is mobile_otp | [optional]
 **token** | **kotlin.String**| required when grant_type is mobile_otp | [optional]

### Return type

[**AccessTokenResponse**](AccessTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

