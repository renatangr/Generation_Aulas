package aula_02;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		double num1 = leia.nextDouble();
		
		System.out.println("Digite o primeiro número: ");
		double num2 = leia.nextDouble();
		
		System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, (num1 + num2));
		System.out.printf("%.2f - %.2f = %.2f\n", num1, num2, (num1 - num2));
		System.out.printf("%.2f * %.2f = %.2f\n", num1, num2, (num1 * num2));
		System.out.printf("%.2f / %.2f = %.2f\n", num1, num2, (num1 / num2));
		System.out.printf("%.2f ^ %.2f = %.2f\n", num1, num2, Math.pow(num1,num2));
		System.out.printf("%.2f R %.2f = %.2f\n", num1, num2, Math.sqrt(num1));
		
	}

}
