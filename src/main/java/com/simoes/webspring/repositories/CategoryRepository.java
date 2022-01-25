package com.simoes.webspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simoes.webspring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
