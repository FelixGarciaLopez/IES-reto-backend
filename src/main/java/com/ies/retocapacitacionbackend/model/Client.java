package com.ies.retocapacitacionbackend.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity	
public class Client {	

	@Id
	@Column(name = "ID_CLIENT")
	private Long idClient;
	
	@Column(name = "FIRST_NAME")
	private String	firstName;
	
	@Column(name = "LAST_NAME")
	private String lastName;
	
	@OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
	private List<Casino> casinos = new ArrayList<>();

	public Client() {
		
	}
	
	public Long getIdClient() {
		return idClient;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	public List<Casino> getCasino() {
		return casinos;
	}
	
	
	
		

}
