package com.example.kafkaproducerconsumerapplication.service.api;

import com.example.kafkaproducerconsumerapplication.dto.WeatherUpdateDTO;

public interface KafkaProducerService {

	void produce(WeatherUpdateDTO weatherUpdateDTO);

}
