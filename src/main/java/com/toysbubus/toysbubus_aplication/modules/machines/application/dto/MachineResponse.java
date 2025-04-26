package com.toysbubus.toysbubus_aplication.modules.machines.application.dto;

public record MachineResponse(Long id, String name, String description, String imageUrl,
        String location, Boolean status, String model, Double cost) {

}
