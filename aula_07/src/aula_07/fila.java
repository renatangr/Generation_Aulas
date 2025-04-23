package aula_07;

import java.util.LinkedList;
import java.util.Queue;

public class fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();
		
		fila.add("Carlos");
		fila.add("Giovana");
		fila.add("Lívia");
		fila.add("Maria");
		fila.add("Samuel");
		fila.add("Fabrício");
		fila.add("Victor");
		
		System.out.println("Output fila: " +fila);
		
		fila.remove();
		
		System.out.println("\n -> fila.remove();        // Remove o primeiro da fila\n");
		
		System.out.println("Output: " + fila);
		
		fila.add("Thiago");
		
		System.out.println("\n -> fila.add(\"Thiago\");  // Adiciona para final da fila\n");
		
		System.out.println("Output fila: " + fila);
		
		System.out.println("\n -> fila.peek();          // Mostra o primeiro da fila (HEAD)\n");
		
		System.out.println("Output: " +fila.peek());
		
		System.out.println("\n -> fila.poll();          // Mostra o primeiro da fila (HEAD) e remove\n");

		System.out.println("Output: " +fila.poll() + "\n" + "\nOutput fila: " + fila);
		
		System.out.println("\nMaria está na fila? " + fila.contains("Maria"));
		
		System.out.println(fila);
		
		System.out.println("\nCarlos está na fila? " + fila.contains("Carlos"));
		
		System.out.println(fila);
		
		System.out.println("\nQual é o tamanho da fila? " + fila.size());
		
		int contador = 0;
		
		System.out.println("\nQual a posição da Maria na fila? ");
		
		for(var pessoa : fila) {
			contador++;
			if(pessoa.equalsIgnoreCase("maria")) {
				System.out.printf("\nA Maria está na %dª posição na fila. ", contador);
			}
		}
		
		
		
	}

}
