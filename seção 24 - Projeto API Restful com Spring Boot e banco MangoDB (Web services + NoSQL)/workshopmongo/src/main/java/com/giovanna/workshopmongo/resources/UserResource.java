package com.giovanna.workshopmongo.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.giovanna.workshopmongo.domain.User;
import com.giovanna.workshopmongo.dto.UserDTO;
import com.giovanna.workshopmongo.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    // o controlador Rest acessa o serviço
    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity<List<UserDTO>> findAll() {
        List<User> list = service.findAll(); // Busca no banco de dados os usuários e guarda na lista

        List<UserDTO> listDto = list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());// pega cada obj x da lista original e o transforma em DTO

		return ResponseEntity.ok().body(listDto);// devolve a lista na resposta da requisição
    }
}
