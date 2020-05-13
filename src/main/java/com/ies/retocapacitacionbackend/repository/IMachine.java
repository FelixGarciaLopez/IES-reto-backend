package com.ies.retocapacitacionbackend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ies.retocapacitacionbackend.model.Machine;

@Repository	
public interface IMachine extends CrudRepository<Machine, Long>{

}
