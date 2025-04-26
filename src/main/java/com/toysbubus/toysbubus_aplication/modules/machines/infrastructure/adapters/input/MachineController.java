package com.toysbubus.toysbubus_aplication.modules.machines.infrastructure.adapters.input;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.toysbubus.toysbubus_aplication.modules.machines.application.dto.MachineRequest;
import com.toysbubus.toysbubus_aplication.modules.machines.application.dto.MachineResponse;
import com.toysbubus.toysbubus_aplication.modules.machines.domain.model.Machine;
import com.toysbubus.toysbubus_aplication.modules.machines.domain.ports.input.CreateMachineUseCase;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@AllArgsConstructor
@RestController
@RequestMapping("/machines")
public class MachineController {
    private final CreateMachineUseCase createMachineUseCase;

    @PostMapping("/create")
    public ResponseEntity<MachineResponse> postMethodName(
            @Valid @RequestBody MachineRequest request) {
        // TODO: process POST request
        Machine machine = new Machine(null, request.getName(), null, null, null, null,
                request.getModel(), request.getCost());
        Machine savedMachine = createMachineUseCase.createMachine(machine);
        MachineResponse response = new MachineResponse(savedMachine.getId(), savedMachine.getName(),
                savedMachine.getDescription(), savedMachine.getImageUrl(),
                savedMachine.getLocation(), savedMachine.getStatus(), savedMachine.getModel(),
                savedMachine.getCost());
        return ResponseEntity.ok(response);
    }



}
