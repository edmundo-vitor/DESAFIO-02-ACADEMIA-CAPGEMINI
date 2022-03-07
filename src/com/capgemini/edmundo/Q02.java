package com.capgemini.edmundo;

import java.util.Scanner;

public class Q02 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Captando valores de entrada
		System.out.println("Digite o vetor de inteiros: ");
		String vetString = scanner.nextLine();
		
		System.out.println("Digite o numero inteiro para comparação: ");
		int x = scanner.nextInt();
		
		scanner.close();
		
		// Transformando a string em array de inteiros
		int vet[] = stringToArrayInt(vetString);
		
		// Chamando a função para calcular o número de elementos pares do vetor que tem uma diferença igual ao valor de x
		int out = calculatePairDifference(vet, x);
		
		// Mostrando a saída
		System.out.println(out);
	}
	
	// Pega string de entrada e retorna vetor de inteiros
	public static int[] stringToArrayInt(String vetString) {
 		// Tratando os valores de entrada
 		vetString = vetString.substring(vetString.indexOf("[") + 1, vetString.indexOf("]"));
 		
 		// Pegando o tamanho do vetor
 		int sizeVet = 0;
 		char separator = ',';
 		char space = ' ';
 		for(int c = 0; c < vetString.length(); c++) {
 			if(vetString.charAt(c) == separator) {
 				sizeVet++;
 			}	
 		}
 		
 		// Declarando o vetor de inteiros
 		int vet[] = new int[sizeVet + 1];
 		int vetCount = 0;
 		
 		// Vai preencher o vetor transformando string em inteiro
 		for(int c = 0; c < vetString.length(); c++) {
 			if(vetString.charAt(c) != separator && vetString.charAt(c) != space) {
 				vet[vetCount] = Integer.parseInt(String.valueOf(vetString.charAt(c)));
 				vetCount++;
 			}	
 		}
 		
 		return vet;
 	}
	
	// Calcula o número de elementos pares do vetor que tem uma diferença igual ao valor de x
	public static int calculatePairDifference(int n[], int x) {
		int amount = 0;
		
		// Percorre os itens que vão ser comparados
		for(int i = 0; i < n.length; i++) {
			// Percorre os itens comparadores
			for(int j = 0; j < n.length; j++) {
				
				// Verificar se a subtração resulta no inteiro informado, caso resulte acrescenta +1 no contador
				if(n[i] - n[j] == x) {
					amount++;
				}	
			}
		}
		
		return amount;
	}

}
