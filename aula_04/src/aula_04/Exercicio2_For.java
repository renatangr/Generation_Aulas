package aula_04;

import java.util.Scanner;

public class Exercicio2_For {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int num, pares = 0, impares = 0;
		
		for(int i = 1; i <= 10; i++) {
		System.out.printf("Digite o %dº número: ", i);
		num = leia.nextInt();
		
			if (num%2 == 0) {
				pares++;
				
			} else {
				impares++;
			}
		
		}
		System.out.println("Total de números pares: " + pares);
		System.out.println("Total de números ímpares: " + impares);
		
		leia.close();
	}	
	
}
