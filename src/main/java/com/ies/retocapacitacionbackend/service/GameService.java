package com.ies.retocapacitacionbackend.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ies.retocapacitacionbackend.exceptions.GameAlreadyExistException;
import com.ies.retocapacitacionbackend.exceptions.ModelNotFoundException;
import com.ies.retocapacitacionbackend.model.Game;
import com.ies.retocapacitacionbackend.repository.IGame;

@Service
public class GameService {
	
	private final IGame iGame;
	
	public GameService(IGame iGame) {
		this.iGame = iGame;
	}
	
	public void save(Game game) {
		Optional<Game> idGame = iGame.findById(game.getIdGame());
		if(idGame.isPresent()) {
			throw new GameAlreadyExistException ("This Game is already exist");
		}
		iGame.save(game);
	}
	public void update(Game game, Long id) {
		Optional<Game> idGame = iGame.findById(id);
		if(!idGame.isPresent()) {
			throw new ModelNotFoundException("Game not found");
		}
		iGame.save(game);				
	}
	public Iterable<Game>listGame(){
		return iGame.findAll();
	}
	public void delete(Long id) { 
		iGame.deleteById(id);
		
	}
	

}
