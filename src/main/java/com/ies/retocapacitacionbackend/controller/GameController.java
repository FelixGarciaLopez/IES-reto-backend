package com.ies.retocapacitacionbackend.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ies.retocapacitacionbackend.model.Game;
import com.ies.retocapacitacionbackend.service.GameService;

@RestController
@RequestMapping("game")
public class GameController {
	
	private final GameService gameService;
	
	public GameController(GameService game) {
		this.gameService = game;
	}
	
	@PostMapping("/")
    public void save(@RequestBody Game game) {
		gameService.save(game);
    }
	
	@PutMapping("/{id}")
	public void update(@RequestBody Game game, @PathVariable Long id) {
		gameService.update(game, id);
	}
	@GetMapping("/listAll")
    public Iterable<Game> listAllGame() {
        return gameService.listGame();
    }
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		gameService.delete(id);
	}

}
