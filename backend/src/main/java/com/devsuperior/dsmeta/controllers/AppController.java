package com.devsuperior.dsmeta.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsmeta.entities.People;

@RestController
public class AppController {
	
	
	@GetMapping("/app")
	public ResponseEntity<People> hello() {
		
		People rebeca = new People();
		
		rebeca.setName("Rebeca");
		rebeca.setIdade(22);
		
		
		return ResponseEntity.ok(rebeca);
	}

}
