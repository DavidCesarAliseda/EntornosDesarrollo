package calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test2 {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void test1() {
		int res=Calculadora.resta(3, 2);
		int esperado = 1;
		assertEquals(esperado, res);
	}

}
