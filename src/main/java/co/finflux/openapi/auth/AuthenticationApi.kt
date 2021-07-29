package co.finflux.openapi.auth

import co.finflux.openapi.auth.infrastructure.CollectionFormats.*
import retrofit2.http.*
import okhttp3.RequestBody
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.Completable;

import co.finflux.openapi.auth.AccessTokenResponse
import co.finflux.openapi.auth.ApiGlobalErrorResponse

interface AuthenticationApi {
    /**
     * Fetch Access Token
     * Fetch Access Token using User-Password or Refresh Token
     * Responses:
     *  - 200: Success Response
     *  - 400: Error response
     * 
     * @param clientId  
     * @param clientSecret  
     * @param grantType  
     * @param username required when grant_type is password (optional)
     * @param password required when grant_type is password (optional)
     * @param otpreferenceid required when grant_type is mobile_otp (optional)
     * @param token required when grant_type is mobile_otp (optional)
     * @param deviceInformation Device Information Refer DeviceInformation (optional)
     * @param body  (optional)
     * @return [Call]<[AccessTokenResponse]>
     */
    @POST("oauth/token")
    fun fetchAccessToken(@Query("client_id") clientId: kotlin.String, @Query("client_secret") clientSecret: kotlin.String, @Query("grant_type") grantType: kotlin.String, @Query("username") username: kotlin.String? = null, @Query("password") password: kotlin.String? = null, @Query("otpreferenceid") otpreferenceid: kotlin.String? = null, @Query("token") token: kotlin.String? = null, @Header("Device-Information") deviceInformation: kotlin.String? = null, @Body body: kotlin.Any? = null): Single<AccessTokenResponse>

}
