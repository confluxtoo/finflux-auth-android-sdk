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
 * To fetch a access token by refresh token
 * @param clientId Client-Id provided by finflux
 * @param grantType 
 * @param password Encrypted password if isPasswordEncrypted is true
 * @param username Username
 * @param isPasswordEncrypted 
 */

data class UserPasswordPayload (
    /* Client-Id provided by finflux */
    @Json(name = "client_id")
    val clientId: kotlin.String,
    @Json(name = "grant_type")
    val grantType: kotlin.String,
    /* Encrypted password if isPasswordEncrypted is true */
    @Json(name = "password")
    val password: kotlin.String,
    /* Username */
    @Json(name = "username")
    val username: kotlin.String,
    @Json(name = "isPasswordEncrypted")
    val isPasswordEncrypted: kotlin.Boolean? = null
)
