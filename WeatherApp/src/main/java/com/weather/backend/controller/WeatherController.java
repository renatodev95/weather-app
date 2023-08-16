package com.weather.backend.controller;

import com.weather.backend.model.WeatherResponse;
import com.weather.backend.model.dto.WeatherResponseDTO;
import com.weather.backend.service.WeatherService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/weather")
public class WeatherController {

    private final String API_KEY = "CHAVE_DA_API_OPENWEATHER";
    private final String WEATHER_API_URL = "http://api.openweathermap.org/data/2.5/weather";
    
    private WeatherService service;

    public WeatherController(WeatherService service) {
        this.service = service;
    }
    
    @GetMapping("/{city}")
    public ResponseEntity<WeatherResponseDTO> getWeather(@PathVariable String city) {
        try {
            RestTemplate restTemplate = new RestTemplate();
            String url = WEATHER_API_URL + "?q=" + city + "&appid=" + API_KEY + "&lang=pt_br";

            WeatherResponseDTO dto = service.getDtoFromResponse(restTemplate.getForEntity(url, WeatherResponse.class).getBody());
            return new ResponseEntity<>(dto, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<WeatherResponseDTO>(new WeatherResponseDTO("Cidade não encontrada, verifique."), HttpStatus.OK);
        }
    }
}

