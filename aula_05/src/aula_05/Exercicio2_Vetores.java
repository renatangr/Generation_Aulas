package aula_05;

import java.util.Scanner;

public class Exercicio2_Vetores {

	public static void main(String[] args) {
		
		/* Elabore um algoritmo que leia 10 números inteiros e armazene em um vetor.
		 * Em seguida, mostre na tela:
		 *  - Todos os elementos dos índices ímpares do vetor 
		 *  - Todos os elementos do vetor que são números pares
		 *  - A Soma de todos os elementos do vetor
		 *  - A Média de todos os elementos do vetor, armazenada em uma variável do tipo real.
		 * */
		
		Scanner leia = new Scanner(System.in);
		
		int valores[] = new int[10];
		int soma = 0;
		float media = 0;
				
		for(int i = 0; i < valores.length; i++) {
			System.out.printf("\n Digite o %dº valor: ", i+1);
			valores[i] = leia.nextInt();
		}
		
		System.out.println("\n Valores digitados:");
		
		for(int valor : valores) {
			System.out.printf(" |%d|", valor);
		}
		
		System.out.println("\n\n Elementos pares:");
		
		for(int valor : valores) {
			if(valor%2 == 0) {
			System.out.printf(" |%d|", valor);
			}
		}
		
		System.out.println("\n\n Elementos ímpares:");
		
		for(int valor : valores) {
			if(valor%2 != 0) {
			System.out.printf(" |%d|", valor);
			}
		}
				
		for(int valor : valores) {
			soma += valor;
		}
		
		System.out.printf("\n\n Soma: %d\n", soma);
		
		media = (float)soma/(float)valores.length;
		
		System.out.printf("\n Média: %d / %d = %.2f \n", soma, valores.length, media);
		
		leia.close();
	}

}
