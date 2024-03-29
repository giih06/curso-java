package com.giovanna.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giovanna.course.config.entities.User;
// Função de instanciar um obj repository que terão varias operações para trabalhar com o user
public interface UserRepository extends JpaRepository<User, Long>{
    
}
