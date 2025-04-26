package com.toysbubus.toysbubus_aplication.modules.machines.application.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MachineRequest {
    @NotBlank(message = "Name is mandatory")
    private String name;
    @NotBlank(message = "Model is mandatory")
    private String model;
    @NotNull(message = "Cost is mandatory")
    private Double cost; // Added cost field to the request DTO
}
