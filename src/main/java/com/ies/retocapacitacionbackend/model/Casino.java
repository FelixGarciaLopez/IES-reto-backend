package com.ies.retocapacitacionbackend.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Casino {
	
	@Id
	@Column(name="ID_CASINO")
	private Long idCasino;
	
	@Column(name="LOCATION")
	private String location;
	
	@Column(name="AREA")
	private int area;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="ID_CLIENT")
	private Client client;
	
	
	@OneToMany(mappedBy="casino", cascade = CascadeType.ALL)
	private List<Machine> machines = new ArrayList<>();
	
	public Casino() {
			
	}

	public Long getIdCasino() {
		return idCasino;
	}

	public String getLocation() {
		return location;
	}

	public int getArea() {
		return area;
	}

	public Client getClient() {
		return client;
	}

	public List<Machine> getMachine() {
		return machines;
	}

	
	
	
	
}
