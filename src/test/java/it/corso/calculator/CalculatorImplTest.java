package it.corso.calculator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorImplTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void addShouldReturnAResult() {
		Calculator c = new CalculatorImpl();
		int result = c.add(10, 20);
		assertEquals(30, result);
	}

}
