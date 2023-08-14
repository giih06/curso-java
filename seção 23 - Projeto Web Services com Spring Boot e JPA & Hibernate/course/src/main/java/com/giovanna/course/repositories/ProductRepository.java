package com.giovanna.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giovanna.course.entities.Product;
// Função de instanciar um obj Product que terão varias operações para trabalhar com o Category
public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
