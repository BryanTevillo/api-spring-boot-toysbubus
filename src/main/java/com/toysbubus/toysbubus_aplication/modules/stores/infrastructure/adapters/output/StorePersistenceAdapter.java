package com.toysbubus.toysbubus_aplication.modules.stores.infrastructure.adapters.output;

import org.springframework.stereotype.Repository;
import com.toysbubus.toysbubus_aplication.modules.stores.domain.model.Store;
import com.toysbubus.toysbubus_aplication.modules.stores.domain.ports.output.StoreRepositoryPort;
import com.toysbubus.toysbubus_aplication.modules.stores.infrastructure.entities.StoreEntity;
import com.toysbubus.toysbubus_aplication.modules.stores.infrastructure.mappers.StoreMapper;
import com.toysbubus.toysbubus_aplication.modules.stores.infrastructure.repositories.StoreJpaRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Repository
public class StorePersistenceAdapter implements StoreRepositoryPort {
    private final StoreJpaRepository storeJpaRepository;
    private final StoreMapper mapper;

    @Override
    public Store save(Store store) {
        StoreEntity entity = mapper.toEntity(store);
        StoreEntity savedEntity = storeJpaRepository.save(entity);
        return mapper.toDomain(savedEntity);
    }
}
