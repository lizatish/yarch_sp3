package ru.yandex.practicum.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.yandex.practicum.repository.TemperatureSensorRepository;

@Service
@RequiredArgsConstructor
public class TemperatureSensorService {

    private final TemperatureSensorRepository temperatureSensorRepository;

}
