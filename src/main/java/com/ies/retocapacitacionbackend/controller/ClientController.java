package com.ies.retocapacitacionbackend.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ies.retocapacitacionbackend.model.Client;
import com.ies.retocapacitacionbackend.service.ClientService;

@RestController
@RequestMapping("client")
public class ClientController {
	
	private final ClientService clientService;
	
	public ClientController(ClientService client) {
		this.clientService = client;
	}
	
	@PostMapping("/")
    public void save(@RequestBody Client client) {
		clientService.save(client);
    }
	
	@PutMapping("/{id}")
	public void update(@RequestBody Client client, @PathVariable Long id) {
		clientService.update(client, id);
	}
	
	@GetMapping("/listAll")
    public Iterable<Client> listAllClient() {
        return clientService.listClient();
    }
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		clientService.delete(id);
	}
	
	@GetMapping
	public String index() {
		return "index";
	}
	
	
	
	

}
