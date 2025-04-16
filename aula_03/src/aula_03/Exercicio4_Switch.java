package aula_03;

import java.util.Scanner;

public class Exercicio4_Switch {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        float valor, saldo = 1000.00f;
        int codigo;

        System.out.println("\n==============================");
        System.out.println("       MENU BANCÁRIO");
        System.out.println("==============================");
        System.out.println(" Código       Operação");
        System.out.println("   1          Consultar Saldo");
        System.out.println("   2          Realizar Saque");
        System.out.println("   3          Fazer Depósito");
        System.out.println("   0          Sair");
        System.out.println("==============================\n");

        do {
            System.out.print("Digite o código da operação desejada: ");
            codigo = leia.nextInt();

            System.out.println(); // linha em branco para separação

            switch (codigo) {
                case 0:
                    System.out.println("Encerrando o sistema...");
                    System.out.println("Obrigado por utilizar nosso banco. Até logo!\n");
                    leia.close();
                    return;

                case 1:
                    System.out.println("Operação: Consultar Saldo");
                    System.out.printf("Saldo atual: R$ %.2f\n\n", saldo);
                    break;

                case 2:
                    System.out.println("Operação: Realizar Saque");
                    System.out.print("Digite o valor para saque: R$ ");
                    valor = leia.nextFloat();

                    if (valor > saldo) {
                        System.out.printf("Saque não autorizado. Saldo insuficiente (R$ %.2f).\n\n", saldo);
                    } else {
                        saldo -= valor;
                        System.out.printf("Saque de R$ %.2f realizado com sucesso!\n", valor);
                        System.out.printf("Saldo restante: R$ %.2f\n\n", saldo);
                    }
                    break;

                case 3:
                    System.out.println("Operação: Fazer Depósito");
                    System.out.print("Digite o valor para depósito: R$ ");
                    valor = leia.nextFloat();

                    saldo += valor;
                    System.out.printf("Depósito de R$ %.2f realizado com sucesso!\n", valor);
                    System.out.printf("Saldo atual: R$ %.2f\n\n", saldo);
                    break;

                default:
                    System.out.println("Código inválido! Por favor, escolha uma opção entre 0 e 3.\n");
            }

        } while (codigo != 0);

        leia.close();
    }
}
