package ru.yandex.practicum.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.yandex.practicum.controller.model.HeatingSystemRequest;
import ru.yandex.practicum.controller.model.HeatingSystemResponse;
import ru.yandex.practicum.controller.model.HeatingSystemUpdateRequest;
import ru.yandex.practicum.service.HeatingSystemService;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class SmartHeatingSystemController {

    private final HeatingSystemService heatingSystemService;

    @PostMapping("/api/v1/smart-heating-system")
    @Operation(summary = "Зарегистрировать устройство", description = "Зарегистрировать устройство")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Устройство зарегистрировано"),
            @ApiResponse(responseCode = "409", description = "Устройство было зарегистрировано ранее")
    })
    public ResponseEntity<HeatingSystemResponse> createHeatingSystem(@RequestBody HeatingSystemRequest heatingSystemRequests) {
        return ResponseEntity.ok(new HeatingSystemResponse());
    }

    @GetMapping("/api/v1/smart-heating-system/{id}")
    @Operation(summary = "Получить данные об устройстве", description = "Получить данные об устройстве системы отопления")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Данные об устройстве получены"),
            @ApiResponse(responseCode = "404", description = "Устройства с таким id не существует")
    })
    public ResponseEntity<HeatingSystemResponse> getHeatingSystem(@PathVariable
                                                                  @Parameter(name = "id",
                                                                          description = "Уникальный номер устройства", example = "bd4840ff-7daf-4b3b-9f63-f292dd7878ae")
                                                                  UUID id) {
        return ResponseEntity.ok(new HeatingSystemResponse());
    }

    @PutMapping("/api/v1/smart-heating-system/{id}")
    @Operation(summary = "Изменить температуру в системе отопления", description = "Задать новую температуру на устройстве системы отопления")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Температура изменена"),
            @ApiResponse(responseCode = "404", description = "Устройства с таким id не существует")
    })
    public ResponseEntity<HeatingSystemResponse> updateHeatingSystem(@PathVariable("id") UUID id,
                                                                     @RequestBody HeatingSystemUpdateRequest request) {
        return ResponseEntity.ok(new HeatingSystemResponse());
    }

}
