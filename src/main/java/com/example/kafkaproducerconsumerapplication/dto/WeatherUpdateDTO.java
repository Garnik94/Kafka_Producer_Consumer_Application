package com.example.kafkaproducerconsumerapplication.dto;

import java.util.Date;

public class WeatherUpdateDTO {

    private String location;

    private Double temperature;

    private Integer windSpeed;

    private String weatherType;

    private Date date;

    public WeatherUpdateDTO(String location,
                            Double temperature,
                            Integer windSpeed,
                            String weatherType,
                            Date date) {
        this.location = location;
        this.temperature = temperature;
        this.windSpeed = windSpeed;
        this.weatherType = weatherType;
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Integer getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Integer windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getWeatherType() {
        return weatherType;
    }

    public void setWeatherType(String weatherType) {
        this.weatherType = weatherType;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
