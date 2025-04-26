package com.toysbubus.toysbubus_aplication.modules.machines.application.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.toysbubus.toysbubus_aplication.modules.machines.domain.model.Machine;
import com.toysbubus.toysbubus_aplication.modules.machines.domain.ports.input.SaveMachineUseCase;
import com.toysbubus.toysbubus_aplication.modules.machines.domain.ports.input.GetMachineUseCase;
import com.toysbubus.toysbubus_aplication.modules.machines.domain.ports.output.MachineRepositoryPort;
import lombok.AllArgsConstructor;


@AllArgsConstructor
@Service
public class MachineService implements SaveMachineUseCase, GetMachineUseCase {
    private final MachineRepositoryPort machineRepositoryPort;


    // This method is used to create a new machine
    @Override
    public Machine saveMachine(Machine machine) {
        return machineRepositoryPort.save(machine);
    }

    @Override
    public Machine getMachineById(Long id) {
        return machineRepositoryPort.findById(id);
    }


    @Override
    public List<Machine> getAllMachines() {
        return machineRepositoryPort.findAll();
    }
}
