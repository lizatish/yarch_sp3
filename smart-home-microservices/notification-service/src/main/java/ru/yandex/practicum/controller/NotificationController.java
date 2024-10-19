package ru.yandex.practicum.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.yandex.practicum.controller.model.CreateNotificationRequest;
import ru.yandex.practicum.service.NotificationService;

@RestController
@RequiredArgsConstructor
public class NotificationController {

    private final NotificationService notificationService;

    @PostMapping("/api/v1/notification")
    @Operation(summary = "Отправить уведомление", description = "Отправить уведомление")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Уведомление отправлено"),
            @ApiResponse(responseCode = "400", description = "Ошибка отправки уведомления")
    })
    public void createNotification(@RequestBody CreateNotificationRequest request) {
    }

}
