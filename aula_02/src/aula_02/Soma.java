package aula_02;

public class Soma {

	public static void main(String[] args) {
		int num_1 = 2, num_2 = 2;
		String nums_1 = "2", nums_2 = "2";
		
		System.out.printf("Soma: %d + %d = %d\n", num_1, num_2, (num_1+num_2));
		System.out.printf("Concatenação: %s + %s = %s\n", nums_1, nums_2, (nums_1+nums_2));
		
		System.out.println("num_1 = num_1 + 2");
		System.out.println("num_2 += 2");
	}

}
