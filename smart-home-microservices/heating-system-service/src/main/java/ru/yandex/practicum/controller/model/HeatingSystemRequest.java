package ru.yandex.practicum.controller.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.UUID;

@Data
public class HeatingSystemRequest {

    @Schema(name = "userId", description = "Идентификатор пользователя", example = "bd4840ff-7daf-4b3b-9f63-f292dd7878ae")
    private UUID userId;
    @Schema(name = "deviceId", description = "Идентификатор устройства", example = "bd4840ff-7daf-4b3b-9f63-f292dd7878ae")
    private UUID deviceId;

}
