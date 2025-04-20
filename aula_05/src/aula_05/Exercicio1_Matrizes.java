package aula_05;

public class Exercicio1_Matrizes {

	public static void main(String[] args) {
		
		/* Elabore um algoritmo que leia uma Matriz 3x3 de
		 * números inteiros e em seguida, mostre na tela:
		 *  - Todos os elementos da Diagonal Principal
		 *  - Todos os elementos da Diagonal Secundária
		 *  - A Soma de todos os elementos da Diagonal Principal
		 *  - A Soma de todos os elementos da Diagonal Secundária
		 * */
		
		int somaDiagonalPrincipal = 0, somaDiagonalSecundaria = 0;
		int matriz[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println("Elementos da diagonal principal: ");
		for(int i = 0; i < matriz.length; i++) {
			System.out.printf("|%d| ", matriz[i][i]);
			somaDiagonalPrincipal += matriz[i][i];
			}
		
		System.out.println("\n\nElementos da diagonal secundária: ");
		
		for(int i = 0; i < matriz.length; i++) {
			System.out.printf("|%d| ", matriz[i][matriz.length - 1 - i]);
			somaDiagonalSecundaria += matriz[i][matriz.length - 1 - i];
			}
		
		System.out.println("\n\nSoma dos elementos da diagonal principal: " + somaDiagonalPrincipal);
		System.out.println("\nSoma dos elementos da diagonal secundária: " + somaDiagonalSecundaria);
	
		System.out.println("\nMatriz completa: ");
		for(int valor[] : matriz) {
			for(int num : valor) {
				System.out.print("|" + num + "| ");
			}
			System.out.println("");
		}
	}

}
