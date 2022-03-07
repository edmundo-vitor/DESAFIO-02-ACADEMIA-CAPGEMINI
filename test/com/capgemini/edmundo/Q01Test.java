package com.capgemini.edmundo;

import static org.junit.Assert.*;

import org.junit.Test;

public class Q01Test {

	@Test
	public void testQ01() {
		// Declarando o vetor de inteiros
		int vet [] = {9,2,1,4,6};
		
		// Verificando se o valor esperado "4" é retornado da função que está sendo testada
		assertEquals(4, Q01.getMedian(vet));
	}

}
