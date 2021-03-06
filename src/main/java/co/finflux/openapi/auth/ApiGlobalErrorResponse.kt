/**
* Finflux-Authentication
* Finflux Authentication APIs
*
* The version of the OpenAPI document: Authentication-1.0
* Contact: develop@finflux.co
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package co.finflux.openapi.auth

import co.finflux.openapi.auth.ApiParameterError

import com.squareup.moshi.Json

/**
 * 
 * @param developerMessage 
 * @param httpStatusCode 
 * @param defaultUserMessage 
 * @param userMessageGlobalisationCode 
 * @param errors 
 * @param statusCode 
 */

data class ApiGlobalErrorResponse (
    @Json(name = "developerMessage")
    val developerMessage: kotlin.String? = null,
    @Json(name = "httpStatusCode")
    val httpStatusCode: kotlin.String? = null,
    @Json(name = "defaultUserMessage")
    val defaultUserMessage: kotlin.String? = null,
    @Json(name = "userMessageGlobalisationCode")
    val userMessageGlobalisationCode: kotlin.String? = null,
    @Json(name = "errors")
    val errors: kotlin.collections.List<ApiParameterError>? = null,
    @Json(name = "statusCode")
    val statusCode: kotlin.Int? = null
)

