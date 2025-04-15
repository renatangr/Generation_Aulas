package aula_03;

import java.util.Scanner;

public class Exercicio1_Switch {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        // Menu
        System.out.println("============= CARDÁPIO =============");
        System.out.println("1 - Cachorro Quente      - R$ 10.00");
        System.out.println("2 - X-Salada             - R$ 15.00");
        System.out.println("3 - X-Bacon              - R$ 18.00");
        System.out.println("4 - Bauru                - R$ 12.00");
        System.out.println("5 - Refrigerante         - R$ 8.00");
        System.out.println("6 - Suco de Laranja      - R$ 13.00");
        System.out.println("====================================");

        // Entrada dos dados
        System.out.print("Digite o código do produto (1 a 6): ");
        int codigo = leia.nextInt();

        System.out.print("Digite a quantidade desejada: ");
        int quantidade = leia.nextInt();

        // Variáveis para armazenar nome e preço
        String produto = "";
        double preco = 0.0;

        // Switch para identificar produto
        switch (codigo) {
            case 1:
                produto = "Cachorro Quente";
                preco = 10.00;
                break;
            case 2:
                produto = "X-Salada";
                preco = 15.00;
                break;
            case 3:
                produto = "X-Bacon";
                preco = 18.00;
                break;
            case 4:
                produto = "Bauru";
                preco = 12.00;
                break;
            case 5:
                produto = "Refrigerante";
                preco = 8.00;
                break;
            case 6:
                produto = "Suco de Laranja";
                preco = 13.00;
                break;
            default:
                System.out.println("Código inválido! Por favor, tente novamente.");
                leia.close();
                return;
        }

        // Cálculo do total
        double total = quantidade * preco;

        // Saída
        System.out.println("\n========= RESUMO DO PEDIDO =========");
        System.out.printf("Produto: %s\n", produto);
        System.out.printf("Quantidade: %d\n", quantidade);
        System.out.printf("Valor total: R$ %.2f\n", total);

        leia.close();

	}

}
