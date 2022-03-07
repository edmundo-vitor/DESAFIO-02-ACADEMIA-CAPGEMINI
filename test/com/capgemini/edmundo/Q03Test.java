package com.capgemini.edmundo;

import static org.junit.Assert.*;

import org.junit.Test;

public class Q03Test {

	@Test
	public void testQ03() {
		String input = "tenha um bom dia";
		String output = "taoa eum nmd hbi";
		
		assertEquals(output, Q03.encrypt(input));
	}

}
