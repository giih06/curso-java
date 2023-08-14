package com.giovanna.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.giovanna.course.entities.Order;
import com.giovanna.course.repositories.OrderRepository;

@Service
public class OrderService {
    
    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    // achar o usuário pelo id
    public Order finfById(Long id) {
        Optional<Order> obj =  repository.findById(id);
        return obj.get(); // retorna um objeto do tipo user que estiver dentro do option
    }
}
