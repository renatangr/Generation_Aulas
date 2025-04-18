package aula_03;

import java.util.Scanner;

public class Exercicio3_If {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome, primeiraDoacao;
		boolean primeiraDoacaoBool = false;
		int idade, verificador = 0;
		
		System.out.println("\n =======================================================");
		System.out.println(" ========= Bem-vinde ao Sistema Único de Saúde =========");
		System.out.println(" =======================================================");
		System.out.println("     Salve vidas e cadastre-se como doador de sangue    ");
		System.out.println(" =======================================================\n");
		System.out.println(" IMPORTANTE: Para doar sangue é necessário ter entre 18\n"
				         + "             e 69 anos de idade. Pessoas com idade entre\n"
				         + "             60 e 69 anos só podem doar se não for a sua\n"
				         + "             primeira doação.\n");
		
		System.out.print(" Digite seu nome: ");
		nome = leia.next();
		System.out.print("\n Digite sua idade: ");
		idade = leia.nextInt();
		
		if(idade < 18 || idade > 69) {
			System.out.println("\n Sinto muito, você não atende os requisitos para doar sangue.");
			leia.close();
			return;
		}
		
		do {
			System.out.print("\n Primeira vez doando sangue? (S/N) ");
			primeiraDoacao = leia.next();
			
			if(primeiraDoacao.equalsIgnoreCase("S")) {
				
				primeiraDoacaoBool = true;
				verificador = 1;
				
				} else if (primeiraDoacao.equalsIgnoreCase("N")) {
					
					primeiraDoacaoBool = false;
					verificador = 1;
				
				} else {
					System.out.println(" Inválido. tente novamente.");
				}
			
		} while (verificador == 0);
		
		if(idade < 60) {
			System.out.printf("\n RESULTADO: Cadastro concluído. %s está apto/a para doar sangue!", nome);
		} else if(primeiraDoacaoBool == false) {
			System.out.printf("\n RESULTADO: Cadastro concluído. %s está apto/a para doar sangue!", nome);
		} else {
			System.out.printf("\n RESULTADO: Não foi possível concluir o seu cadastro, pois %s não está apto/a para doar sangue.", nome);
		}
		
		leia.close();

	}

}
