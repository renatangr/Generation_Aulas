package aula_02;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/* Elabore um algoritmo que leia o Salário Bruto, o Adicional Noturno, as Horas Extras e 
		 * os Descontos de um Colaborador e exiba na tela o Salário Líquido.
		 * */
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		Scanner leia = new Scanner(System.in);
		
		do {
		System.out.print("Insira o salário bruto do colaborador: ");
		salarioBruto = leia.nextFloat();
		if(salarioBruto < 1) {
			System.out.println("O colaborador não pode ter salário igual a zero ou negativo. "
					         + "Insira o valor correto");
		}
		} while(salarioBruto < 1);
		
		System.out.print("Insira o adicional noturno do colaborador: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.print("Insira as horas extras do colaborador: ");
		horasExtras = leia.nextFloat();
		
		System.out.print("Insira os descontos do colaborador: ");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.printf("Salário líquido do colaborador: %.2f", salarioLiquido);
	}

}
