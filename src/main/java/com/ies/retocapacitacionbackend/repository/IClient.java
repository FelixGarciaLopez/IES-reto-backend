package com.ies.retocapacitacionbackend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ies.retocapacitacionbackend.model.Client;

@Repository	
public interface IClient extends CrudRepository<Client, Long>{
	

}