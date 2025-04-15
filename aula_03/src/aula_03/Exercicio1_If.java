package aula_03;

import java.util.Scanner;

public class Exercicio1_If {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        // Leitura dos valores
        System.out.print("Digite o valor de A: ");
        int A = leia.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = leia.nextInt();

        System.out.print("Digite o valor de C: ");
        int C = leia.nextInt();

        // Cálculo da soma
        int soma = A + B;

        // Comparação usando IF
        if (soma > C) {
            System.out.printf("A soma de A (%d) + B (%d) é igual a %d e é maior que C (%d).\n", A, B, soma, C);
        } else if (soma < C) {
            System.out.printf("A soma de A (%d) + B (%d) é igual a %d é menor que C (%d).\n", A, B, soma, C);
        } else {
            System.out.printf("A soma de A (%d) + B (%d) é igual a %d é igual a C (%d).\n", A, B, soma, C);
        }

        leia.close();
    }

}
