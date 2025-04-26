package com.toysbubus.toysbubus_aplication.modules.stores.application.service;

import org.springframework.stereotype.Service;
import com.toysbubus.toysbubus_aplication.modules.stores.domain.model.Store;
import com.toysbubus.toysbubus_aplication.modules.stores.domain.ports.input.SaveStoreCaseUse;
import com.toysbubus.toysbubus_aplication.modules.stores.domain.ports.output.StoreRepositoryPort;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StoreService implements SaveStoreCaseUse {
    private StoreRepositoryPort storeRepositoryPort;

    @Override
    public Store saveStore(Store store) {
        return storeRepositoryPort.save(store);
    }

}
