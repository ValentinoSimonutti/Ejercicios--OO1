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
		c2 = new Carpeta("");		
	}
	/*
	@Test
	void testAgregarEmail() {
		c.agregarEmail(e1);
		assertEquals(c.getEmails().size(), 1);

	}
	
	@Test	
	void testMover() {
		c.agregarEmail(e1);
		c2.agregarEmail(e2);
		c.mover(e1, c2);
		assertEquals(c.getEmails().size(), 0);
		assertEquals(c2.getEmails().size(), 2);
	}*/
	
	@Test
	void testEspacioOcupado() {
		e1.agregarAdjunto(a1);
		c.agregarEmail(e1);
		c.agregarEmail(e2);
		assertEquals(c.espacioOcupado(),31);
	}
	
	@Test
	void testEspacioOcupadoCero() {
		assertEquals(c2.espacioOcupado(),0);
	}
	
	@Test
	void testBuscar() {
		e1.agregarAdjunto(a1);
		assertEquals(c.buscar("Valentino"), e1);

	}
	
	@Test
	void testBuscarVacio() {
		assertEquals(c.buscar("Valentino"), null);
	}
	
	@Test	
	void testCantidadMails() {
		c.agregarEmail(e1);
		assertEquals(c.cantidadMails(),1);
	}
	
	@Test	
	void testCantidadMailsCero() {
		assertEquals(c.cantidadMails(),0);
	}
	
	
	
	

}
