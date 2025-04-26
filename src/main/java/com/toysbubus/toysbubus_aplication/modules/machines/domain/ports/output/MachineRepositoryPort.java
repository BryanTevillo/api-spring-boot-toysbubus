package com.toysbubus.toysbubus_aplication.modules.machines.domain.ports.output;

import java.util.List;
import com.toysbubus.toysbubus_aplication.modules.machines.domain.model.Machine;

public interface MachineRepositoryPort {
    Machine save(Machine machine); // Method to save a machine to the repository

    Machine findById(Long id); // Method to find a machine by its ID

    List<Machine> findAll(); // Method to find all machines
}
