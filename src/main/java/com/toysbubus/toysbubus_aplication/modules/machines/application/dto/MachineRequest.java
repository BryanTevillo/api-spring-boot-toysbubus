package com.toysbubus.toysbubus_aplication.modules.machines.application.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;



public record MachineRequest(@NotBlank(message = "Name is mandatory") String name,
        @NotBlank(message = "Model is mandatory") String model,
        @NotNull(message = "Cost is mandatory") Double cost) {

}
