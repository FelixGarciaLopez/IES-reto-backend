package com.ies.retocapacitacionbackend.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ies.retocapacitacionbackend.exceptions.ClientAlreadyExistException;
import com.ies.retocapacitacionbackend.exceptions.ModelNotFoundException;
import com.ies.retocapacitacionbackend.model.Client;
import com.ies.retocapacitacionbackend.repository.IClient;

@Service
public class ClientService  {
	
	private final IClient iClient;
	
	public ClientService(IClient iClient) {
		this.iClient = iClient;
	}
	
	public void save(Client client) {
		Optional<Client> idClient = iClient.findById(client.getIdClient());
		if(idClient.isPresent()){
			throw new ClientAlreadyExistException("Client is Already Exist");
		}
		iClient.save(client);
	}
	
	public void update(Client client , Long id) { 
		Optional<Client> idClient = iClient.findById(id);
		if(!idClient.isPresent()) {
			throw new ModelNotFoundException("Client not found");
		}
		iClient.save(client);
	}
	
	public Iterable<Client> listClient(){ 
		return iClient.findAll();
	}
	
	public void delete(Long id) { 
		iClient.deleteById(id);
		
	}

	
}
