package aula_05;

import java.util.Scanner;

public class Exercicio2_Matrizes {

	public static void main(String[] args) {
		
		/* Elabore um algoritmo que leia as notas de uma classe
		 * com 10 participantes durante 4 bimestres de um ano.
		 * As 4 notas de cada participante serão armazenadas em 
		 * uma linha de uma matriz de números reais, logo cada linha 
		 * da matriz serão as notas de um participante. 
		 * Em um vetor de números reais, armazene as médias de cada participante
		 * e exiba as médias de cada um na tela.
		 * */ 
		float verificarNota, somaNotas = 0, calcularMedia = 0;
		float nota[][] = new float[2][4];
		float media[][] = new float[1][2];
		
		Scanner leia = new Scanner(System.in);
		System.out.println("====================================");
		System.out.println("Cadastre as notas na matriz abaixo:");
		System.out.println("====================================\n");
		
		for(int i = 0; i < nota.length; i++) {
			for(int j = 0; j < nota[0].length; j++) {
				
				do {
					System.out.printf("nota[%d][%d] = ", i, j);
					verificarNota = leia.nextFloat();
					
					if(verificarNota < 0 || verificarNota > 10) {
						System.out.println("\nValor inválido! Insira um número entre 0 e 10.\n");
					} else {
						nota[i][j] = verificarNota;
					}
				} while(verificarNota < 0 || verificarNota > 10);
			}
			
			System.out.println("");
			
		} // termina o primeiro for
		
		// Calcula a média
		for(int i = 0; i < nota.length; i++) {
			for(int j = 0; j < nota[0].length; j++) {
				somaNotas += nota[i][j];
			}
			calcularMedia = (float)somaNotas/nota[0].length;
			media[0][i] = calcularMedia;
			somaNotas = 0;
		}
		
		System.out.println("====================================");
		System.out.println("Resultado das médias cadastradas:");
		System.out.println("====================================\n");
		
		for(int i = 0; i < media[0].length; i++) {
			System.out.printf("Média do %dº alune: %.2f\n", i+1, media[0][i]);
			if(media[0][i] <= 3) {
				System.out.println("Alune em reprovado.\n");
			} else if(media[0][i] >= 6) {
				System.out.println("Alune aprovado!\n");
			} else {
				System.out.println("Alune em exame.\n");
			}
		}
		
		leia.close();	
	}

}
