package com.giovanna.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giovanna.course.entities.OrderItem;
import com.giovanna.course.entities.pk.OrderItemPK;
// Função de instanciar um obj OrderItem que terão varias operações para trabalhar com o Product e Order
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
    
}
