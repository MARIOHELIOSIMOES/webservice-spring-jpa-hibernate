package com.simoes.webspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simoes.webspring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
