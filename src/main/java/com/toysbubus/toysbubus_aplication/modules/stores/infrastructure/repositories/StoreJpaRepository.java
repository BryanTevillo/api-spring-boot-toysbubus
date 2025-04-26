package com.toysbubus.toysbubus_aplication.modules.stores.infrastructure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.toysbubus.toysbubus_aplication.modules.stores.infrastructure.entities.StoreEntity;

public interface StoreJpaRepository extends JpaRepository<StoreEntity, Long> {

}
