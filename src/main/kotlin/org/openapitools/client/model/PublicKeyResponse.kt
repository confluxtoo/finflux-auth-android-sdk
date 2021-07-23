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
package org.openapitools.client.model


import com.squareup.moshi.Json

/**
 * 
 * @param entityType 
 * @param keyType 
 * @param keyValue 
 * @param userId 
 */

data class PublicKeyResponse (
    @Json(name = "entityType")
    val entityType: kotlin.String? = null,
    @Json(name = "keyType")
    val keyType: kotlin.String? = null,
    @Json(name = "keyValue")
    val keyValue: kotlin.String? = null,
    @Json(name = "userId")
    val userId: kotlin.String? = null
)
