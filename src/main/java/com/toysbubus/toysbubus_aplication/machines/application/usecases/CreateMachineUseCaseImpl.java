package com.toysbubus.toysbubus_aplication.machines.application.usecases;

import com.toysbubus.toysbubus_aplication.machines.domain.model.Machine;
import com.toysbubus.toysbubus_aplication.machines.domain.ports.input.CreateMachineUseCase;
import com.toysbubus.toysbubus_aplication.machines.domain.ports.output.MachineRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CreateMachineUseCaseImpl implements CreateMachineUseCase {
    private final MachineRepository machineRepository; // Repository for machine operations

    @Override
    public Machine createMachine(String name, Double cost) {
        Machine machine = new Machine(null, name, null, null, null, null, null, cost);
        return machineRepository.save(machine); // Save the machine to the repository and return it
    }


}
