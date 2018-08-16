package com.alexmarques2003.api.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/exemplo")
public class ExemploController {
	
	
	@GetMapping(value = "/{nome}")
	@PreAuthorize("hasAnyRole('ADMIN')") // Esse role pode ser separado por vírgula caso seja permissão para mais de um perfil
	public String exemplo(@PathVariable("nome") String nome) {
		return "Olá" + nome;
	}

}
