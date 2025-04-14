package aula_02;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		// Digite o salário e o abono, realize a operação de soma e exiba o resultado.
		Scanner leia = new Scanner(System.in);

		System.out.print("Digite o valor do salário: ");
		float salario = leia.nextFloat();
		
		System.out.print("Digite o valor do abono: ");
		float abono = leia.nextFloat();
		
		System.out.printf("Novo salário: %.2f", (salario + abono));
		
	}

}
