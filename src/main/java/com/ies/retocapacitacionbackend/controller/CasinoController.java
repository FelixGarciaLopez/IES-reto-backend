package com.ies.retocapacitacionbackend.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ies.retocapacitacionbackend.model.Casino;
import com.ies.retocapacitacionbackend.service.CasinoService;

@RestController
@RequestMapping("casino")
public class CasinoController {

	private final CasinoService casinoService;
	
	public CasinoController(CasinoService casino) {
		this.casinoService = casino;
	}
	@PostMapping("/")
    public void save(@RequestBody Casino casino) {
		casinoService.save(casino);
    }
	
	@PutMapping("/{id}")
	public void update(@RequestBody Casino casino, @PathVariable Long id) {
		casinoService.update(casino, id);
	}
	
	@GetMapping("/listAll")
    public Iterable<Casino> listAllCasino() {
        return casinoService.listCasino();
    }
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		casinoService.delete(id);
	}
}
