package com.nelioalves.projetosecao22.repositories;

import com.nelioalves.projetosecao22.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
