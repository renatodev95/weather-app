package com.weather.backend.service;

import com.weather.backend.model.WeatherResponse;
import com.weather.backend.model.dto.WeatherMapper.WeatherMapper;
import com.weather.backend.model.dto.WeatherResponseDTO;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

@Service
public class WeatherService {
    
    private final WeatherMapper mapper;

    public WeatherService(WeatherMapper mapper) {
        this.mapper = mapper;
    }

    public WeatherResponseDTO getDtoFromResponse(WeatherResponse body) {
        return mapper.toDTO(body);
    }
}
