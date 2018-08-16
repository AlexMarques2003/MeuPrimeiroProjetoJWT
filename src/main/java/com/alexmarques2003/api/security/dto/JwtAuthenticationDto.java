package com.alexmarques2003.api.security.dto;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class JwtAuthenticationDto {
	
	private String email;
	private String senha;

	
	public JwtAuthenticationDto() {
	}
	
	@NotEmpty(message = "E-mail não pode ser vazio!")
	@Email(message = "E-mail inválido.")
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	@NotEmpty(message = "Senha não pode ser vazia.")
	public String getSenha() {
		return senha;
	}
	
	
}
