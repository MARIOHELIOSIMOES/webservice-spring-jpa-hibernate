package com.simoes.webspring.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.simoes.webspring.entities.User;
import com.simoes.webspring.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
	
		User u1 = new User(null, "mario", "mario@gmail.com", "12345", "12345");
		User u2 = new User(null, "helio", "helio@gmail.com", "12345", "12345");
		userRepository.saveAll(Arrays.asList(u1,u2));
		
	}
}
