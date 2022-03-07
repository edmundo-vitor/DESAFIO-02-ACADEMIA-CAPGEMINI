package com.capgemini.edmundo;

import java.util.Arrays;
import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("Digite o vetor de entrada: ");
    	String arrString = scanner.nextLine();
    	
    	scanner.close();
    	
    	int arr[] = stringToArrayInt(arrString);
    	
        System.out.println(getMedian(arr));
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
 	
 	// Função para calcular a mediana
    public static int getMedian(int array[]){
        // Ordenando o array
        Arrays.sort(array);
        
        // Pegando o index do valor mediano
        int indexMedian = (int) (Math.ceil(array.length / 2)); 

        // Retornando o valor mediano
        return array[indexMedian];
    }
}
