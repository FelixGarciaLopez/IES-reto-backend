package com.ies.retocapacitacionbackend.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ies.retocapacitacionbackend.exceptions.MachineAlreadyExistException;
import com.ies.retocapacitacionbackend.exceptions.ModelNotFoundException;
import com.ies.retocapacitacionbackend.model.Machine;
import com.ies.retocapacitacionbackend.repository.IMachine;

@Service
public class MachineService {
	
	private final IMachine iMachine;
	
	public MachineService(IMachine iMachine) {
		this.iMachine = iMachine;
	}
	public void save(Machine machine) {
		Optional<Machine> idMachine = iMachine.findById(machine.getIdMachine());
		if(idMachine.isPresent()) {
			throw new MachineAlreadyExistException("Machine is already exist");
		}
		iMachine.save(machine);
	}
	public void update(Machine machine, Long id) {
		Optional<Machine> idMachine = iMachine.findById(id);
		if(!idMachine.isPresent()) {
			throw new ModelNotFoundException("Machine not found");
		}
		iMachine.save(machine);
	}
	public Iterable<Machine> listMachine(){ 
		return iMachine.findAll();
	}
	
	public void delete(Long id) { 
		iMachine.deleteById(id);
		
	}
}
