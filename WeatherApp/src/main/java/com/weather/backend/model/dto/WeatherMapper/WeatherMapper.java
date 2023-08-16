package com.weather.backend.model.dto.WeatherMapper;

import com.weather.backend.model.WeatherResponse;
import com.weather.backend.model.dto.WeatherResponseDTO;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.stream.Collectors;

@Component
public class WeatherMapper {

    public WeatherResponseDTO toDTO(WeatherResponse response) {
        if (response == null) {
            return null;
        }
        
        return WeatherResponseDTO.builder()
                .cityName(response.getName())
                .country(response.getSys().getCountry())
                .description(capitalize(response.getWeather().get(0).getDescription()))
                .weatherIcon(response.getWeather().get(0).getIcon())
                .temp(convertFromKelvinToCelsius(response.getMain().getTemp()))
                .tempMax(convertFromKelvinToCelsius(response.getMain().getTemp_max()))
                .tempMin(convertFromKelvinToCelsius(response.getMain().getTemp_min()))
                .feelsLike(convertFromKelvinToCelsius(response.getMain().getFeels_like()))
                .humidity(response.getMain().getHumidity())
                .sunrise(convertSecondsToString(response.getSys().getSunrise()))
                .sunset(convertSecondsToString(response.getSys().getSunset()))
                .build();
    }

    private String convertSecondsToString(long seconds) {
        Instant instant = Instant.ofEpochSecond(seconds);
        LocalTime localTime = instant.atZone(ZoneId.systemDefault()).toLocalTime();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        return localTime.format(formatter);
    }

    private Integer convertFromKelvinToCelsius(double value) {
        return (int) (value - 273.15);
    }
    
    private String capitalize(String input) {
        return Arrays.stream(input.split(" "))
                .map(word -> Character.toUpperCase(word.charAt(0)) + word.substring(1))
                .collect(Collectors.joining(" "));
    }
}
