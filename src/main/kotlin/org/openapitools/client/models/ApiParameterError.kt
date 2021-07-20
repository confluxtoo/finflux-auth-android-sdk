/**
* Finflux
* Finflux Authentication APIs
*
* The version of the OpenAPI document: Authentication-1.0
* Contact: develop@finflux.co
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.models

import org.openapitools.client.models.ApiErrorMessageArg

import com.squareup.moshi.Json

/**
 * 
 * @param developerMessage 
 * @param defaultUserMessage 
 * @param userMessageGlobalisationCode 
 * @param parameterName 
 * @param value 
 * @param args 
 */

data class ApiParameterError (
    @Json(name = "developerMessage")
    val developerMessage: kotlin.String? = null,
    @Json(name = "defaultUserMessage")
    val defaultUserMessage: kotlin.String? = null,
    @Json(name = "userMessageGlobalisationCode")
    val userMessageGlobalisationCode: kotlin.String? = null,
    @Json(name = "parameterName")
    val parameterName: kotlin.String? = null,
    @Json(name = "value")
    val value: kotlin.Any? = null,
    @Json(name = "args")
    val args: kotlin.collections.List<ApiErrorMessageArg>? = null
)
