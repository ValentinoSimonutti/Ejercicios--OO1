package ar.edu.unlp.info.oo1.ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestArchivo {
	private Archivo a;
	
	@Test
	void test() {
		a = new Archivo("hola");
		assertEquals(a.tamaño(), 4);
	}
	
	@Test
	void test1() {
		a = new Archivo("");
		assertEquals(a.tamaño(), 0);
	}
	
}
