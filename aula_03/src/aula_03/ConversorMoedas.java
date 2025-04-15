package aula_03;

import java.util.Scanner;

public class ConversorMoedas {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double valorConvertido = 0.0;
		String moeda = "";
		
		System.out.println("==============================================");
		System.out.println("             Conversor de Moedas              ");
		System.out.println("==============================================");
		System.out.println("  1 - Converter para Dólar (US$) ");
		System.out.println("  2 - Converter para Euro  (EUR)");
		System.out.println("  3 - Converter para Pesos (ARS)");
		System.out.println("==============================================");
		System.out.print("  Digite a opção desejada: ");
		
		int opcao = leia.nextInt();
		
		System.out.println("==============================================");
		System.out.print("  Digite o valor em Reais (R$): ");
		
		double valor = leia.nextDouble();
		
		
		switch(opcao) {
		case 1:
			valorConvertido = valor / 5.86;
			moeda = "Dólar (US$)";
			break;
			
		case 2:
			valorConvertido = valor / 6.63;
			moeda = "Euro (EUR)";
			break;
		case 3:	
			valorConvertido = valor / 0.0049;
			moeda = "Peso Argentino (ARS)";
			break;	// Saia do Switch
			
		default:
			System.out.println("Opção inválida.");
			leia.close();
			return; // Saia do programa
		}
		
		System.out.printf("\n  Valor convertido em %s: %.2f \n", moeda, valorConvertido);
		System.out.println("==============================================");
		
		leia.close();
	}

}
