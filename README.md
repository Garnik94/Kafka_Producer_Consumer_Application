This project implements a service for receiving weather updates in the form of JSON messages from Kafka and writing 
them to a PostgreSQL database. It uses Spring Boot, Spring Kafka and JPA (Hibernate) to work with data.

The project has the following architecture

## Testing (package test)
KafkaConsumerServiceImplTest.java - Test class for KafkaConsumerServiceImpl.

## Configuration (package config)
KafkaConfig.java - Configuration class for setting up Kafka producer and consumer.

## Controller (package controller)
KafkaProducerController.java - A REST controller that accepts HTTP POST requests to send weather messages to Kafka.
POST request body example
{
    "location": "Yerevan",
    "temperature": 21.8,
    "windSpeed": 2,
    "weatherType": "SUNNY",
    "date": "2024-06-19"
}

## Data Models (package model)
WeatherUpdate.java - An entity class representing weather data.
WeatherUpdateBuilder.java - Builder for creating instances of a class WeatherUpdate
WeatherType.java - Enumeration representing possible weather types.

## Data Transfer Object (package dto)
WeatherUpdateMapper.java - The class represents a Data Transfer Object (DTO) for transferring data.
WeatherUpdateDTO.java - The Class responsible for converting DTO objects into model objects.

## Repository (package repository)
WeatherUpdateRepository.java - JPA repository interface for interacting with the database.

## Services (package service)
KafkaConsumerService.java - Consumer service interface.
KafkaConsumerServiceImpl.java - Consumer service implementation.
KafkaProducerService.java - Producer service interface.
KafkaProducerServiceImpl.java - Producer service implementation.
