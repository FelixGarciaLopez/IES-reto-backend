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
public class Machine {
	
	@Id
	@Column(name="ID_MACHINE")
	private Long idMachine;

	@Column(name="TYPE_MACHINE")
	private String	typeMachine;
	
	@Column(name="SIZE_MACHINE")
	private String sizeMachine;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="ID_CASINO")
	private Casino casino;
	
	@OneToMany(mappedBy="machine", cascade = CascadeType.ALL)
	private List<Game> games = new ArrayList<>();
	
	
	public Machine() {
		
	}

	public Long getIdMachine() {
		return idMachine;
	}

	public String getTypeMachine() {
		return typeMachine;
	}

	public String getSizeMachine() {
		return sizeMachine;
	}
		

	public Casino getCasino() {
		return casino;
	}

	public List<Game> getGames() {
		return games;
	}	
	
	
}
