package aula_04;

import java.util.Scanner;

public class TabuadaWhile {

	public static void main(String[] args) {
		
		int contador = 1, num;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		num = leia.nextInt();
		
		while(contador <= 10) {
			System.out.printf("\n %d x %d = %d", num, contador, (num * contador));
			contador++;
		}
		
		leia.close();

	}

}
