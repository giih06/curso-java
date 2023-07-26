package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.LogEntry;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) { // abre o arquico

			// lê o arquivo:

			// HashSet pois é rápido e não importa a ordem
			Set<LogEntry> set = new HashSet<>();
			
			String line = br.readLine(); // lê as linhas do arquivo
			while (line != null) { // enquanto houver coisas escritas na linha
			
				String[] fields = line.split(" "); // recorta o string baseado no espaço em branco
				String username = fields[0]; // Como o string foi cortado, a parte esquerda (0) será dado à posição para por o nome do usuário.
				Date moment = Date.from(Instant.parse(fields[1])); // já a parte direita do corte da string, será dado à data do acesso
				
				set.add(new LogEntry(username, moment)); // inseri o logEntry no Set
				
				line = br.readLine();
			}	
			System.out.println("Total users: " + set.size()); // set.size() é o tamanho do conjunto

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}
}