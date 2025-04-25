package com.toysbubus.toysbubus_aplication.machines.application.service;

import com.toysbubus.toysbubus_aplication.machines.application.dto.SaveMachineRequest;
import com.toysbubus.toysbubus_aplication.machines.domain.model.Machine;
import com.toysbubus.toysbubus_aplication.machines.domain.ports.input.CreateMachineUseCase;
import com.toysbubus.toysbubus_aplication.machines.domain.ports.output.MachineRepositoryPort;
import lombok.AllArgsConstructor;


@AllArgsConstructor
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
