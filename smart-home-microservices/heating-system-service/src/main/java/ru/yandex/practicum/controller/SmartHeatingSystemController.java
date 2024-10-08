package ru.yandex.practicum.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.yandex.practicum.service.HeatingSystemService;

@RestController
@RequiredArgsConstructor
public class SmartHeatingSystemController {

    private final HeatingSystemService heatingSystemService;

    @PostMapping("/api/v1/smart-heating-system")
    public void create() {

    }

    @GetMapping("/api/v1/smart-heating-system/{id}")
    public void get() {

    }

    @PutMapping("/api/v1/smart-heating-system/{id}")
    public void update() {

    }

}
