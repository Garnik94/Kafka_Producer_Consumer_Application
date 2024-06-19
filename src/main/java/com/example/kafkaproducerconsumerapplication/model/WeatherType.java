package com.example.kafkaproducerconsumerapplication.model;

public enum WeatherType {

	SUNNY("SUNNY"), CLOUDY("CLOUDY"), RAIN("RAIN"), SNOW("SNOW");

	private final String value;

	WeatherType(String description) {
		this.value = description;
	}

	public String getValue() {
		return value;
	}

}
