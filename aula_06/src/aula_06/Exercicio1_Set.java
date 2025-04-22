package aula_06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio1_Set {

	public static void main(String[] args) {
		
		/* Escreva um programa Java para criar uma Collection Set de Objetos
		 * da Classe Wrapper Integer. O programa deverá solicitar ao usuário
		 * que ele digite via teclado 10 valores inteiros não repetidos e
		 * adicione-os individualmente na Collection Set. Em seguida, mostre
		 * na tela todos os elementos da Collection Set, utilizando a Classe Iterator. 
		 * */
		
		Scanner leia = new Scanner(System.in);
		
		Set<Integer> numeros = new HashSet<Integer>();
		final int totalNumeros = 10;
				
		for(int i = 0; i < totalNumeros; i++) {
			System.out.printf("Digite o %dº número: ", i+1);
			numeros.add(leia.nextInt());
		}
		
		Iterator<Integer> iNumeros = numeros.iterator();
		
		while(iNumeros.hasNext()) {
			System.out.printf("Número: %d \n", iNumeros.next());
		}
		
		
		leia.close();
	}

}
