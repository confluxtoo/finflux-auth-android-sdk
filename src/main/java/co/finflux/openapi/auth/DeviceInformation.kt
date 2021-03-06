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


import com.squareup.moshi.Json

/**
 * 
 * @param deviceId 
 * @param deviceModel 
 * @param latitude 
 * @param longitude 
 * @param apKVersion 
 * @param sdKVersion 
 * @param imEINumber1 
 * @param deviceinfo 
 */

data class DeviceInformation (
    @Json(name = "deviceId")
    val deviceId: kotlin.String? = null,
    @Json(name = "deviceModel")
    val deviceModel: kotlin.String? = null,
    @Json(name = "latitude")
    val latitude: kotlin.String? = null,
    @Json(name = "longitude")
    val longitude: kotlin.String? = null,
    @Json(name = "APKVersion")
    val apKVersion: kotlin.String? = null,
    @Json(name = "SDKVersion")
    val sdKVersion: kotlin.String? = null,
    @Json(name = "IMEINumber1")
    val imEINumber1: kotlin.String? = null,
    @Json(name = "deviceinfo")
    val deviceinfo: kotlin.String? = null
)

