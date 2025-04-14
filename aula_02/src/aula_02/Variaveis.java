package aula_02;
import java.util.Scanner;

public class Variaveis {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número inteiro: ");
		int num_01 = leia.nextInt();
		
		System.out.println("Digite o segundo número inteiro: ");
		int num_02 = leia.nextInt();
		
		final double PI = 3.1415;
		String nome = "Re";
		
		System.out.println("Nome igual a "+ nome.toUpperCase());
		System.out.println("Variável número um é igual a " + num_01);
		System.out.println("Variável número dois é igual a " + num_02);
		System.out.println("Constante PI é igual a "+PI);

	}

}
