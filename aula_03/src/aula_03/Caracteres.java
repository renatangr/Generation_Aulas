package aula_03;

public class Caracteres {

	public static void main(String[] args) {
		
		String frase1 = "Turma Java 82";
		String frase2 = "TURMA JAVA 82";
		String frase3 = "turma java 82";
		String frase4 = "TURMA JAVA 82";
		
		// Comparação de String com ==
		System.out.println(frase1 == frase2);
		System.out.println(frase2 == frase4);
		
		// Comparação de String com métodos da classe String
		System.out.println(frase1.equals(frase2));
		System.out.println(frase2.equals(frase4));
		
		System.out.println(frase1.equalsIgnoreCase(frase2));
		System.out.println(frase2.equalsIgnoreCase(frase4));
	
		System.out.println(frase1.compareTo(frase2));
		System.out.println(frase2.compareTo(frase4));
	
	}

}
