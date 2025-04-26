package com.toysbubus.toysbubus_aplication.modules.stores.domain.ports.input;

import com.toysbubus.toysbubus_aplication.modules.stores.domain.model.Store;

public interface SaveStoreCaseUse {
    Store saveStore(Store store);
}
