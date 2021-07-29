# co.finflux.openapi.auth - Kotlin client library for Finflux-Authentication

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
*AuthenticationApi* | [**fetchAccessToken**](docs/AuthenticationApi.md#fetchaccesstoken) | **POST** oauth/token | Fetch Access Token


<a name="documentation-for-models"></a>
## Documentation for Models

 - [co.finflux.openapi.auth.AccessTokenResponse](docs/AccessTokenResponse.md)
 - [co.finflux.openapi.auth.ApiErrorMessageArg](docs/ApiErrorMessageArg.md)
 - [co.finflux.openapi.auth.ApiGlobalErrorResponse](docs/ApiGlobalErrorResponse.md)
 - [co.finflux.openapi.auth.ApiParameterError](docs/ApiParameterError.md)
 - [co.finflux.openapi.auth.DeviceInformation](docs/DeviceInformation.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

All endpoints do not require authorization.
