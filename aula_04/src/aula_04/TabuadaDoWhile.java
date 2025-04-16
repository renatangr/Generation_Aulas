package aula_04;

import java.util.Scanner;

public class TabuadaDoWhile {

	public static void main(String[] args) {
		
		int contador = 1, num;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		num = leia.nextInt();
		
		do {
			System.out.printf("\n %d x %d = %d", num, contador, (num * contador));
			contador++;
			
		} while(contador <= 10);
		
		leia.close();

	}

}
