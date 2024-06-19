package com.example.kafkaproducerconsumerapplication.dto.mapper;

import com.example.kafkaproducerconsumerapplication.dto.WeatherUpdateDTO;
import com.example.kafkaproducerconsumerapplication.model.WeatherType;
import com.example.kafkaproducerconsumerapplication.model.WeatherUpdate;
import com.example.kafkaproducerconsumerapplication.model.builder.WeatherUpdateBuilder;

public class WeatherUpdateMapper {

    public static WeatherUpdate toModel(WeatherUpdateDTO weatherUpdateDTO) {
        return new WeatherUpdateBuilder()
                .location(weatherUpdateDTO.getLocation())
                .temperature(weatherUpdateDTO.getTemperature())
                .windSpeed(weatherUpdateDTO.getWindSpeed())
                .weatherType(WeatherType.valueOf(weatherUpdateDTO.getWeatherType()))
                .date(weatherUpdateDTO.getDate())
                .build();
    }

}
