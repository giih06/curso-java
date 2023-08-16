package com.giovanna.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.giovanna.workshopmongo.domain.User;
import com.giovanna.workshopmongo.repository.UserRepository;

@Service
public class UserService {
    
    // o serviço acessa o repositório
    @Autowired
    private UserRepository repo;
    
    public List<User> findAll() {
        return repo.findAll();
    }
}
