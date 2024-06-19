package com.example.kafkaproducerconsumerapplication.service;

import com.example.kafkaproducerconsumerapplication.dto.WeatherUpdateDTO;
import com.example.kafkaproducerconsumerapplication.dto.mapper.WeatherUpdateMapper;
import com.example.kafkaproducerconsumerapplication.model.WeatherUpdate;
import com.example.kafkaproducerconsumerapplication.service.api.KafkaProducerService;
import com.example.kafkaproducerconsumerapplication.service.impl.KafkaProducerServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.kafka.core.KafkaTemplate;

import java.util.Date;

import static org.mockito.Mockito.*;

public class KafkaProducerServiceTest {

    @Test
    public void shouldProduce() {
        KafkaTemplate<String, WeatherUpdate> kafkaTemplate = mock(KafkaTemplate.class);
        KafkaProducerService kafkaProducerService = new KafkaProducerServiceImpl(kafkaTemplate, "weather");

        WeatherUpdateDTO weatherUpdateDTO = new WeatherUpdateDTO(
                "Yerevan",
                29.4,
                2,
                "SUNNY",
                new Date());
        WeatherUpdate weatherUpdate = WeatherUpdateMapper.toModel(weatherUpdateDTO);

        kafkaProducerService.produce(weatherUpdateDTO);

        verify(kafkaTemplate, times(1)).send("weather", weatherUpdate);
    }

}
