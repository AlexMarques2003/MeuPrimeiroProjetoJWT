package com.alexmarques2003.api.security.services.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.alexmarques2003.api.security.entities.Usuario;
import com.alexmarques2003.api.security.repositories.UsuarioRepository;
import com.alexmarques2003.api.security.services.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	private static final Logger log = LoggerFactory.getLogger(UsuarioServiceImpl.class);
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	/*
	 * O annotation @Cacheable serve para guardar a instancia da pesquisa em cache
	 * 
	 * @param email
	 * @return Optional<Usuario> 
	 * 
	 * */
	
	@Cacheable("exemploCache")
	public Optional<Usuario> buscarPorEmail(String email) {
		log.info("### Executando a consulta com cache pela primeira vez...");
		return Optional.ofNullable(this.usuarioRepository.findByEmail(email));
		
	}

}
