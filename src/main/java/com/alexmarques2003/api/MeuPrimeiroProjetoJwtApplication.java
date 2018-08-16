package com.alexmarques2003.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.alexmarques2003.api.security.entities.Usuario;
import com.alexmarques2003.api.security.enums.PerfilEnum;
import com.alexmarques2003.api.security.repositories.UsuarioRepository;
import com.alexmarques2003.api.utils.SenhaUtils;

@SpringBootApplication
public class MeuPrimeiroProjetoJwtApplication {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	public static void main(String[] args) {
		SpringApplication.run(MeuPrimeiroProjetoJwtApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			
			Usuario usuario = new Usuario();
			usuario.setEmail("alexmarques2003@gmail.com");
			usuario.setPerfil(PerfilEnum.ROLE_USUARIO);
			usuario.setSenha(SenhaUtils.gerarBCrypt("123456"));
			this.usuarioRepository.save(usuario);
		
			Usuario admin = new Usuario();
			admin.setEmail("admin@gmail.com");
			admin.setPerfil(PerfilEnum.ROLE_ADMIN);
			admin.setSenha(SenhaUtils.gerarBCrypt("123456"));
			this.usuarioRepository.save(admin);
	
		};
	}
}
