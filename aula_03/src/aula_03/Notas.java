package aula_03;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite a nota do aluno: ");
		float nota = leia.nextFloat();
		leia.close();
		
		// Condicional Simples
		if(nota >= 7) {
			System.out.println("Aluno Aprovado!");
		}
		
		// Condicional Composta
		if(nota >= 7) {
			System.out.println("Aluno Aprovado!");
		} else {
			System.out.println("Aluno Reprovado!");
		}
		
		// Encadeamento de if
		
		if(nota >= 7) {
			System.out.println("Aluno Aprovado!");
		} else if(nota >= 5 && nota < 7){
			System.out.println("Aluno em Exame!");
		} else {
			System.out.println("Aluno Reprovado!");
		}
		
		
	}

}
