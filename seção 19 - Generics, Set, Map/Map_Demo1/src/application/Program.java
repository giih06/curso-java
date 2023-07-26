package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {
        // Estrutura para armazenar cookies
        // chave String e valor String
        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "99771122");

        cookies.remove("email");
        cookies.put("phone", "99771133"); // será sobrescrito em relação ao phone anterior

        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone")); // verifica se a key phone contem em cookies
        System.out.println("Phone number: " + cookies.get("phone")); // pega o valor da key phone
        System.out.println("Email: " + cookies.get("email")); // retorna null, já que a key não existe ( foi removida anteriormente )
        System.out.println("Size: " + cookies.size()); // tamanho do Map 

        System.out.println("ALL COOKIES:");

        // para cada string key no meu conjunto de chaves cookie.keySet(); keyset retorna um Set com as chaves do Map
        for (String key : cookies.keySet()) { 
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}