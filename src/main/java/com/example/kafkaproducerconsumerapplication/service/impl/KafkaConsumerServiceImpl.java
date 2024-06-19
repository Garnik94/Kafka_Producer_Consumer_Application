package com.example.kafkaproducerconsumerapplication.service.impl;

import com.example.kafkaproducerconsumerapplication.model.WeatherUpdate;
import com.example.kafkaproducerconsumerapplication.repository.WeatherUpdatesRepository;
import com.example.kafkaproducerconsumerapplication.service.api.KafkaConsumerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerServiceImpl implements KafkaConsumerService {

	private final Logger logger = LoggerFactory.getLogger(KafkaConsumerServiceImpl.class);

	private final WeatherUpdatesRepository weatherUpdatesRepository;

	public KafkaConsumerServiceImpl(WeatherUpdatesRepository weatherUpdatesRepository) {
		this.weatherUpdatesRepository = weatherUpdatesRepository;
	}

	@KafkaListener(topics = "${weather.topic}", groupId = "group_id")
	public void consume(WeatherUpdate weatherUpdate) {
		logger.info("Message successfully consumed.");
		weatherUpdatesRepository.save(weatherUpdate);
	}

}
