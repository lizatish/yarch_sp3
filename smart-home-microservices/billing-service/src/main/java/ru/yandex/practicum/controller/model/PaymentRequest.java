package ru.yandex.practicum.controller.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class PaymentRequest {

    @Schema(name = "token", example = "",
            description = "Токен для доступа к api")
    private String token;
    @Schema(name = "payeeINN", description = "ИНН юр.лица или ИП", example = "7743013902 ")
    private String payeeINN;
    @Schema(name = "name",description = "Наименование юр.лица или ИП", example = "ООО Лиза")
    private String name;
    @Schema(name = "bic", description = "БИК банка", example = "044511974")
    private String bic;
    @Schema(name = "personalAcc", description = "Расчётный счёт", example = "40817810099910004312")
    private String personalAcc;
    @Schema(name = "lastName", description = "ФИО плательщика", example = "Лизина Елизавета Елизовна")
    private String lastName;
    @Schema(name = "purpose", description = "Назначение", example = "Оплата услуг умных датчиков")
    private String purpose;
    @Schema(name = "sum", description = "Сумма рублей", example = "1000")
    private Integer sum;
    @Schema(name = "sumKop", description = "Сумма копеек", example = "00")
    private Integer sumKop;

}