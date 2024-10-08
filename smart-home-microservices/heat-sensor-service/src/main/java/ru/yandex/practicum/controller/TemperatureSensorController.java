package ru.yandex.practicum.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.yandex.practicum.controller.model.TemperatureSensorRequest;
import ru.yandex.practicum.controller.model.TemperatureSensorResponse;
import ru.yandex.practicum.service.TemperatureSensorService;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class TemperatureSensorController {

    private final TemperatureSensorService temperatureSensorService;

    @PostMapping("/api/v1/heating-sensor")
    @Operation(summary = "Зарегистрировать устройство", description = "Зарегистрировать устройство")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Устройство зарегистрировано"),
            @ApiResponse(responseCode = "409", description = "Устройство было зарегистрировано ранее")
    })
    public ResponseEntity<TemperatureSensorResponse> create(@RequestBody TemperatureSensorRequest request) {
        return ResponseEntity.ok(new TemperatureSensorResponse());
    }

    @GetMapping("/api/v1/heating-sensor/{id}")
    @Operation(summary = "Получить данные устройства", description = "Получить данные об устройстве датчика температуры")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Данные об устройстве получены"),
            @ApiResponse(responseCode = "404", description = "Устройства с таким id не существует")
    })
    public ResponseEntity<TemperatureSensorResponse> getTemperatureSensor(@PathVariable
                                                                          @Parameter(name = "id",
                                                                                  description = "Уникальный номер устройства",
                                                                                  example = "bd4840ff-7daf-4b3b-9f63-f292dd7878ae")
                                                                          UUID id) {
        return ResponseEntity.ok(new TemperatureSensorResponse());
    }

}
