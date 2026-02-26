package com.nelioalves.projetosecao22.repositories;


import com.nelioalves.projetosecao22.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {}