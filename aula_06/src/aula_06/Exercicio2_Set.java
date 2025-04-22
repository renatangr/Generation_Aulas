package aula_06;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio2_Set {

	public static void main(String[] args) {
		
		/* Escreva um algoritmo para criar uma Collection Set 
		 * de Objetos da Classe Wrapper Integer, inicializada com 
		 * 10 valores inteiros. O programa deverá solicitar ao usuário, 
		 * que ele digite via teclado 1 número inteiro e caso ele seja 
		 * encontrado no Set, exiba na tela a mensagem: Número 00 Encontrado! 
		 * Caso o número não seja encontrado, ele deverá exibir na tela
		 * a mensagem: O número NN não foi encontrado
		 * */
		
		Scanner leia = new Scanner(System.in);
		
		int num; 
		String resposta;
		boolean continuar = true;
		
		Set<Integer> numeros = new HashSet<Integer>();
		final int totalNumeros = 10;
		
		for(int i = 0; i < totalNumeros; i++) {
			System.out.printf("Digite o %dº número: ", i+1);
			numeros.add(leia.nextInt());
		}
		
		ArrayList<Integer> numerosList = new ArrayList<>();
		
		numerosList.addAll(numeros);
		
		do {		
			System.out.print("\nDigite um número a ser pesquisado: ");
			num = leia.nextInt();
			
			if(numerosList.contains(num)) {
				System.out.printf("\nNúmero %d foi encontrado na %dª posição!", num, numerosList.indexOf(num)+1);				
			} else {
				System.out.printf("\nNúmero %d não encontrado!\n", num);
			}
			
			System.out.print("\nDeseja continuar? S/N \n");
			resposta = leia.next();
			
			if(resposta.equalsIgnoreCase("N")) {
				continuar = false;
			}
			
		} while (continuar);
		
		System.out.println("\nNúmeros no Set: ");
		
		for(int i = 0; i < numerosList.size(); i++) {
			System.out.printf("| %d | ", numerosList.get(i));
		}
		
		leia.close();
		
	}

}
