package com.simoes.webspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simoes.webspring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
