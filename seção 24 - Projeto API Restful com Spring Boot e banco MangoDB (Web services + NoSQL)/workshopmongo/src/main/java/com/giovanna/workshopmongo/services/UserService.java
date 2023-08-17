package com.giovanna.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.giovanna.workshopmongo.domain.User;
import com.giovanna.workshopmongo.dto.UserDTO;
import com.giovanna.workshopmongo.repository.UserRepository;
import com.giovanna.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {
    
    // o serviço acessa o repositório
    @Autowired
    private UserRepository repo;
    
    public List<User> findAll() {
        return repo.findAll();
    }

    public User findById(String id) {

        // se não existir o usuário do id passado, o método retornará nulo
        Optional<User> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    // insere
	public User insert(User obj) {
		return repo.insert(obj);
	}   

    // deleta   
    public void delete(String id) {
		findById(id);// se não existir o id lança a exeção
		repo.deleteById(id);
	}

    //update obj
    public User update(User obj) {
        User newObj = findById(obj.getId());
        updateData(newObj, obj);
        return repo.save(newObj);
    }

    // update data
    private void updateData(User newObj, User obj) {
		newObj.setName(obj.getName());
		newObj.setEmail(obj.getEmail());
	}
    

    // trandorma para dto
	public User fromDTO(UserDTO objDto) {
		return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
	}
}
