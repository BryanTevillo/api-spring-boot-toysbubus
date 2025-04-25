package com.toysbubus.toysbubus_aplication.machines.application.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SaveMachineRequest {
    private String name;
    private String model;
    private Double cost; // Added cost field to the request DTO
}
