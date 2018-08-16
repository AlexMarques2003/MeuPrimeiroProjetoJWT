package com.alexmarques2003.api.security.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.alexmarques2003.api.security.entities.Usuario;

@Transactional(readOnly = true)
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	Usuario findByEmail(String email);
}
