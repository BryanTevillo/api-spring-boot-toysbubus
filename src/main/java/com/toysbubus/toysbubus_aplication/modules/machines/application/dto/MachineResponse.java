package com.toysbubus.toysbubus_aplication.modules.machines.application.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MachineResponse {
    private Long id;
    private String name;
    private String description;
    private String imageUrl;
    private String location;
    private Boolean status;
    private String model;
    private Double cost;
}
