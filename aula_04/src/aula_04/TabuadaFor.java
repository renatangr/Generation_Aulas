package aula_04;

import java.util.Scanner;

public class TabuadaFor {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int num = leia.nextInt();
		
		for(int contador = 1; contador <= 10; contador++ ) {
			System.out.printf("\n %d x %d = %d", num, contador, (num * contador));
		}
		
		leia.close();

	}

}
