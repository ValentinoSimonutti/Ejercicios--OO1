package ar.edu.unlp.info.oo1.ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestEmail {
	private Email e;
	private Archivo a1;
	private Archivo a2;
	
	@BeforeEach
	void setUp() {
		e= new Email("Valentino", "Simonutti");
		a1= new Archivo("hola");
		a2 = new Archivo("como");
	}
	
	@Test
	void test() {
		assertEquals(e.adjuntos().size(),0);
	}
	
	@Test
	void test2() {
		e.agregarAdjunto(a1);
		assertEquals(e.adjuntos().size(),1);
	}
	
	@Test
	void test3() {
		assertEquals(e.tamaño(),18);
		e.agregarAdjunto(a1);
		e.agregarAdjunto(a2);
		assertEquals(e.tamaño(), 26);
	}
	
	@Test
	void test4() {
		assertEquals(e.equals("Valentino"), true);
		assertEquals(e.equals("Simonutti"), true);
		assertEquals(e.equals("hola"), false);
		assertEquals(e.equals(""), false);

	}
	
	

}
