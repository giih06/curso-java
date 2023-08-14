package com.giovanna.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.giovanna.course.entities.Order;
import com.giovanna.course.services.OrderService;

// recurso web da classe Order
@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

    @Autowired
    private OrderService service;

    // Esse é o código correto para instanciar um novo Order no banco de dados e dar o comando para procurar todos os dados do banco na ferramenta JPA / Spring Boot 
    @GetMapping
    public ResponseEntity<List<Order>> findAll() {
        List<Order> list = service.findAll();

        return ResponseEntity.ok().body(list);
    }
    
    @GetMapping(value = "/{id}") // requisição de get. passar na url o valor do id do usuário (as chaves {} indica que a requisição aceita um id dentro da URL)
    public ResponseEntity<Order> findById(@PathVariable Long id) {// pathVarable para o spring aceitar o Id como argumento
        Order obj = service.finfById(id);
        return ResponseEntity.ok().body(obj); // indica que teve sucesso no obj 
    }
}
