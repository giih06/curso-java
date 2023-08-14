package com.giovanna.course.resources;


import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.giovanna.course.entities.User;
import com.giovanna.course.services.UserService;

// recurso web da classe USer
@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserService service;

    // Esse é o código correto para instanciar um novo user no banco de dados e dar o comando para procurar todos os dados do banco na ferramenta JPA / Spring Boot 
    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        List<User> list = service.findAll();

        return ResponseEntity.ok().body(list);
    }
    
    @GetMapping(value = "/{id}") // requisição de get. passar na url o valor do id do usuário (as chaves {} indica que a requisição aceita um id dentro da URL)
    public ResponseEntity<User> findById(@PathVariable Long id) {// pathVarable para o spring aceitar o Id como argumento
        User obj = service.finfById(id);
        return ResponseEntity.ok().body(obj); // indica que teve sucesso no obj 
    }

    // Endpoint para insert
    // Para inserir o User é necessário usar o método HTTP Post, e não o Get como usados anteriormente
    @PostMapping
	public ResponseEntity<User> inser(@RequestBody User obj) {// @RequestBody indica ao Spring que um recurso não será enviado ou recebido por meio de uma página da Web.
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).body(obj);
	}

    @DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) { //PathVariable para o long id ser reconhecido como uma variável no spring boot
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
}
