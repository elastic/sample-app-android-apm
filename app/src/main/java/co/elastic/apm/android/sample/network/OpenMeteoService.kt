package co.elastic.apm.android.sample.network

import co.elastic.apm.android.sample.network.data.ForecastResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface OpenMeteoService {
    @GET("forecast?current_weather=true")
    suspend fun getCurrentWeather(
        @Query("latitude") latitude: Double,
        @Query("longitude") longitude: Double
    ): ForecastResponse
}