package aula_03;

import java.util.Scanner;

public class Exercicio2_If {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		// Entrada de dados
        System.out.print("Digite um número inteiro: ");
        int numero = leia.nextInt();

        // Condição única com verificações aninhadas
        if (numero == 0) {
            System.out.println("O número é zero (nem positivo, nem negativo) e é par.");
        } else {
            if (numero % 2 == 0) {
                if (numero > 0) {
                    System.out.printf("O número %d é par e positivo.", numero);
                } else {
                    System.out.printf("O número %d é par e negativo.", numero);
                }
            } else {
                if (numero > 0) {
                    System.out.printf("O número %d é ímpar e positivo.", numero);
                } else {
                    System.out.printf("O número %d é ímpar e negativo.", numero);
                }
            }
        }

        leia.close();

	}

}
