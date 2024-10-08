package ru.yandex.practicum.controller.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class HeatingSystemResponse {

    @Schema(name = "id", description = "Идентификатор устройства", example = "bd4840ff-7daf-4b3b-9f63-f292dd7878ae")
    private UUID id;
    @Schema(name = "currentTemperature", description = "Текущая температура", example = "23.1")
    private Double currentTemperature;
    @Schema(name = "lastUpdated", description = "Последнее обновление", example = "2024-01-01T14:20:00Z")
    private LocalDateTime lastUpdated;

}
