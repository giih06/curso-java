package com.giovanna.aulajpa.aplicacao;

import com.giovanna.aulajpa.dominio.Pessoa;

public class Program {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(1, "CArlao", "carlos@gmail.com");
        Pessoa p2 = new Pessoa(1, "julia", "ju@gmail.com");
        Pessoa p3 = new Pessoa(1, "cark", "carl@gmail.com");
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}