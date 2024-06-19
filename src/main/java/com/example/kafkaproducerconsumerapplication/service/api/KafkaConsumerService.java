package com.example.kafkaproducerconsumerapplication.service.api;

import com.example.kafkaproducerconsumerapplication.model.WeatherUpdate;

public interface KafkaConsumerService {

	void consume(WeatherUpdate weatherUpdate);

}
