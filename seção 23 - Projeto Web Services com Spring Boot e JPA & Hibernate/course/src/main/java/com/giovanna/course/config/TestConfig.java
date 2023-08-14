package com.giovanna.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.giovanna.course.entities.Order;
import com.giovanna.course.entities.User;
import com.giovanna.course.repositories.OrderRepository;
import com.giovanna.course.repositories.UserRepository;

@Configuration
@Profile("test") // so vai rodar a configuração quando tiver no perfil 'test'
public class TestConfig implements CommandLineRunner{
    // Com esse @ O spring, quando tiver rodando a aplicação irá resolver essa dependencia e associar uma instancia de userepository
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    // TUdo dentro desse método vai ser executado quando a aplicação for iniciada
    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        // primeiro parametro: id, segundo parametro: instante, terceiro parametro: usuário do pedido
        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), u1); 

        // salvando o u1 e u2 no Banco de Dados
        userRepository.saveAll(Arrays.asList(u1, u2));

        // salvando o o1, o2 e o3 no Banco de Dados
        orderRepository.saveAll(Arrays.asList(o1, o2, o3)); 
    }  
}
