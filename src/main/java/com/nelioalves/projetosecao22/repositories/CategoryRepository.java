package com.nelioalves.projetosecao22.repositories;


import com.nelioalves.projetosecao22.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category, Long> {}