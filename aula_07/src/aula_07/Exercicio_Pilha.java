package aula_07;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio_Pilha {

	public static void main(String[] args) {
		
		/* Escreva um programa contendo uma Collection Stack (Pilha) de Objetos string,
		 * para organizar a retirada de livros de uma pilha. O programa deverá ter um
		 * Menu que aceitará as opções 0, 1, 2 e 3:
		 * 
		 * 1: Adicionar um novo livro na pilha. Deve solicitar o nome do livro.
		 * 2: Listar todos os livros da Pilha
		 * 3: Retirar um livro da pilha 
		 * 0: O programa deve ser finalizado. 
		 * 
		 * Caso a pilha esteja vazia, ao tentar retirar um livro da pilha,
		 * o programa deverá informar que a pilha está vazia.
		 * */ 
		
		Scanner leia = new Scanner(System.in);

		Stack<String> pilhaLivros = new Stack<String>();
		
		boolean continuar = true;
		String nome;
		int opcao;
		
		System.out.println("*********************************************************");
        System.out.println("Bem-vindo ao Sistema da Biblioteca Municipal de Sorocaba!");
        System.out.println("*********************************************************");

        while (continuar) {
        	System.out.println("\nSelecione a opção:");
            System.out.println("[1] Adicionar novo livro na pilha");
            System.out.println("[2] Listar os livros da pilha");
            System.out.println("[3] Retirar livro da pilha");
            System.out.println("[0] Sair do Sistema");
            System.out.print("    Opção: ");
            opcao = leia.nextInt();
            
            switch (opcao) {
            case 1:
            	System.out.print("\nDigite o nome do livro: ");
				nome = leia.next();
				pilhaLivros.push(nome);
				System.out.println("Livro \"" + nome + "\" adicionado à pilha.");
            	break;
            	
            case 2:
            	System.out.println("\n--- Livros na Pilha ---");
				if (pilhaLivros.isEmpty()) {
					System.out.println("A pilha está vazia.");
				} else {
					// Exibe do topo para a base
					for (int i = pilhaLivros.size() - 1; i >= 0; i--) {
						System.out.println("- " + pilhaLivros.get(i));
					}
				}
            	break;
            
            case 3:
            	if (pilhaLivros.isEmpty()) {
					System.out.println("A pilha está vazia. Nenhum livro para retirar.");
				} else {
					System.out.println("Retirando o livro: \"" + pilhaLivros.pop() + "\"");
				}
				break;

			case 0:
				System.out.println("Saindo do sistema. Até logo!");
				continuar = false;
				break;

			default:
				System.out.println("Opção inválida. Tente novamente.");
            }
		
        }
		
        leia.close();
	}

}
