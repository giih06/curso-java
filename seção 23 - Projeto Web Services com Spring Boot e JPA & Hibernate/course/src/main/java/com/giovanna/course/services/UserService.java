package com.giovanna.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.giovanna.course.entities.User;
import com.giovanna.course.repositories.UserRepository;

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
        return obj.get(); // retorna um objeto do tipo user que estiver dentro do option
    }

    // Salva no banco de dados um dado usuário
    public User insert(User obj) {
		return repository.save(obj);
	}

    // Deleta do banco de dados um dado Usuário
    public void delete(Long id) {
        repository.deleteById(id);
    }

    // update User
    public User update(Long id, User obj) {
		User entity = repository.getReferenceById(id);
		updateData(entity, obj);
		return repository.save(entity);
	}

    // update o user no banco de dados
    // atualiza no entity com base no que chegar no obj
	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
}
