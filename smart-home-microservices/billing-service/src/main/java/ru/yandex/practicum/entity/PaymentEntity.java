package ru.yandex.practicum.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
public class PaymentEntity {

    @Id
    private UUID id;
    private UUID deviceId;
    private DeviceType deviceType;
    private UUID userId;
    private Double sum;
    private LocalDateTime date;


}
