package aula_07;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio_Fila {

	public static void main(String[] args) {
		
		/* Escreva um programa contendo uma Collection Queue (Fila) de Objetos do tipo string, 
		 * para organizar uma fila por ordem de chegada dos Clientes de um Banco. 
		 * O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
		 * 
		 * 1: Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente.
		 * 2: Listar todos os Clientes na fila
		 * 3: Chamar (retirar) uma pessoa da fila 
		 * 0: O programa deve ser finalizado. 
		 * 
		 * Caso a fila esteja vazia, o programa deverá informar que a fila está vazia
		 * ao tentar retirar (chamar) um cliente da fila.
		 * */
		
		Scanner leia = new Scanner(System.in);
		
		Queue<String> filaPreferencial = new LinkedList<>();
        Queue<String> filaNormal = new LinkedList<>();
		
		boolean continuar = true;
		String nome;
		int opcao;
		
		System.out.println("**********************************************************");
        System.out.println("Bem-vindo ao Sistema da Fila de Atendimento do Banco Itaú!");
        System.out.println("**********************************************************");

        while (continuar) {
        	System.out.println("\nSelecione a opção:");
            System.out.println("[1] Adicionar novo cliente");
            System.out.println("[2] Listar fila atual");
            System.out.println("[3] Chamar cliente");
            System.out.println("[0] Sair do Sistema");
            System.out.print("    Opção: ");
            opcao = leia.nextInt();
            
            switch (opcao) {
            	
                case 1: // Cadastrar novo cliente
                	
                	while(opcao != 1 || opcao != 2) {
                		System.out.println("\nSelecione o tipo de atendimento:");
                        System.out.println("[1] Preferencial");
                        System.out.println("[2] Não preferencial");
                        System.out.print("    Opção: ");
	                	opcao = leia.nextInt();
	                	
	                	if(opcao == 1) {
	                		System.out.print("\nDigite o nome do cliente preferencial: ");
	                        nome = leia.next();
	                        filaPreferencial.add(nome);
	                        System.out.println("Cliente adicionado à fila preferencial.");
	                        
	                        System.out.println("\n************************** Fila **************************");
	                        
	                        for (String cliente : filaPreferencial) {
	                            System.out.println("- " + cliente);
	                        }
	                        for (String cliente : filaNormal) {
	                            System.out.println("- " + cliente);
	                        }
	                       
	                        System.out.println("**********************************************************");
	                        break;
	                        
	                	} else if(opcao == 2) {
	                		System.out.print("\nDigite o nome do cliente não preferencial: ");
	                        nome = leia.next();
	                        filaNormal.add(nome);
	                        System.out.println("Cliente adicionado à fila comum.");
	                        
	                        System.out.println("\n************************** Fila **************************");
	                        
	                        for (String cliente : filaPreferencial) {
	                            System.out.println("- " + cliente);
	                        }
	                        for (String cliente : filaNormal) {
	                            System.out.println("- " + cliente);
	                        }
	                       
	                        System.out.println("**********************************************************");
	                        break;
	                        
	                	} else {
	                		System.out.println("\nOpção inválida. Tente novamente.");
	                	}
                	}
                    break;
                    
                case 2: // Listar a fila atual
                	
                	if (filaPreferencial.isEmpty() && filaNormal.isEmpty()) {
                	    System.out.println("Não há ninguém na fila no momento.");
                	} else {
                		System.out.println("\n************************** Fila **************************");
                		
                		for (String cliente : filaPreferencial) {
                            System.out.println("- " + cliente);
                        }
                		for (String cliente : filaNormal) {
                            System.out.println("- " + cliente);
                        }
                        
                        System.out.println("*********************************************************");
                	}
                	
                	break;
                    
                case 3: // Iniciar atendimento
                	
                    System.out.println("\nIniciando atendimento...\n");
                    
                    if (!filaPreferencial.isEmpty()) {
                        System.out.println("Atendendo (Preferencial): " + filaPreferencial.poll());
                        
                    } else if (!filaNormal.isEmpty()) {
                        System.out.println("Atendendo (Comum): " + filaNormal.poll());
                        
                    } else {
                        System.out.println("Nenhum cliente na fila.");
                        break;
                    }
                    
                    // Verifica se ainda tem alguém na fila antes de imprimir
                    if (!filaPreferencial.isEmpty() || !filaNormal.isEmpty()) {
                        System.out.println("\n************************** Fila **************************");

                        for (String cliente : filaPreferencial) {
                            System.out.println("- " + cliente);
                        }
                        for (String cliente : filaNormal) {
                            System.out.println("- " + cliente);
                        }

                        System.out.println("**********************************************************");
                    } else {
                        System.out.println("\nTodos os clientes foram atendidos! A fila está vazia após o último atendimento.");
                    }
                    
                    break;
                    
                case 0:
                    continuar = false;
                    System.out.println("\nEncerrando o sistema...");
                    System.out.println("Até logo!");
                    System.out.println("**********************************************************");
                    break;
                    
                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
            }
        }

        leia.close();
		
	}

}
