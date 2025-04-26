package com.toysbubus.toysbubus_aplication.modules.stores.infrastructure.mappers;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import com.toysbubus.toysbubus_aplication.modules.stores.application.dto.StoreRequest;
import com.toysbubus.toysbubus_aplication.modules.stores.application.dto.StoreResponse;
import com.toysbubus.toysbubus_aplication.modules.stores.domain.model.Store;
import com.toysbubus.toysbubus_aplication.modules.stores.infrastructure.entities.StoreEntity;

@Mapper(componentModel = "spring")
public interface StoreMapper {
    // to persistent layer
    StoreEntity toEntity(Store store);

    Store toDomain(StoreEntity entityStore);

    // to API (Controller) layer
    @Mapping(target = "id", ignore = true)
    Store toDomain(StoreRequest request);

    StoreResponse toResponse(Store store);

}
