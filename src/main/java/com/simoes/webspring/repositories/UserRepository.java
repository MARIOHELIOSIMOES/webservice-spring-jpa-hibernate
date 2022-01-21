package com.simoes.webspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simoes.webspring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
