package com.giovanna.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giovanna.course.entities.Order;

// Funcção de instanciar um obj repository que terão varias operações para trabalhar com o order
public interface OrderRepository extends JpaRepository<Order, Long>{
    
}
