package co.elastic.apm.android.sample.network

import co.elastic.apm.android.sample.network.data.ForecastResponse
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object WeatherRestManager {

    private val service: OpenMeteoService by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.open-meteo.com/v1/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        retrofit.create(OpenMeteoService::class.java)
    }

    suspend fun getCurrentLondonWeather(): ForecastResponse {
        return service.getCurrentWeather(51.51, -0.13)
    }
}