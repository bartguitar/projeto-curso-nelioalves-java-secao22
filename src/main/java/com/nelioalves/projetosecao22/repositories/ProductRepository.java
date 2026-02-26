package com.nelioalves.projetosecao22.repositories;


import com.nelioalves.projetosecao22.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {}
