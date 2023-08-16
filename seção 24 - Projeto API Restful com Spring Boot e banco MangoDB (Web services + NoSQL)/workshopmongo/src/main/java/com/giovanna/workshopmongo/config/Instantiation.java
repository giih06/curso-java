package com.giovanna.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.giovanna.workshopmongo.domain.User;
import com.giovanna.workshopmongo.repository.UserRepository;

// Essa classe instancia os dados da tabela toda vez que rodar a aplicação
@Configuration
public class Instantiation implements CommandLineRunner{

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        
        // DELETA OS USUÁRIOS
        userRepository.deleteAll();

        // INSERE OS USUÁRIOS
        User maria = new User(null, "Maria Brown", "maria@gmail.com");
        User alex = new User(null, "Alex Green", "alex@gmail.com");
        User bob = new User(null, "Bob Grey", "bob@gmail.com");

        userRepository.saveAll(Arrays.asList(maria, alex, bob));
    }
    
}
