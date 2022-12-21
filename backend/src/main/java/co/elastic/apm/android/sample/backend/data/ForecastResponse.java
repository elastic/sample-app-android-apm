package co.elastic.apm.android.sample.backend.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ForecastResponse {

    @JsonProperty("current_weather")
    CurrentWeatherResponse currentWeather;
}
