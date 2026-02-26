package com.nelioalves.projetosecao22.repositories;


import com.nelioalves.projetosecao22.entities.Order;

import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long> {}
