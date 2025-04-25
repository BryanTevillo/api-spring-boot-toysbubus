package com.toysbubus.toysbubus_aplication.modules.machines.domain.ports.input;

import com.toysbubus.toysbubus_aplication.modules.machines.application.dto.SaveMachineRequest;
import com.toysbubus.toysbubus_aplication.modules.machines.domain.model.Machine;

public interface CreateMachineUseCase {
    Machine createMachine(SaveMachineRequest request); // Method to create a new machine
}
