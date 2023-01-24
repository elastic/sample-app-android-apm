package co.elastic.apm.android.sample.backend.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class ForecastResponse {

    @JsonProperty("current_weather")
    CurrentWeatherResponse currentWeather;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForecastResponse that = (ForecastResponse) o;
        return Objects.equals(currentWeather, that.currentWeather);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentWeather);
    }

    public CurrentWeatherResponse getCurrentWeather() {
        return currentWeather;
    }
}
