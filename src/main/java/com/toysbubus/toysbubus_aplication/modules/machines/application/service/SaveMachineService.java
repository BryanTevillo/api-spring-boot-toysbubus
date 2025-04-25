package com.toysbubus.toysbubus_aplication.modules.machines.application.service;

import org.springframework.stereotype.Service;
import com.toysbubus.toysbubus_aplication.modules.machines.application.dto.SaveMachineRequest;
import com.toysbubus.toysbubus_aplication.modules.machines.domain.model.Machine;
import com.toysbubus.toysbubus_aplication.modules.machines.domain.ports.input.CreateMachineUseCase;
import com.toysbubus.toysbubus_aplication.modules.machines.domain.ports.output.MachineRepositoryPort;
import lombok.AllArgsConstructor;


@AllArgsConstructor
@Service
public class SaveMachineService implements CreateMachineUseCase {
    private final MachineRepositoryPort machineRepositoryPort;

    @Override
    public Machine createMachine(SaveMachineRequest request) {
        // convert request(DTO) to domain model
        Machine machine = new Machine(null, request.getName(), null, null, null, null,
                request.getModel(), request.getCost());

        return machineRepositoryPort.save(machine);

    }
}
