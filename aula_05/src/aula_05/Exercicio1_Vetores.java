package aula_05;

import java.util.Scanner;

public class Exercicio1_Vetores {

	public static void main(String[] args) {
		
		/* Dado um vetor contendo 10 números inteiros não ordenados
		 *  e não repetidos, construa um algoritmo que consiga pesquisar
		 *  dados no vetor, onde o usuário irá digitar um número e o programa
		 *  deve exibir na tela a posição deste número no vetor. Caso o número
		 *  não seja encontrado, a mensagem: “Não foi encontrado!” deve ser 
		 *  exibida na tela. 
		 *  */
		
		int[] valores = {2,	5, 1, 3, 4, 9, 7, 8, 10, 6};
		int num, posicao = 0;
		boolean resultadoPesquisa = false, pesquisarNovamente;
		String continuar = "S";
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.print("Digite um número a ser pesquisado: ");
			num = leia.nextInt();
			
			for(int i = 0; i < valores.length; i++) {
				if(num == valores[i]) {
					resultadoPesquisa = true;
					posicao = i + 1;
				}
			}
			
			if(resultadoPesquisa == false) {
				System.out.printf("\nNenhum resultado encontrado para o valor %d. Tente novamente!\n\n", num);
			} else {
				System.out.printf("\nSeu resultado para o valor %d foi encontrado na %dª posição: \n", num, posicao);
				
				for(int i = 0; i < valores.length; i++) {
					System.out.print(" _ ");
				}
				System.out.println("");
				for(int i = 0; i < valores.length; i++) {
					if(num == valores[i]) {
						System.out.printf("|%d|", num);
					} else {
					System.out.print("|_|");
					}
				}
				
				do {
					System.out.print("\n\nPesquisar novamente? S/N: ");
					continuar = leia.next();
					System.out.print("\n");
					
					if(continuar.equalsIgnoreCase("S")) {
						resultadoPesquisa = false;
						pesquisarNovamente = false;
						
					} else if(continuar.equalsIgnoreCase("N")) {
						leia.close();
						return;
						
					} else {
						System.out.println("Opção inválida, tente novamente.");
						pesquisarNovamente = true;
					}
					
				} while(pesquisarNovamente == true);
								
			} 
		} while(resultadoPesquisa == false);
		leia.close();
	}
	
}
		
		

