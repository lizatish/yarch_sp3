package ru.yandex.practicum.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.yandex.practicum.service.TemperatureSensorService;

@RestController
@RequiredArgsConstructor
public class TemperatureSensorController {

    private final TemperatureSensorService temperatureSensorService;

    @PostMapping("/api/v1/heating-sensor")
    public void create() {

    }

    @GetMapping("/api/v1/heating-sensor/{id}")
    public void get() {

    }

    @PutMapping("/api/v1/heating-sensor/{id}")
    public void update() {

    }

}
