package co.finflux.openapi.auth.infrastructure

import com.squareup.moshi.FromJson
import com.squareup.moshi.ToJson
import java.time.LocalTime

class LocalTimeAdapter {
    @ToJson
    fun toJson(value: LocalTime): String {
        return value.toString()
    }

    @FromJson
    fun fromJson(value: String): LocalTime {
        return LocalTime.parse(value)
    }
}
