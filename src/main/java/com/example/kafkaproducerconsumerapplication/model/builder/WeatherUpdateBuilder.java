package com.example.kafkaproducerconsumerapplication.model.builder;

import com.example.kafkaproducerconsumerapplication.model.WeatherType;
import com.example.kafkaproducerconsumerapplication.model.WeatherUpdate;

import java.util.Date;

public class WeatherUpdateBuilder {

    private String location;

    private Double temperature;

    private Integer windSpeed;

    private WeatherType weatherType;

    private Date date;

    public WeatherUpdateBuilder location(String location) {
        this.location = location;
        return this;
    }

    public WeatherUpdateBuilder temperature(Double temperature) {
        this.temperature = temperature;
        return this;
    }

    public WeatherUpdateBuilder windSpeed(Integer windSpeed) {
        this.windSpeed = windSpeed;
        return this;
    }

    public WeatherUpdateBuilder weatherType(WeatherType weatherType) {
        this.weatherType = weatherType;
        return this;
    }

    public WeatherUpdateBuilder date(Date date) {
        this.date = date;
        return this;
    }

    public WeatherUpdate build() {
        return new WeatherUpdate(this);
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

    public WeatherType getWeatherType() {
        return weatherType;
    }

    public void setWeatherType(WeatherType weatherType) {
        this.weatherType = weatherType;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
