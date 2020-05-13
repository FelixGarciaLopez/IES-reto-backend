package com.ies.retocapacitacionbackend.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ies.retocapacitacionbackend.model.Machine;
import com.ies.retocapacitacionbackend.service.MachineService;

@RestController
@RequestMapping("machine")
public class MachineController {
	
	private final MachineService machineService;
	
	public MachineController (MachineService machine) {
		this.machineService = machine;
	}
	
	@PostMapping("/")
    public void save(@RequestBody Machine machine) {
		machineService.save(machine);
    }
	
	@PutMapping("/{id}")
	public void update(@RequestBody Machine machine, @PathVariable Long id) {
		machineService.update(machine, id);
	}
	
	@GetMapping("/listAll")
    public Iterable<Machine> listAllMachine() {
        return machineService.listMachine();
    }
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		machineService.delete(id);
	}
	
	

}
