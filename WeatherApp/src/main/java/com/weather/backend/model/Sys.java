package com.weather.backend.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Sys {
    private int type;
    private int id;
    private String country;
    private long sunrise;
    private long sunset;

    // Getters e setters
}
