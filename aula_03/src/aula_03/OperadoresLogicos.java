package aula_03;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 5;
		int z = 5;
		int w = 20;
		
		// Operadores Relacionais
		System.out.printf("%d > %d = %b \n", x, y, (x > y));
		System.out.printf("%d < %d = %b \n", x, y, (x < y));
		System.out.printf("%d >= %d = %b \n", z, y, (z >= y));
		System.out.printf("%d <= %d = %b \n", z, y, (z <= y));
	
		// Operadores Lógicos
		System.out.printf("(%d > %d) E (%d < %d) = %b \n", x, y, z, w, ((x > y) && (z < w)) );
		System.out.printf("(%d > %d) OU (%d < %d) = %b \n", x, y, z, w, ((x > y) || (z < w)) );
		System.out.printf("!(%d > %d) E (%d < %d) = %b \n", x, y, z, w, (!(x > y) || (z < w)) );
		System.out.printf("!(%d > %d) E !(%d < %d) = %b \n", x, y, z, w, (!(x > y) || !(z < w)) );
	}

}
