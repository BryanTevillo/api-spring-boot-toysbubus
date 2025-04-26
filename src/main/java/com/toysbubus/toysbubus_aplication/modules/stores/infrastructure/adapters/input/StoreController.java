package com.toysbubus.toysbubus_aplication.modules.stores.infrastructure.adapters.input;



import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.toysbubus.toysbubus_aplication.modules.stores.application.dto.StoreRequest;
import com.toysbubus.toysbubus_aplication.modules.stores.application.dto.StoreResponse;
import com.toysbubus.toysbubus_aplication.modules.stores.domain.model.Store;
import com.toysbubus.toysbubus_aplication.modules.stores.domain.ports.input.SaveStoreCaseUse;
import com.toysbubus.toysbubus_aplication.modules.stores.infrastructure.mappers.StoreMapper;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@AllArgsConstructor
@Controller
@RequestMapping("/stores")
public class StoreController {
    private final SaveStoreCaseUse saveStoreCaseUse;
    private final StoreMapper mapper;

    @PostMapping("/create")
    public ResponseEntity<StoreResponse> createStore(@Valid @RequestBody StoreRequest request) {
        Store store = mapper.toDomain(request);
        Store savedStore = saveStoreCaseUse.saveStore(store);
        return ResponseEntity.ok(mapper.toResponse(savedStore));

    }


}
