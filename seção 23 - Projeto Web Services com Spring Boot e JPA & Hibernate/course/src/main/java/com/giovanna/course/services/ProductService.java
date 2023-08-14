package com.giovanna.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.giovanna.course.entities.Product;
import com.giovanna.course.repositories.ProductRepository;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    // achar o usuário pelo id
    public Product finfById(Long id) {
        Optional<Product> obj =  repository.findById(id);
        return obj.get(); // retorna um objeto do tipo user que estiver dentro do option
    }
}
