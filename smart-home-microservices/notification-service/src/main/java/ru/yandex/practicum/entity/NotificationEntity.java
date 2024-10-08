package ru.yandex.practicum.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class NotificationEntity {

    @Id
    private UUID id;
    private UUID userId;
    private NotificationType notificationType;
    private String message;
    private String email;

}
