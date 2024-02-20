package junit;

import static org.junit.Assert.*;


import org.junit.Test;


public class NumerosAmigosTest {

	@Test
	public void testAmigoMal() {
		NumerosAmigos amigoMal = new NumerosAmigos(30, 50);
        assertFalse(amigoMal.amigo());
	}

	@Test
	public void testAmigoPerfecto() {
		NumerosAmigos amigoPerf = new NumerosAmigos(496, 496);
        assertTrue(amigoPerf.amigo());
	}
	@Test
	public void testEsCeroN1() {
		NumerosAmigos esCero = new NumerosAmigos(0, 0);
		assertNull(esCero.esN1IgualAN2());
	}
	@Test
	public void testN1yN2SonIguales() {
		int num1 = 20;
		int num2 = 20;
		Integer resultado=1;
		NumerosAmigos iguales= new NumerosAmigos(num1, num2);
		assertEquals(resultado,iguales.esN1IgualAN2());
	}
	@Test
	public void testN1yN2NoSonIguales() {
		int num1 = 40;
		int num2 = 20;
		Integer resultado=1;
		NumerosAmigos desiguales= new NumerosAmigos(num1, num2);
		assertNotEquals(resultado,desiguales.esN1IgualAN2());
	}

}
