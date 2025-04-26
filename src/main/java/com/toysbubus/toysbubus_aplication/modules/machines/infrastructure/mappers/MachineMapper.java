package com.toysbubus.toysbubus_aplication.modules.machines.infrastructure.mappers;

import org.mapstruct.Mapper;
import com.toysbubus.toysbubus_aplication.modules.machines.domain.model.Machine;
import com.toysbubus.toysbubus_aplication.modules.machines.infrastructure.entities.MachineEntity;

@Mapper(componentModel = "spring")
public interface MachineMapper {
    // Mapstruct will generate the implementation of this interface at compile time
    Machine toDomain(MachineEntity machineEntity);

    // Convert MachineEntity to Machine domain model
    MachineEntity toEntity(Machine machine);
}
