package aula_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestaStreams {

	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		 
		List<Integer> numerosDesordenados = Arrays.asList(6,7,8,1,4,5,9,10,2,3);
		 
		List<String> estados = Arrays.asList("São Paulo", "Rio de Janeiro", "Minas Gerais","Espirito Santo", 

		"São Paulo", "Rio de Janeiro", "Minas Gerais", "São Paulo", "Rio de Janeiro");
		 
		List<Integer> numerosAoCubo = numeros.stream()
				.map(n -> n*n*n)
				.collect(Collectors.toList());
		
		System.out.println("Coleção Stream elevado ao cubo: "+ numerosAoCubo);
		System.out.println("Coleção números: " + numeros);
		
		List<Integer> numerosPares = numeros.stream()
				.filter(n -> n%2 ==0)
				.collect(Collectors.toList());
		
		System.out.println("Coleção números pares: " + numerosPares);
		
		List<String> estadosIniciandoR = estados.stream()
				.filter(e -> e.toString().toUpperCase().startsWith("R"))
				.collect(Collectors.toList());
		
		System.out.println("Estados que iniciam com a letra R: " + estadosIniciandoR);
		
		long contagemEstadosIniciandoR = estados.stream()
				.filter(e -> e.toString().toUpperCase().startsWith("R"))
				.count();
		
		System.out.println("Contagem dos Estados que iniciam com a letra R: " + contagemEstadosIniciandoR);
		
		long contagemEstadosIniciandoRSemRepeticao = estados.stream()
				.filter(e -> e.toString().toUpperCase().startsWith("R"))
				.distinct()
				.count();
		
		System.out.println("Contagem dos Estados que iniciam com a letra R, excluindo repetições: " + contagemEstadosIniciandoRSemRepeticao);
		
		List<Integer> numerosOrdenados = numerosDesordenados.stream()
				.sorted()
				.collect(Collectors.toList());
		
		System.out.println("Ordenação de números: " + numerosOrdenados);
		
		
	}

}
