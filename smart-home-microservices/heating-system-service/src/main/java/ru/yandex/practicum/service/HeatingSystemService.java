package ru.yandex.practicum.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.yandex.practicum.repository.SmartHeatingSystemRepository;

@Service
@RequiredArgsConstructor
public class HeatingSystemService {

    private final SmartHeatingSystemRepository smartHeatingSystemRepository;

}
