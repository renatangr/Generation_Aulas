package aula_03;

import java.util.Scanner;

public class Exercicio4_If {

	public static void main(String[] args) {
		
		String caracteristica;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Escreva uma característica \"Vertebrado ou Invertebrado\": ");
		caracteristica = leia.next();
		
		if (caracteristica.equalsIgnoreCase("Vertebrado")) {
			System.out.print("Escreva uma característica \"Ave ou Mamífero\": ");
			caracteristica = leia.next();
			
			if(caracteristica.equalsIgnoreCase("Ave")) {
				System.out.print("Escreva uma característica \"Carnívoro ou Onívoro\": ");
				caracteristica = leia.next();
				
					if(caracteristica.equalsIgnoreCase("Carnívoro")) {
						System.out.print("Seu resultado é Águia!");
					} else if (caracteristica.equalsIgnoreCase("Onívoro")) {
						System.out.print("Seu resultado é Pomba!");
					} else {
						System.out.println("Opção inválida.");
					}
					
			} else if(caracteristica.equalsIgnoreCase("Mamífero")) {
				System.out.print("Escreva uma característica \"Herbívoro ou Onívoro\": ");
				caracteristica = leia.next();
				
					if(caracteristica.equalsIgnoreCase("Herbívoro")) {
						System.out.print("Seu resultado é Vaca!");
					} else if (caracteristica.equalsIgnoreCase("Onívoro")) {
						System.out.print("Seu resultado é Homem!");
					} else {
						System.out.println("Opção inválida.");
					}
					
			} else {
				System.out.println("Opção inválida.");
			}
			
		} else if (caracteristica.equalsIgnoreCase("Invertebrado")){
			System.out.print("Escreva uma característica \"Inseto ou Anelídio\": ");
			caracteristica = leia.next();
			
			if(caracteristica.equalsIgnoreCase("Inseto")) {
				
				System.out.print("Escreva uma característica \"Hematófago ou Herbívoro\": ");
				caracteristica = leia.next();
				
					if(caracteristica.equalsIgnoreCase("Hematófago")) {
						System.out.print("Seu resultado é Pulga!");
					} else if (caracteristica.equalsIgnoreCase("Herbívoro")) {
						System.out.print("Seu resultado é Lagarta!");
					}
					
			} else if (caracteristica.equalsIgnoreCase("Anelídio")) {
				System.out.print("Escreva uma característica \"Hematófago ou Onívoro\": ");
				caracteristica = leia.next();
				
					if(caracteristica.equalsIgnoreCase("Hematófago")) {
						System.out.print("Seu resultado é Sanguessuga!");
					} else if (caracteristica.equalsIgnoreCase("Onívoro")) {
						System.out.print("Seu resultado é Minhoca!");
					} else {
						System.out.println("Opção inválida.");
					}
					
			} else {
				System.out.println("Opção inválida.");
			}
			
		} else {
			System.out.println("Opção inválida.");
		}
		
		leia.close();

	}

}
