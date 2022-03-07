package com.capgemini.edmundo;

import static org.junit.Assert.*;

import org.junit.Test;

public class Q02Test {

	@Test
	public void testQ02() {
		// Declarando o vetor de inteiros
		int vet [] = {1,2,3,4,5};
		
		// Declarando o valor de X
		int x = 2;
	
		// Verificando se o valor esperado "3" é retornado da função que está sendo testada
		assertEquals(3, Q02.calculatePairDifference(vet, x));
	}

}
