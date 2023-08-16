package com.weather.backend.model.dto;

import com.weather.backend.model.Weather;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WeatherResponseDTO {
    private String cityName;
    private String country;
    private String description;
    private String weatherIcon;
    private int temp;
    private int tempMax;
    private int tempMin;
    private int feelsLike;
    private int humidity;
    private String sunrise;
    private String sunset;
    private String error;

    public WeatherResponseDTO(String error) {
        this.error = error;
    }
}
