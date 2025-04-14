package aula_02;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		/* Elabore um algoritmo em Java que leia 4 notas de um participante
		 * em variáveis do tipo float e exiba na tela a média final do participante.
		 * */
		
		Scanner leia = new Scanner(System.in);
		float nota1, nota2, nota3, nota4, media;
		
		System.out.print("Digite o valor da Nota 1: ");
		nota1 = leia.nextFloat();
		
		System.out.print("Digite o valor da Nota 2: ");
		nota2 = leia.nextFloat();
		
		System.out.print("Digite o valor da Nota 3: ");
		nota3 = leia.nextFloat();
		
		System.out.print("Digite o valor da Nota 4: ");
		nota4 = leia.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4)/ 4;
		
		System.out.printf("Média do alune: %.1f", media);		
		
	}

}
