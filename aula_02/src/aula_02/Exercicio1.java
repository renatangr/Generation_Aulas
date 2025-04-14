package aula_02;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		// Digite o salário e o abono, realize a operação de soma e exiba o resultado.
		Scanner leia = new Scanner(System.in);
		float salario, abono, total;
		
		do {
		System.out.print("Digite o valor do salário: ");
		salario = leia.nextFloat();
		} while (salario < 1);
		
		System.out.print("Digite o valor do abono: ");
		abono = leia.nextFloat();
		
		total = salario + abono;
		
		System.out.printf("Novo salário: %.2f", total);
		
	}

}
