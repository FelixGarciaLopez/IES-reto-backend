package com.ies.retocapacitacionbackend.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ies.retocapacitacionbackend.model.Game;

@Repository	
public interface IGame extends CrudRepository <Game, Long>{
	Optional<Game> findByBetGame(int betGame);
	
}
