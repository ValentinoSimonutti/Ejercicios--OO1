package ar.edu.unlp.info.oo1.ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCarpeta {
	private Carpeta c;
	private Carpeta c2;	
	private Email e1;
	private Email e2;
	private Archivo a1;
	
	@BeforeEach
	void setUp() {
		e1= new Email("Valentino", "Simonutti");
		e2 = new Email("hola" , "faber");
		a1= new Archivo("hola");
		c = new Carpeta("c1");
		c2 = new Carpeta("c2");		
	}

	@Test
	void test() {
		assertEquals(c.getEmails().size(), 0);
		assertEquals(c2.getEmails().size(), 0);
		
		c.agregarEmail(e1);
		c2.agregarEmail(e2);
		
		assertEquals(c.getEmails().size(), 1);
		assertEquals(c2.getEmails().size(), 1);
		
		c.mover(e1, c2);
		assertEquals(c.getEmails().size(), 0);
		assertEquals(c2.getEmails().size(), 2);

	}
	
	@Test
	void test1() {
		e1.agregarAdjunto(a1);
		c.agregarEmail(e1);
		c.agregarEmail(e2);
		
		assertEquals(c.espacioOcupado(),31);
	}
	
	@Test
	void test2() {
		e1.agregarAdjunto(a1);
		c.agregarEmail(e1);
		c.agregarEmail(e2);
		
		assertEquals(c.buscar("Valentino"), e1);
		assertEquals(c.buscar("Simonutti"), e1);
		assertEquals(c.buscar("hola"), e2);
		assertEquals(c.buscar("faber"), e2);
		assertEquals(c.buscar(""), null);
		assertEquals(c.buscar("nada"), null);

	}
	
	@Test
	void test4() {
		c.agregarEmail(e1);
		c.mover(e2, c2);
		assertEquals(c.getEmails().size(), 1);	
		
		c.mover(e1, c);
		assertEquals(c.getEmails().size(), 1);	
		
		c.mover(e1, c2);
		assertEquals(c.getEmails().size(), 0);	

	}
	
	
	
	

}
