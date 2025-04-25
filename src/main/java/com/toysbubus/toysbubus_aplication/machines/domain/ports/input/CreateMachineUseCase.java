package com.toysbubus.toysbubus_aplication.machines.domain.ports.input;

import com.toysbubus.toysbubus_aplication.machines.domain.model.Machine;

public interface CreateMachineUseCase {
    Machine createMachine(String name, Double cost); // Method to create a new machine
}
