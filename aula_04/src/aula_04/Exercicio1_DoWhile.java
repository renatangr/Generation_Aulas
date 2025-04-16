package aula_04;

import java.util.Scanner;

public class Exercicio1_DoWhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
        int numero;
        int soma = 0;

        System.out.println("SOMA DOS NÚMEROS POSITIVOS");
        System.out.println("Digite números inteiros (0 para sair).");

        do {
            System.out.print("Digite um número: ");
            numero = leia.nextInt();

            if (numero > 0) {
                soma += numero;
            }

        } while (numero != 0);

        System.out.println("\nSoma dos números positivos digitados: " + soma);
        
        leia.close();

	}

}
