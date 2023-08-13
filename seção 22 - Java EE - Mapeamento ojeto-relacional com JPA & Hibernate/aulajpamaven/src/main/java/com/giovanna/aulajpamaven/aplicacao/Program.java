package com.giovanna.aulajpamaven.aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.giovanna.aulajpamaven.dominio.Pessoa;

public class Program {

    public static void main(String[] args) {
        // o id é null pois o próprio banco de dados irá inserir um id para essas pessoas
        Pessoa p1 = new Pessoa(null, "CArlao", "carlos@gmail.com");
        Pessoa p2 = new Pessoa(null, "julia", "ju@gmail.com");
        Pessoa p3 = new Pessoa(null, "cark", "carl@gmail.com");

        // EntityManagerFactory - instancia os objetos de EntityManager
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");

        // EntityManager - faz a conexçãoe o acesso a dados
        EntityManager em = emf.createEntityManager();

        // Inicia uma transação com o banco de dados
        em.getTransaction().begin();

        em.persist(p1);
        em.persist(p2);
        em.persist(p3);

        // Confirma as alterações feitas
        em.getTransaction().commit();

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("Pronto!");

        em.close();
        emf.close();
    }
}