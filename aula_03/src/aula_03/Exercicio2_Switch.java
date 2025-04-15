package aula_03;

import java.util.Scanner;

public class Exercicio2_Switch {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("=================================================");
        System.out.println("Código     Cargo           Percentual de Reajuste");
        System.out.println("  1        Gerente                10%");
        System.out.println("  2        Vendedor               7%");
        System.out.println("  3        Supervisor             9%");
        System.out.println("  4        Motorista              6%");
        System.out.println("  5        Estoquista             5%");
        System.out.println("  6        Técnico de TI          8%");
        System.out.println("================================================\n");

        // Entrada de dados
        System.out.print("Digite o nome do colaborador: ");
        String nome = leia.nextLine();

        System.out.print("Digite o código do cargo (1 a 6): ");
        int codigoCargo = leia.nextInt();

        System.out.print("Digite o salário atual: R$ ");
        float salario = leia.nextFloat();

        // Variáveis
        String cargo = "";
        float percentual = 0.0f;

        // Switch para definir cargo e percentual
        switch (codigoCargo) {
            case 1:
                cargo = "Gerente";
                percentual = 0.10f;
                break;
            case 2:
                cargo = "Vendedor";
                percentual = 0.07f;
                break;
            case 3:
                cargo = "Supervisor";
                percentual = 0.09f;
                break;
            case 4:
                cargo = "Motorista";
                percentual = 0.06f;
                break;
            case 5:
                cargo = "Estoquista";
                percentual = 0.05f;
                break;
            case 6:
                cargo = "Técnico de TI";
                percentual = 0.08f;
                break;
            default:
                System.out.println("Código de cargo inválido!");
                leia.close();
                return;
        }

        // Cálculo do novo salário
        float novoSalario = salario + (percentual * salario);

        // Saída formatada
        System.out.println("\n============== REAJUSTE SALARIAL ===============");
        System.out.printf("Nome do Colaborador: %s\n", nome);
        System.out.printf("Cargo: %s\n", cargo);
        System.out.printf("Salário Reajustado: R$ %.2f\n", novoSalario);
        System.out.println("=================================================");
        
        leia.close();
	}

}
