package com.toysbubus.toysbubus_aplication.modules.stores.domain.ports.output;

import com.toysbubus.toysbubus_aplication.modules.stores.domain.model.Store;

public interface StoreRepositoryPort {
    Store save(Store store);
}
