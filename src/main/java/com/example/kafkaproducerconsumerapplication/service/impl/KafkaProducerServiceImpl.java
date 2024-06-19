package com.example.kafkaproducerconsumerapplication.service.impl;

import com.example.kafkaproducerconsumerapplication.dto.WeatherUpdateDTO;
import com.example.kafkaproducerconsumerapplication.dto.mapper.WeatherUpdateMapper;
import com.example.kafkaproducerconsumerapplication.model.WeatherUpdate;
import com.example.kafkaproducerconsumerapplication.service.api.KafkaProducerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerServiceImpl implements KafkaProducerService {

    private final Logger logger = LoggerFactory.getLogger(KafkaProducerServiceImpl.class);

    private final KafkaTemplate<String, WeatherUpdate> kafkaTemplate;

    private final String topic;

    public KafkaProducerServiceImpl(KafkaTemplate<String, WeatherUpdate> kafkaTemplate,
                                    @Value("${weather.topic}") String topic) {
        this.kafkaTemplate = kafkaTemplate;
        this.topic = topic;
    }

    public void produce(WeatherUpdateDTO weatherUpdateDTO) {
        logger.info("Producing...");
        WeatherUpdate weatherUpdate = WeatherUpdateMapper.toModel(weatherUpdateDTO);
        kafkaTemplate.send(topic, weatherUpdate);
    }
}
