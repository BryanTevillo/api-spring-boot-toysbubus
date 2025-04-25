package com.toysbubus.toysbubus_aplication.machines.infrastructure.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import com.toysbubus.toysbubus_aplication.machines.domain.model.Machine;

public interface MachineRepositoryJpa extends JpaRepository<Machine, Long> {

}
