package com.toysbubus.toysbubus_aplication.modules.machines.infrastructure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.toysbubus.toysbubus_aplication.modules.machines.infrastructure.entities.MachineEntity;

public interface MachineJpaRepository extends JpaRepository<MachineEntity, Long> {

}
