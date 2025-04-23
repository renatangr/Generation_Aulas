package aula_07;

import java.util.Stack;

public class pilha {

	public static void main(String[] args) {

		Stack<String> pilha = new Stack<String>();
		
		pilha.push("Comunicação Não Violenta");
		pilha.push("IT: A Coisa");
		pilha.push("A coragem de ser imperfeito");
		pilha.push("Quem pensa enriquece");
		pilha.push("Diário de um Banana");
		pilha.push("Senhor dos Anéis");
		pilha.push("O Código Da Vinci");
		
		System.out.println(pilha);
		
		pilha.pop();
		
		System.out.println(pilha);
		
		pilha.push("Roube como um Artista");
		
		System.out.println(pilha);
		
		System.out.println(pilha.peek());
		
		System.out.println("O livro \"Diário de um Banana\" existe na pilha? " + pilha.contains("Diário de um Banana"));
		
	}

}
