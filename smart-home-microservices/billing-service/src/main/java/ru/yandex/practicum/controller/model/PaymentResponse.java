package ru.yandex.practicum.controller.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.UUID;

@Data
public class PaymentResponse {

    @Schema(name = "paymentId", description = "Уникальный номер платежа", example = "bd4840ff-7daf-4b3b-9f63-f292dd7878ae")
    private UUID paymentId;
    @Schema(name = "status", description = "Статус платежа", example = "Done")
    private String status;

}
