package com.ies.retocapacitacionbackend.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ies.retocapacitacionbackend.exceptions.CasinoAlreadyExistException;
import com.ies.retocapacitacionbackend.exceptions.ModelNotFoundException;
import com.ies.retocapacitacionbackend.model.Casino;
import com.ies.retocapacitacionbackend.repository.ICasino;


@Service
public class CasinoService {
	
	private final ICasino iCasino;
	
	public CasinoService(ICasino iCasino) {
		this.iCasino = iCasino;
	}
	
	public void save(Casino casino) {
		Optional<Casino>IdCasino = iCasino.findById(casino.getIdCasino());
		if(IdCasino.isPresent()) {
			throw new CasinoAlreadyExistException ("Casino is already exist");
		}
		iCasino.save(casino);
	}
	
	public void update(Casino casino, long id) {
		Optional<Casino> IdCasino = iCasino.findById(id);
		if(!IdCasino.isPresent()) {
			throw new ModelNotFoundException("Casino not found");
		}
		iCasino.save(casino);
	}
	
	public Iterable<Casino> listCasino(){ 
		return iCasino.findAll();
	}
	
	public void delete(Long id) { 
		iCasino.deleteById(id);
		
	}
	

}
