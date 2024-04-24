package com.zied.authenticationbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class AuthenticationBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthenticationBackendApplication.class, args);
	}

}
