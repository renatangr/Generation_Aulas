package aula_06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio2_List {

	public static void main(String[] args) {
		
		/* Escreva um algoritmo para criar uma Collection ArrayList
		 * de Objetos da Classe Wrapper Integer, inicializada com 10 valores inteiros.
		 * O programa deverá solicitar ao usuário, que ele digite via teclado 1 número
		 * inteiro e caso ele seja encontrado no ArrayList, exiba na tela a posição deste
		 * número na Collection. Caso o número não seja encontrado, ele deverá exibir
		 * na tela a mensagem: O número NN não foi encontrado!
		 * */
		
		Scanner leia = new Scanner(System.in);
		int num; 
		String resposta;
		boolean continuar = true;
		
		ArrayList<Integer> numeros = new ArrayList<Integer>(Arrays.asList(2, 5, 1, 3, 4, 9,	7, 8, 10, 6));
		
		do {		
			System.out.print("Pesquise um valor: ");
			num = leia.nextInt();
			
			if(numeros.contains(num)) {
				System.out.printf("Número %d foi encontrado na %dª posição!", num, numeros.indexOf(num)+1);				
			} else {
				System.out.printf("Número %d não encontrado!\n", num);
			}
			
			System.out.print("\nDeseja continuar? S/N \n");
			resposta = leia.next();
			
			if(resposta.equalsIgnoreCase("N")) {
				continuar = false;
			}
			
		} while (continuar);
		
		leia.close();
		
	}

}
