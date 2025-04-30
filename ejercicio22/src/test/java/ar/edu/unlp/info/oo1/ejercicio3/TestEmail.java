package ar.edu.unlp.info.oo1.ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestEmail {
	private Email e;
	private Email vacio;
	private Archivo a1;
	
	@BeforeEach
	void setUp() {
		e = new Email("Valentino", "Simonutti");
		vacio = new Email("", "");
		a1= new Archivo("hola");
	}
	
	/*
	@Test
	void testSinAdjuntos() {
		assertEquals(e.adjuntos().size(),0);
	}
	
	@Test
	void testConAdjuntos() {
		e.agregarAdjunto(a1);
		assertEquals(e.adjuntos().size(),1);
	}
	*/
	
	@Test
	void testTamaño() {
		assertEquals(e.tamaño(),18);
	}
	
	@Test
	void testTamañoCero() {
		assertEquals(vacio.tamaño(),0);
	}
	
	@Test
	void testTamañoConAdjuntos() {
		e.agregarAdjunto(a1);
		assertEquals(e.tamaño(),22);
	}
	
	@Test
	void testContiene() {
		assertEquals(e.contiene("Valentino"), true);
	}
	
	@Test
	void testNoContiene() {
		assertEquals(e.contiene("hola"), false);
	}
	
	@Test
	void testContieneVacio() {
		assertEquals(e.contiene(""), false);
	}
	

}
