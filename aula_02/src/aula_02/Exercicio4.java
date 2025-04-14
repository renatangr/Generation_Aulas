package aula_02;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		/* Leia quatro valores float (n1, n2, n3, n4) e a seguir
		 * calcule e mostre a diferença do produto entre 
		 * o n1 e n2 pelo produto entre o n3 e n4.
		 * */ 
		Scanner leia = new Scanner(System.in);
		
		float n1, n2, n3, n4, calculo;
		
		System.out.print("Digite o primeiro valor: ");
		n1 = leia.nextFloat();
		
		System.out.print("Digite o segundo valor: ");
		n2 = leia.nextFloat();
		
		System.out.print("Digite o terceiro valor: ");
		n3 = leia.nextFloat();
		
		System.out.print("Digite o quarto valor: ");
		n4 = leia.nextFloat();
		
		calculo = (n1 * n2) - (n3 * n4);
		
		System.out.printf("Diferença: %.1f", calculo);
	}

}
