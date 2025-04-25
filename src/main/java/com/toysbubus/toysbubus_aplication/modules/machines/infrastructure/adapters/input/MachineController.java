package com.toysbubus.toysbubus_aplication.modules.machines.infrastructure.adapters.input;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.toysbubus.toysbubus_aplication.modules.machines.application.dto.SaveMachineRequest;
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

    @PostMapping
    public ResponseEntity<Machine> postMethodName(@RequestBody @Valid SaveMachineRequest request) {
        // TODO: process POST request
        Machine machine = createMachineUseCase.createMachine(request);
        return ResponseEntity.ok(machine);
    }

}
