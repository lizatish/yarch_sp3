package ru.yandex.practicum.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.yandex.practicum.controller.model.PaymentRequest;
import ru.yandex.practicum.controller.model.PaymentResponse;
import ru.yandex.practicum.service.PaymentService;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;

    @PostMapping("/api/v1/payment")
    @Operation(summary = "Оплата подключения", description = "Произвести оплату подключения устройства")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Платеж совершен"),
            @ApiResponse(responseCode = "400", description = "Платеж не был совершен по какой-либо причине")
    })
    public ResponseEntity<PaymentResponse> payment(@RequestBody PaymentRequest paymentRequest) {
        return ResponseEntity.ok(new PaymentResponse());
    }

    @GetMapping("/api/v1/payment/{paymentId}")
    @Operation(summary = "Проверка статуса платежа", description = "Получить статус Платежа")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Платеж найден"),
            @ApiResponse(responseCode = "404", description = "Платежа с таким paymentId не существует")
    })
    public ResponseEntity<PaymentResponse> getPayment(@PathVariable
                                                      @Parameter(name = "paymentId",
                                                              description = "Уникальный номер платежа", example = "bd4840ff-7daf-4b3b-9f63-f292dd7878ae")
                                                      UUID paymentId) {
        return ResponseEntity.ok(new PaymentResponse());
    }


}
