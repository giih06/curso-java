package com.giovanna.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giovanna.course.entities.Category;
// Função de instanciar um obj category que terão varias operações para trabalhar com o Product
public interface CategoryRepository extends JpaRepository<Category, Long>{
    
}
