# org.openapitools.client - Kotlin client library for Finflux

## Requires

* Kotlin 1.4.30
* Gradle 6.8.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://develop.finflux.io/fineract-provider/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthenticationApi* | [**fetchAccessToken**](docs/AuthenticationApi.md#fetchaccesstoken) | **POST** /oauth/token | Fetch Access Token
*AuthenticationApi* | [**generatePublicKey**](docs/AuthenticationApi.md#generatepublickey) | **POST** /v1/cryptography/login/generatepublickey | Generate Public Key


<a name="documentation-for-models"></a>
## Documentation for Models

 - [org.openapitools.client.models.AccessTokenResponse](docs/AccessTokenResponse.md)
 - [org.openapitools.client.models.ApiErrorMessageArg](docs/ApiErrorMessageArg.md)
 - [org.openapitools.client.models.ApiGlobalErrorResponse](docs/ApiGlobalErrorResponse.md)
 - [org.openapitools.client.models.ApiParameterError](docs/ApiParameterError.md)
 - [org.openapitools.client.models.PublicKeyResponse](docs/PublicKeyResponse.md)
 - [org.openapitools.client.models.RefreshTokenPayload](docs/RefreshTokenPayload.md)
 - [org.openapitools.client.models.UserPasswordPayload](docs/UserPasswordPayload.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

All endpoints do not require authorization.
