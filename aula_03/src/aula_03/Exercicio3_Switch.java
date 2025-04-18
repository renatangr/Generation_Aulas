package aula_03;

import java.util.Scanner;

public class Exercicio3_Switch {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float num1, num2;
		int operacao;
		
		System.out.println("\n =============================");
		System.out.println(" ======== CALCULADORA ========");
		
		System.out.print(" Digite o primeiro valor: ");
		num1 = leia.nextFloat();
		System.out.print(" Digite o segundo valor:  ");
		num2 = leia.nextFloat();
		
		System.out.println("\n =============================");
		System.out.println(" | 1 - Soma                  |\n"
				         + " | 2 - Subtração             |\n"
				         + " | 3 - Multiplicação         |\n"
				         + " | 4 - Divisão               |\n"
				         + " | 0 - Sair                  |");
		System.out.println(" =============================");
		
		do {
			System.out.print("\n Digite a operação desejada: ");
			operacao = leia.nextInt();
			
			switch(operacao) {
			case 0:
				System.out.println("\n Saindo da calculadora...");
				System.out.println(" Obrigado, até logo!");
				leia.close();
				return;
			case 1:
				System.out.printf(" %.2f + %.2f = %.2f\n", num1, num2, (num1 + num2));
				return;
			case 2:
				System.out.printf(" %.2f - %.2f = %.2f\n", num1, num2, (num1 - num2));
				return;
			case 3:
				System.out.printf(" %.2f * %.2f = %.2f\n", num1, num2, (num1 * num2));
				return;
			case 4:
				System.out.printf(" %.2f / %.2f = %.2f\n", num1, num2, (num1 / num2));
				return;
			default:
				System.out.println("Operação inválida! Tente novamente.");
			}
			
		} while(operacao != 0);
		
		leia.close();

	}

}
