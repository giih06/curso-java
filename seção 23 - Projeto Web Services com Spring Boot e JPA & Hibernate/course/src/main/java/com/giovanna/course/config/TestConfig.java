package com.giovanna.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.giovanna.course.entities.Category;
import com.giovanna.course.entities.Order;
import com.giovanna.course.entities.OrderItem;
import com.giovanna.course.entities.Payment;
import com.giovanna.course.entities.Product;
import com.giovanna.course.entities.User;
import com.giovanna.course.entities.enums.OrderStatus;
import com.giovanna.course.repositories.CategoryRepository;
import com.giovanna.course.repositories.OrderItemRepository;
import com.giovanna.course.repositories.OrderRepository;
import com.giovanna.course.repositories.ProductRepository;
import com.giovanna.course.repositories.UserRepository;

@Configuration
@Profile("test") // so vai rodar a configuração quando tiver no perfil 'test'
public class TestConfig implements CommandLineRunner{

    // Com esse @ O spring, quando tiver rodando a aplicação irá resolver essa dependencia e associar uma instancia de userepository
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;


    @Autowired
    private ProductRepository productRepository;

    @Autowired 
    private OrderItemRepository orderItemRepository;

    // TUdo dentro desse método vai ser executado quando a aplicação for iniciada
    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        // primeiro parametro: id, segundo parametro: instante, terceiro parametro: usuário do pedido
        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1); 

        // salvando o u1 e u2 no Banco de Dados
        userRepository.saveAll(Arrays.asList(u1, u2));

        // salvando o o1, o2 e o3 no Banco de Dados
        orderRepository.saveAll(Arrays.asList(o1, o2, o3)); 

        Category cat1 = new Category(null, "Electronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers"); 

        Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
        Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
        Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
        Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
        Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");

        // salvando o cat1, cat2 e cat3 no banco de dados
        categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));

        // salvando o p1, p2, p3, p4 e p5 no banco de dados
        productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));

        // associando os produtos com suas respectivas categorias
        p1.getCategories().add(cat2);
		p2.getCategories().add(cat1);
		p2.getCategories().add(cat3);
		p3.getCategories().add(cat3);
		p4.getCategories().add(cat3);
		p5.getCategories().add(cat2);

        productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));

        // order item do pedido 1, produto 1, quantidade 2
        OrderItem oi1 = new OrderItem(o1, p1, 2, p1.getPrice());
		OrderItem oi2 = new OrderItem(o1, p3, 1, p3.getPrice());
		OrderItem oi3 = new OrderItem(o2, p3, 2, p3.getPrice());
		OrderItem oi4 = new OrderItem(o3, p5, 2, p5.getPrice());

		orderItemRepository.saveAll(Arrays.asList(oi1, oi2, oi3, oi4));	

        
		Payment pay1 = new Payment(null, Instant.parse("2019-06-20T21:53:07Z"), o1);
		o1.setPayment(pay1);// pedido 1 pago

		orderRepository.save(o1);// salva no banco de dados  
    }  
}
