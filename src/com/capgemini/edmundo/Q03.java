package com.capgemini.edmundo;

import java.util.Arrays;
import java.util.Scanner;

public class Q03 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Lendo a string de entrada
        System.out.printf("Informe o texto a ser criptografado: ");
        String str = scanner.nextLine();
        scanner.close();

        // Chama a função para inicializar o processo de criptografia
        String response = encrypt(str);
        
        // Mostra a saída
        System.out.println(response);
	}
	
	public static String encrypt(String str) {
		// Concatena todas as palavras que foram passadas como argumentos em uma única string
        String finalString = str.replace(" ", "");

        // Tira a raiz quadrada do tamanho da string, arredondando para cima, caso a raiz não seja exata
        int gridSize = (int) Math.ceil(Math.sqrt(finalString.length()));

        // Cria uma grid com strings vazias
        final String[][] grid = new String[gridSize][gridSize];
        for (final String[] row : grid) {
            Arrays.fill(row, "");
        }

        // Monta a grid a partir da string
        fillGrid(grid, gridSize, finalString);

        // Obtemos a resposta com a grid criada e depois printa ela no terminal
        final String response = getResponse(grid, gridSize);
        
        return response;
	}
	
	// Monta a resposta com a grid que criamos
    private static String getResponse(String[][] grid, final int gridSize) {
        final String[][] transposedGrid = transposeGrid(grid, gridSize);
        
        String response = "";

        for (final String[] row : transposedGrid) {
            response += String.join("",row) + " ";
        }
        
        //Remove o espaço extra
        response = response.trim();
        
        return response;
    }

    // Retorna a grid transposta
    private static String[][] transposeGrid(final String[][] grid, final int gridSize) {
        final String[][] transposedGrid = new String[gridSize][gridSize];

        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                transposedGrid[i][j] = grid[j][i];
            }
        }

        return transposedGrid;
    }

    // Método responsável por preencher a grid com os caracteres da string
    private static void fillGrid(String[][] grid, final int gridSize, final String finalString) {
        int totalCharWritten = 0;
        final int stringSize = finalString.length();

        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                grid[i][j] = String.valueOf(finalString.charAt(totalCharWritten));
                totalCharWritten++;
                
                // Verifica se foram escritos todos os caracteres na grid
                if (totalCharWritten == stringSize) {
                    return;
                }
            }
        }
    }

}
