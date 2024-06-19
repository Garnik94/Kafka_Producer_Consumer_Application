package com.example.kafkaproducerconsumerapplication.repository;

import com.example.kafkaproducerconsumerapplication.model.WeatherUpdate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeatherUpdatesRepository extends JpaRepository<WeatherUpdate, Long> {

}
