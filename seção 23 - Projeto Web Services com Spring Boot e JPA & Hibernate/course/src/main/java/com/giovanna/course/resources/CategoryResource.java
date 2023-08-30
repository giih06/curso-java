package com.giovanna.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.giovanna.course.config.entities.Category;
import com.giovanna.course.services.CategoryService;

// recurso web da classe Category
@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

    @Autowired
    private CategoryService service;

    // Esse é o código correto para instanciar uma nova categoria no banco de dados e dar o comando para procurar todos os dados do banco na ferramenta JPA / Spring Boot 
    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
        List<Category> list = service.findAll();

        return ResponseEntity.ok().body(list);
    }
    
    @GetMapping(value = "/{id}") // requisição de get. passar na url o valor do id do usuário (as chaves {} indica que a requisição aceita um id dentro da URL)
    public ResponseEntity<Category> findById(@PathVariable Long id) {// pathVarable para o spring aceitar o Id como argumento
        Category obj = service.finfById(id);
        return ResponseEntity.ok().body(obj); // indica que teve sucesso no obj 
    }
}
