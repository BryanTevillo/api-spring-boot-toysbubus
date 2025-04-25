package com.toysbubus.toysbubus_aplication.machines.infrastructure.adapters.input;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.toysbubus.toysbubus_aplication.machines.application.dto.SaveMachineRequest;
import com.toysbubus.toysbubus_aplication.machines.domain.model.Machine;
import com.toysbubus.toysbubus_aplication.machines.domain.ports.input.CreateMachineUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@AllArgsConstructor
@RestController
@RequestMapping("/machines")
public class MachineController {
    private final CreateMachineUseCase createMachineUseCase;

    @PostMapping("path")
    public ResponseEntity<Machine> postMethodName(@RequestBody SaveMachineRequest request) {
        // TODO: process POST request
        Machine machine = createMachineUseCase.createMachine(request);
        return ResponseEntity.ok(machine);
    }

}
