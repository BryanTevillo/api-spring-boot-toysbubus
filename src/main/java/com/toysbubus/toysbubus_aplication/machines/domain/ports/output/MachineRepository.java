package com.toysbubus.toysbubus_aplication.machines.domain.ports.output;

import com.toysbubus.toysbubus_aplication.machines.domain.model.Machine;

public interface MachineRepository {
    Machine save(Machine machine); // Method to save a machine to the repository
}
