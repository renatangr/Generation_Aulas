package aula_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int dividendo = 0;
		int divisor = 0;
			
		while(true) {
			
			try {
				System.out.println("Digite o Dividendo: ");
				dividendo = ler.nextInt();
						
				System.out.println("Digite o Divisor: ");
				divisor = ler.nextInt();
						
				divide(dividendo, divisor);
				break;
				
			} catch(InputMismatchException e) {
				ler.nextLine();
				System.out.println("Digine um número inteiro positivo.\n");
				
			} catch(ArithmeticException e) {
				System.out.println("Digite um número inteiro diferente de zero. " );
			} finally {
				System.out.println("Programa em Execução!");
			}
		}
		
		ler.close();
	}

	public static void divide(int dividendo, int divisor) {
		System.out.println("Divisão = " + (dividendo / divisor));
	}

}
