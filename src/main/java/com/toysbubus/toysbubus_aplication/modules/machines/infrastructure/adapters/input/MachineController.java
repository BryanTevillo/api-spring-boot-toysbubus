package com.toysbubus.toysbubus_aplication.modules.machines.infrastructure.adapters.input;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.toysbubus.toysbubus_aplication.modules.machines.application.dto.MachineIdRequest;
import com.toysbubus.toysbubus_aplication.modules.machines.application.dto.MachineRequest;
import com.toysbubus.toysbubus_aplication.modules.machines.application.dto.MachineResponse;
import com.toysbubus.toysbubus_aplication.modules.machines.domain.model.Machine;
import com.toysbubus.toysbubus_aplication.modules.machines.domain.ports.input.SaveMachineUseCase;
import com.toysbubus.toysbubus_aplication.modules.machines.domain.ports.input.GetMachineUseCase;
import com.toysbubus.toysbubus_aplication.modules.machines.infrastructure.mappers.MachineMapper;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@AllArgsConstructor
@RestController
@RequestMapping("/machines")
public class MachineController {
    private final SaveMachineUseCase createMachineUseCase;
    private final GetMachineUseCase getMachineUseCase;
    private final MachineMapper mapper;

    @PostMapping("/create")
    public ResponseEntity<MachineResponse> createMachine(
            @Valid @RequestBody MachineRequest request) {
        Machine machine = mapper.toDomain(request);
        Machine savedMachine = createMachineUseCase.saveMachine(machine);
        MachineResponse response = mapper.toResponse(savedMachine);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/find-by-id")
    public ResponseEntity<MachineResponse> findById(@Valid @RequestBody MachineIdRequest request) {
        Machine machine = getMachineUseCase.getMachineById(request.getId());
        return ResponseEntity.ok(mapper.toResponse(machine));
    }

    @PostMapping("/find-all")
    public ResponseEntity<List<MachineResponse>> findAll() {
        List<Machine> machines = getMachineUseCase.getAllMachines();
        List<MachineResponse> response = machines.stream().map(mapper::toResponse).toList();
        return ResponseEntity.ok(response);
    }

}
