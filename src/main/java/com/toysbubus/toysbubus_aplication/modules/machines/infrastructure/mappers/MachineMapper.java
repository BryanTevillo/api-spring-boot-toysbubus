package com.toysbubus.toysbubus_aplication.modules.machines.infrastructure.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import com.toysbubus.toysbubus_aplication.modules.machines.application.dto.MachineRequest;
import com.toysbubus.toysbubus_aplication.modules.machines.application.dto.MachineResponse;
import com.toysbubus.toysbubus_aplication.modules.machines.domain.model.Machine;
import com.toysbubus.toysbubus_aplication.modules.machines.infrastructure.entities.MachineEntity;

@Mapper(componentModel = "spring")
public interface MachineMapper {
    // to Persistence layer
    // Mapstruct will generate the implementation of this interface at compile time
    Machine toDomain(MachineEntity machineEntity);

    // Convert MachineEntity to Machine domain model
    MachineEntity toEntity(Machine machine);

    // to API (Controller) layer

    // Convert MachineRequest DTO to Machine domain model
    @Mapping(target = "id", ignore = true) // Ignore the id field in the request
    @Mapping(target = "description", ignore = true) // Ignore the description field in the request
    @Mapping(target = "location", ignore = true) // Ignore the location field in the request
    @Mapping(target = "status", constant = "true") // Ignore the status field in the request
    @Mapping(target = "imageUrl", ignore = true) // Ignore the imageUrl field in the request
    Machine toDomain(MachineRequest request);

    // Convert Maachine domain model to MachineResponse DTO
    MachineResponse toResponse(Machine machine);
}
