package com.toysbubus.toysbubus_aplication.modules.machines.domain.ports.output;

import com.toysbubus.toysbubus_aplication.modules.machines.domain.model.Machine;

public interface MachineRepositoryPort {
    Machine save(Machine machine); // Method to save a machine to the repository
}
