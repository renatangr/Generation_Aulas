package aula_04;

import java.util.Scanner;

public class Exercicio1_While {

	public static void main(String[] args) {
		
		int idade = 0, contadorIdade21 = 0, contadorIdade50 = 0;
		
		Scanner leia = new Scanner(System.in);
		
		while(idade >= 0) {
			System.out.print("Digite uma idade: ");
			
			idade = leia.nextInt();
			
			if (idade > 0 && idade < 21) {
				contadorIdade21++;
				
			} else if (idade > 50) {
				contadorIdade50++;
			}
		}
		
		System.out.println("Total de pessoas menores de 21: " + contadorIdade21);
		System.out.println("Total de pessoas maiores de 50: " + contadorIdade50);
		
		leia.close();

	}

}
