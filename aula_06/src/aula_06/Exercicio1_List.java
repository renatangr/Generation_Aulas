package aula_06;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1_List {

	public static void main(String[] args) {
		
		/* Escreva um programa Java para criar uma Collection ArrayList de Objetos da Classe String. 
		 * O programa deverá solicitar ao usuário que ele digite via teclado 5 cores e deverá
		 * adicioná-las individualmente no ArrayList. Em seguida, faça o que se pede: 
		 * - Mostre na tela todas as cores que foram adicionadas. 
		 * - Mostre na tela todas as cores que foram adicionadas ordenadas em ordem crescente.
		 * */
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> cores = new ArrayList<String>();
		final int totalCores = 5;
		
		for(int i = 0; i < totalCores; i++) {
			System.out.printf("Digite a %dª cor: ", i+1);
			cores.add(leia.next());
		}
		
		System.out.println("Cores digitadas: " + cores);
		cores.sort(null);
		System.out.println("Ordenação das cores digitadas: " + cores);
		
		
		leia.close();
	}

}
