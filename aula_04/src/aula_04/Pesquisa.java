package aula_04;

import java.util.Scanner;

public class Pesquisa {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade, somaIdades = 0, totalRespostas = 0, esporte, futebol = 0, voleibolM18 = 0, basqueteMn18 = 0;
		
		String continua = "S";
		
		while(continua.equalsIgnoreCase("S")) {
			System.out.print("Digite a sua idade: ");
			idade = leia.nextInt();
			
			do {
			System.out.print("Digite seu esporte favorito (1- Futebol / 2- Volei / 3- Basquete / 4- Outros): ");
			esporte = leia.nextInt();
			
			if(esporte < 1 || esporte > 4) {
				System.out.println("Digite um valor entre 1 e 4.");
			}
			
			} while(esporte < 1 || esporte > 4);
				
			if (esporte == 1) {
				futebol++;
			} 
			
			if (esporte == 2 && idade > 18) {
				voleibolM18++;
			}
			
			if (esporte == 3 && idade < 18) {
				basqueteMn18++;
			}
			
			totalRespostas++;
			somaIdades += idade;
			
			System.out.print("Deseja continuar? (S/N): ");
			continua = leia.next();
		}
		
		double media = Math.round(somaIdades / totalRespostas);
		
		System.out.printf("\nTotal de pessoas que gostam de futebol: %d", futebol);
		System.out.printf("\nTotal de pessoas que gostam de volei e são maiores de idade: %d", voleibolM18);
		System.out.printf("\nTotal de pessoas que gostam de basquete e são menores de idade: %d", basqueteMn18);
		System.out.printf("\nMédia de idade: %d", (int)media );

		
	}

}
