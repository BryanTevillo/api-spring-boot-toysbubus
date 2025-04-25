package com.toysbubus.toysbubus_aplication.machines.infrastructure.adapters.output;

import org.checkerframework.checker.units.qual.m;
import org.springframework.stereotype.Repository;
import com.toysbubus.toysbubus_aplication.machines.domain.model.Machine;
import com.toysbubus.toysbubus_aplication.machines.domain.ports.output.MachineRepositoryPort;
import com.toysbubus.toysbubus_aplication.machines.infrastructure.entities.MachineEntity;
import com.toysbubus.toysbubus_aplication.machines.infrastructure.repositories.MachineJpaRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Repository
public class MachinePersistenceAdapter implements MachineRepositoryPort {
    private final MachineJpaRepository machineJpaRepository;

    @Override
    public Machine save(Machine machine) {
        // Convert Machine to MachineEntity
        MachineEntity entity = new MachineEntity(machine.getId(), machine.getName(),
                machine.getDescription(), machine.getImageUrl(), machine.getLocation(),
                machine.getStatus(), machine.getModel(), machine.getCost());
        /// save the entity to the database
        MachineEntity savedEntity = machineJpaRepository.save(entity);
        // Convert MachineEntity back to Machine and return it
        return new Machine(savedEntity.getId(), savedEntity.getName(), savedEntity.getDescription(),
                savedEntity.getImageUrl(), savedEntity.getLocation(), savedEntity.getStatus(),
                savedEntity.getModel(), savedEntity.getCost());

    }
}
