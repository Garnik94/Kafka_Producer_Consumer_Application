package com.example.kafkaproducerconsumerapplication.controller;

import com.example.kafkaproducerconsumerapplication.dto.WeatherUpdateDTO;
import com.example.kafkaproducerconsumerapplication.service.api.KafkaProducerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaProducerController {

	private final Logger logger = LoggerFactory.getLogger(KafkaProducerController.class);

	private final KafkaProducerService kafkaProducerService;

	public KafkaProducerController(KafkaProducerService kafkaProducerService) {
		this.kafkaProducerService = kafkaProducerService;
	}

	@PostMapping("/produce")
	public void produceMessage(@RequestBody WeatherUpdateDTO weatherUpdateDTO) {
		kafkaProducerService.produce(weatherUpdateDTO);
		logger.info("Message produced");
	}

}
