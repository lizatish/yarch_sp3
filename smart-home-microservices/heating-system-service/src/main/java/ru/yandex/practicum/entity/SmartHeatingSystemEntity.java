package ru.yandex.practicum.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
public class SmartHeatingSystemEntity {

    @Id
    private UUID id;
    private Double lastTemperature;
    private LocalDateTime lastUpdated;

}
