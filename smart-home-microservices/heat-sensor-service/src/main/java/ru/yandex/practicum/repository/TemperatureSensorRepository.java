package ru.yandex.practicum.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.yandex.practicum.entity.TemperatureSensorEntity;

import java.util.UUID;

@Repository
public interface TemperatureSensorRepository extends JpaRepository<TemperatureSensorEntity, UUID> {
}
