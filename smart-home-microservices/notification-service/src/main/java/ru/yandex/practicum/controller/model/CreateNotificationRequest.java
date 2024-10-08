package ru.yandex.practicum.controller.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import ru.yandex.practicum.entity.NotificationType;

import java.util.UUID;

@Data
public class CreateNotificationRequest {

    @Schema(name = "userId", description = "Идентификатор пользователя", example = "bd4840ff-7daf-4b3b-9f63-f292dd7878ae")
    private UUID userId;
    @Schema(name = "email", description = "Почта пользователя", example = "liza@liza.com")
    private String email;
    @Schema(name = "type", description = "Тип уведомления", example = "SETUP_DEVICE")
    private NotificationType type;
    @Schema(name = "message", description = "Уведомление", example = "Устройство зарегистрировано")
    private String message;

}
