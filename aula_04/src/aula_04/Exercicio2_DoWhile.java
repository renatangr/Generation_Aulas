package aula_04;

import java.util.Scanner;

public class Exercicio2_DoWhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
        int numero, soma = 0, contador = 0;

        System.out.println("MÉDIA DOS NÚMEROS MÚLTIPLOS DE 3");
        System.out.println("Digite números inteiros (0 para encerrar).");

        do {
            System.out.print("Digite um número: ");
            numero = leia.nextInt();

            if (numero != 0 && numero % 3 == 0) {
                soma += numero;
                contador++;
            }

        } while (numero != 0);

        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.printf("\nMédia dos múltiplos de 3: %.1f\n", media);
        } else {
            System.out.println("\nNenhum múltiplo de 3 foi digitado.");
        }

        leia.close();
	}

}
