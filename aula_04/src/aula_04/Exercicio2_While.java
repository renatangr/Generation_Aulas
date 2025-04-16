package aula_04;

import java.util.Scanner;

public class Exercicio2_While {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int totalPessoas = 0;
        int somaIdades = 0;

        int devBackend = 0;
        int mulheresFrontend = 0;
        int homensMobile40Mais = 0;
        int nbFullStack30Menos = 0;
        
		String continuar = "S";

        while(continuar.equalsIgnoreCase("S")) {
        	
            System.out.println("\n==========================================");
            System.out.println("        CADASTRO DE COLABORADORES       "  );
            System.out.println("==========================================");

            // Idade
            System.out.print("Digite a idade: ");
            int idade = leia.nextInt();
            System.out.println("------------------------------------------");

            // Gênero
            System.out.println("\nIdentidade de Gênero:");
            System.out.println("==========================================");
            System.out.println("  1 – Mulher Cis");
            System.out.println("  2 – Homem Cis");
            System.out.println("  3 – Não Binário");
            System.out.println("  4 – Mulher Trans");
            System.out.println("  5 – Homem Trans");
            System.out.println("  6 – Outros");
            System.out.println("==========================================");
            System.out.print("Digite o número correspondente: ");
            int genero = leia.nextInt();
            System.out.println("------------------------------------------");
            
            // Área de atuação
            System.out.println("\n Pessoa Desenvolvedora:");
            System.out.println("==========================================");
            System.out.println("  1 – Backend");
            System.out.println("  2 – Frontend");
            System.out.println("  3 – Mobile");
            System.out.println("  4 – FullStack");
            System.out.println("==========================================");
            System.out.print("Digite o número correspondente: ");
            int area = leia.nextInt();
            
            totalPessoas++;
            somaIdades += idade;

            if (area == 1) {
                devBackend++;
            }

            if ((genero == 1 || genero == 4) && area == 2) {
                mulheresFrontend++;
            }

            if ((genero == 2 || genero == 5) && area == 3 && idade > 40) {
                homensMobile40Mais++;
            }

            if (genero == 3 && area == 4 && idade < 30) {
                nbFullStack30Menos++;
            }

            // Pergunta se deseja continuar
            System.out.print("\nDeseja cadastrar outro colaborador? (S/N): ");
            continuar = leia.next();
            
        }
        
        if(continuar.equalsIgnoreCase("N")) {
        	System.out.println("\n RESULTADO DA PESQUISA");
            System.out.println("==========================================");
            System.out.println("Número de Devs Backend: " + devBackend);
            System.out.println("Mulheres (Cis + Trans) Frontend: " + mulheresFrontend);
            System.out.println("Homens (Cis + Trans) Mobile > 40 anos: " + homensMobile40Mais);
            System.out.println("Não Binários FullStack < 30 anos: " + nbFullStack30Menos);
            System.out.println("Total de participantes: " + totalPessoas);

            if (totalPessoas > 0) {
                double mediaIdade =  (double)somaIdades / totalPessoas;
                System.out.printf("Média de idade: %.2f anos\n", mediaIdade);
            }
        }    
        
        leia.close();

	}

}
