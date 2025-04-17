package aula_05;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int vetorInteiros[] = {10, 15, 35, 70, 140, 280};
		Float vetorReal[] = new Float[5];
		
		for(int indice = 0; indice < vetorInteiros.length; indice++) {
			System.out.printf("vetorInteiros[%d] = %d\n", indice, vetorInteiros[indice]);	
		}
		
		System.out.println("");
		
		for(int indice = 0; indice < vetorReal.length; indice++) {
			System.out.printf("Insira o valor em vetorReal[%d]: ", indice);
			vetorReal[indice] = leia.nextFloat();
		}
		
		System.out.println("");
		
		for(float valor : vetorReal) {
			System.out.printf("vetorReal = %f\n", valor);
		}
		
		int soma = 0;
		for(float valor : vetorReal) {
			soma += valor;
		}
		
		System.out.println("");
		
		System.out.println("Resultado da soma: " + soma);
		
		Arrays.sort(vetorReal);
		
		System.out.println("");
		
		System.out.println("Valores ordenados crescente");
		
		for(float valor : vetorReal) {
			System.out.printf("vetorReal = %.2f\n", valor);
		}
		
		System.out.println("");
		
		Arrays.sort(vetorReal, Collections.reverseOrder());
		
		System.out.println("Valores ordenados decrescente");
		
		for(float valor : vetorReal) {
			System.out.printf("vetorReal = %.2f\n", valor);
		}
		
		String vetorStrings[] = {"Chihuahua", "Caramelo", "Spitz Alemão", "Border Collie", "Husky"};
		
		Arrays.sort(vetorStrings);
		
		System.out.println("");
		System.out.println("Valores ordenados");
		
		for(var cachorro : vetorStrings) {
			System.out.println("Raça cachorrinho: " + cachorro);
		}
		
		leia.close();
	}

}
