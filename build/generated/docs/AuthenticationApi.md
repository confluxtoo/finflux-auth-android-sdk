# AuthenticationApi

All URIs are relative to *https://develop.finflux.io/fineract-provider/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchAccessToken**](AuthenticationApi.md#fetchAccessToken) | **POST** /oauth/token | Fetch Access Token
[**fetchRefreshAccessToken**](AuthenticationApi.md#fetchRefreshAccessToken) | **POST** /oauth/tokens | Fetch Refresh Access Token
[**generatePublicKey**](AuthenticationApi.md#generatePublicKey) | **POST** /v1/cryptography/login/generatepublickey | Generate Public Key


<a name="fetchAccessToken"></a>
# **fetchAccessToken**
> AccessTokenResponse fetchAccessToken(userPasswordPayload)

Fetch Access Token

Fetch Access Token using User-Password or Refresh Token

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.model.*

val apiInstance = AuthenticationApi()
val userPasswordPayload : UserPasswordPayload =  // UserPasswordPayload | 
try {
    val result : AccessTokenResponse = apiInstance.fetchAccessToken(userPasswordPayload)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthenticationApi#fetchAccessToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthenticationApi#fetchAccessToken")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userPasswordPayload** | [**UserPasswordPayload**](UserPasswordPayload.md)|  |

### Return type

[**AccessTokenResponse**](AccessTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchRefreshAccessToken"></a>
# **fetchRefreshAccessToken**
> AccessTokenResponse fetchRefreshAccessToken(refreshTokenPayload)

Fetch Refresh Access Token

Fetch Access Token using Refresh Token

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.model.*

val apiInstance = AuthenticationApi()
val refreshTokenPayload : RefreshTokenPayload =  // RefreshTokenPayload | 
try {
    val result : AccessTokenResponse = apiInstance.fetchRefreshAccessToken(refreshTokenPayload)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthenticationApi#fetchRefreshAccessToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthenticationApi#fetchRefreshAccessToken")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **refreshTokenPayload** | [**RefreshTokenPayload**](RefreshTokenPayload.md)|  |

### Return type

[**AccessTokenResponse**](AccessTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="generatePublicKey"></a>
# **generatePublicKey**
> PublicKeyResponse generatePublicKey(username)

Generate Public Key

Generate Public Key

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.model.*

val apiInstance = AuthenticationApi()
val username : kotlin.String = conflux // kotlin.String | 
try {
    val result : PublicKeyResponse = apiInstance.generatePublicKey(username)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthenticationApi#generatePublicKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthenticationApi#generatePublicKey")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **kotlin.String**|  |

### Return type

[**PublicKeyResponse**](PublicKeyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

