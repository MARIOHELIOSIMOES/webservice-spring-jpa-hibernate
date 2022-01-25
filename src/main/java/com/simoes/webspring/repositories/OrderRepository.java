package com.simoes.webspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simoes.webspring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
