package com.alexmarques2003.api.security.services;

import java.util.Optional;

import com.alexmarques2003.api.security.entities.Usuario;

public interface UsuarioService {

	/*
	 * Busca e retorna um usuário dado um e-mail
	 * 
	 * @param email
	 * @return Optional<Usuario>
	 * */
	
	Optional <Usuario> buscarPorEmail(String email);
	
}
