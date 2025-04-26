package com.toysbubus.toysbubus_aplication.modules.machines.domain.ports.input;

import com.toysbubus.toysbubus_aplication.modules.machines.domain.model.Machine;

public interface CreateMachineUseCase {
    Machine createMachine(Machine machine); // Method to create a new machine
}
