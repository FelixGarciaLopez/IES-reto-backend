package com.ies.retocapacitacionbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity

public class Game {
	
	@Id
	@Column(name="ID_GAME")
	private Long idGame;
	
	@Column(name="NAME_GAME")
	private String nameGame;
	
	@Column(name="BET_GAME")
	private Long betGame;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="ID_MACHINE")
	private Machine machine;
	
	public Game() {
		
	}

	public Long getIdGame() {
		return idGame;
	}

	public String getNameGame() {
		return nameGame;
	}

	public Long getBetGame() {
		return betGame;
	}

	public Machine getMachine() {
		return machine;
	}
	
	

}
