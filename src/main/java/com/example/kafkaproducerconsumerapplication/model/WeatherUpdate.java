package com.example.kafkaproducerconsumerapplication.model;

import com.example.kafkaproducerconsumerapplication.model.builder.WeatherUpdateBuilder;
import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "weather_updates")
public class WeatherUpdate {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long weatherUpdateID;

	@Column(name = "location")
	private String location;

	@Column(name = "temperature")
	private Double temperature;

	@Column(name = "windSpeed")
	private Integer windSpeed;

	@Column(name = "weatherType")
	@Enumerated(EnumType.STRING)
	private WeatherType weatherType;

	@Column(name = "date")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date date;

	public WeatherUpdate() {
	}

	public WeatherUpdate(String location, Double temperature, Integer windSpeed, WeatherType weatherType, Date date) {
		this.location = location;
		this.temperature = temperature;
		this.windSpeed = windSpeed;
		this.weatherType = weatherType;
		this.date = date;
	}

	public WeatherUpdate(WeatherUpdateBuilder weatherUpdateBuilder) {
		this.location = weatherUpdateBuilder.getLocation();
		this.temperature = weatherUpdateBuilder.getTemperature();
		this.windSpeed = weatherUpdateBuilder.getWindSpeed();
		this.weatherType = weatherUpdateBuilder.getWeatherType();
		this.date = weatherUpdateBuilder.getDate();
	}

	public Long getWeatherUpdateID() {
		return weatherUpdateID;
	}

	public void setWeatherUpdateID(Long weatherUpdateID) {
		this.weatherUpdateID = weatherUpdateID;
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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		WeatherUpdate that = (WeatherUpdate) o;
		return Objects.equals(weatherUpdateID, that.weatherUpdateID) &&
				Objects.equals(location, that.location) &&
				Objects.equals(temperature, that.temperature) &&
				Objects.equals(windSpeed, that.windSpeed) &&
				weatherType == that.weatherType &&
				Objects.equals(date, that.date);
	}

	@Override
	public int hashCode() {
		return Objects.hash(weatherUpdateID, location, temperature, windSpeed, weatherType, date);
	}
}
