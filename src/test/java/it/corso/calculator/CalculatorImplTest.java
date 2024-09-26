package it.corso.calculator;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * 
 * @author thimo
 *
 */
@RunWith(Parameterized.class)
public class CalculatorImplTest {

	/**
	 * Parametrized unit tests
	 * 1) Create Fields
	 * 2) Create Constructor for Injection of Parameters
	 * 3) Create static method to load a Fixture and annotate as @Parameters
	 * 4) Pass parameters to test method
	 * 5) Declare the test runner as Parametrized
	 */
	private int num1, num2, expected;
	public CalculatorImplTest(int num1, int num2, int expected) {
		this.num1 = num1;
		this.num2 = num2;
		this.expected = expected;
	}
	
	@Parameters( name = "{index}: add({0} + {1}) = {2}" )
	public static Collection<Integer[]> getFixtureData() {
		
		return Arrays.asList(new Integer[][] {
			{-1, 2, 1},
			{2, 2, 4},
			{-5, -5, -10}
		});
		
	}
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void addShouldReturnAResult() {
		Calculator c = new CalculatorImpl();
		int result = c.add(num1, num2);
		assertEquals(expected, result);
	}

}
