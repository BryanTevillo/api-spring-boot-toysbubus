package com.toysbubus.toysbubus_aplication.modules.machines.application.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public final class MachineIdRequest {
    @NotNull(message = "Id is mandatory")
    @Min(value = 1, message = "Id must be greater than 0")
    private final Long id;
}
