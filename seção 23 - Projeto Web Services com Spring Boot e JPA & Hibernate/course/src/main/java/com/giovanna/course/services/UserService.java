package com.giovanna.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.giovanna.course.entities.User;
import com.giovanna.course.repositories.UserRepository;
import com.giovanna.course.services.exceptions.DatabaseException;
import com.giovanna.course.services.exceptions.ResourceNotFoundException;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UserService {
    
    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    // achar o usuário pelo id
    public User finfById(Long id) {
        Optional<User> obj =  repository.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundException(id)); // tenta dar o get, se não tiver usuário, é lançada uma exeção
    }

    // Salva no banco de dados um dado usuário
    public User insert(User obj) {
		return repository.save(obj);
	}

    // Deleta do banco de dados um dado Usuário
    public void delete(Long id) {
        try {
			repository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
            // erro 404 ( not found )
			throw new ResourceNotFoundException(id);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
    }

    // update User
    public User update(Long id, User obj) {
        try{
		User entity = repository.getReferenceById(id);
		updateData(entity, obj);
		return repository.save(entity);
        } catch (EntityNotFoundException e) {
            // erro 404 ( not found )
            throw new ResourceNotFoundException(id); 
        }
	}

    // update o user no banco de dados
    // atualiza no entity com base no que chegar no obj
	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
}
