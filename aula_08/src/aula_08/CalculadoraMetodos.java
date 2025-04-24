package aula_08;

import java.util.Scanner;

public class CalculadoraMetodos {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
		while(true) {
			System.out.println("Digite o primeiro número: ");
			double num1 = leia.nextDouble();
			
			System.out.println("Digite o segundo número: ");
			double num2 = leia.nextDouble();
			
			System.out.println("""
					 ___________Calculadora__________
					| 1 - Somar                      |
					| 2 - Subtrair                   |
					| 3 - Multiplicar                |
					| 4 - Dividir                    |
					|--------------------------------|
					| 0 - Sair                       |
					|--------------------------------|
					""");
			
			System.out.println("Qual operação voce quer escolher? ");
			opcao = leia.nextInt();
			
			//cai fora sem precisar perguntar
			if(opcao == 0) {
				sobre();
				leia.close();
				System.exit(0);
			}
			
			
			switch(opcao) {
			case 1 -> System.out.printf("\n%f + %f = %f\n", num1, num2, somar(num1,num2));
			case 2 -> System.out.printf("\n%f - %f = %f\n", num1, num2, subtrair(num1,num2));
			case 3 -> System.out.printf("\n%f * %f = %f\n", num1, num2, multiplicar(num1,num2));
			case 4 -> System.out.printf("\n%f / %f = %f\n", num1, num2, dividir(num1,num2));
			default -> System.out.println("Opção inválida.\n");
				
			}
			
		}
		
		
	}
	
		static double somar(double num1, double num2) {
			return num1 + num2;
		}
		
		static double subtrair(double num1, double num2) {
			return num1 - num2;
		}

		static double multiplicar(double num1, double num2) {
			return num1 * num2;
		}
		
		static double dividir(double num1, double num2) {
			return num1 / num2;
		}
		
		static void sobre() {
			System.out.println("\nCalculadora com Métodos");
			System.out.println("Feito por: Renata Negrini");
		}
}
