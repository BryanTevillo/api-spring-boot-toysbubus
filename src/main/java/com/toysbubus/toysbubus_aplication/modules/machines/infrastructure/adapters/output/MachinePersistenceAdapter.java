package com.toysbubus.toysbubus_aplication.modules.machines.infrastructure.adapters.output;


import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.toysbubus.toysbubus_aplication.modules.machines.domain.model.Machine;
import com.toysbubus.toysbubus_aplication.modules.machines.domain.ports.output.MachineRepositoryPort;
import com.toysbubus.toysbubus_aplication.modules.machines.infrastructure.entities.MachineEntity;
import com.toysbubus.toysbubus_aplication.modules.machines.infrastructure.mappers.MachineMapper;
import com.toysbubus.toysbubus_aplication.modules.machines.infrastructure.repositories.MachineJpaRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Repository
public class MachinePersistenceAdapter implements MachineRepositoryPort {
    private final MachineJpaRepository machineJpaRepository;
    private final MachineMapper mapper;

    @Override
    public Machine save(Machine machine) {
        // Convert Machine to MachineEntity
        MachineEntity entity = mapper.toEntity(machine);
        /// save the entity to the database
        MachineEntity savedEntity = machineJpaRepository.save(entity);
        // Convert MachineEntity back to Machine and return it
        return mapper.toDomain(savedEntity);

    }

    @Override
    public Machine findById(Long id) {
        return machineJpaRepository.findById(id).map(mapper::toDomain).orElse(null);
    }

    @Override
    public List<Machine> findAll() {
        return machineJpaRepository.findAll().stream().map(mapper::toDomain).toList();
    }
}
