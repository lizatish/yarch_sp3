package ru.yandex.practicum.repository;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.yandex.practicum.entity.SmartHeatingSystemEntity;

import java.time.LocalDateTime;
import java.util.UUID;

@Repository
public interface SmartHeatingSystemRepository extends JpaRepository<SmartHeatingSystemEntity, UUID> {

}
