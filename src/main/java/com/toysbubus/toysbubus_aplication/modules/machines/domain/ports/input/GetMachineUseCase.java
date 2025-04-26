package com.toysbubus.toysbubus_aplication.modules.machines.domain.ports.input;

import java.util.List;
import com.toysbubus.toysbubus_aplication.modules.machines.domain.model.Machine;

public interface GetMachineUseCase {
    // Method to get all machines
    List<Machine> getAllMachines();

    // Method to get a machinne by id
    Machine getMachineById(Long id);
}
