package com.giovanna.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.giovanna.course.config.entities.Category;
import com.giovanna.course.repositories.CategoryRepository;

@Service
public class CategoryService {
    
    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    // achar o usuário pelo id
    public Category finfById(Long id) {
        Optional<Category> obj =  repository.findById(id);
        return obj.get(); // retorna um objeto do tipo category que estiver dentro do option
    }
}
