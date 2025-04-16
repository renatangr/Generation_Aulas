package aula_04;

import java.util.Scanner;

public class Exercicio1_For {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int num1, num2;
		
		System.out.print("Digite o primeiro valor inteiro: ");
		num1 = leia.nextInt();
		
		System.out.print("Digite o segundo valor inteiro: ");
		num2 = leia.nextInt();
		
		if (num1 >= num2) {
			System.out.println("Intervalo inválido. Tente novamente.");
			leia.close();
			return;
		}
		
		for(int i = num1; i <= num2; i++) {
			if (i%3 == 0 && i%5 == 0) {
				System.out.printf("Número %d é múltiplo de 3 e 5\n", i);
			}
		}
			

		
		
		
		leia.close();

	}

}
