package ar.edu.unlp.info.oo1.ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCliente {
	private ClienteDeCorreo cliente; 
	private Carpeta c;
	private Email e1;
	private Email e2;
	private Archivo a1;
	
	@BeforeEach
	void setUp() {
		cliente = new ClienteDeCorreo();
		e1= new Email("Valentino", "Simonutti");
		e2 = new Email("hola" , "faber");
		a1= new Archivo("hola");
		c = new Carpeta("c1");
		
	}

	
	@Test
	void test(){
		assertEquals(cliente.espacioOcupado(), 0);
		
		e1.agregarAdjunto(a1);		cliente.recibir(e1);
		c.agregarEmail(e2);
		cliente.getCarpetas().add(c);
		
		assertEquals(cliente.espacioOcupado(), c.espacioOcupado() + cliente.getInbox().espacioOcupado() );
		
		assertEquals(cliente.buscar("Valentino"), e1);
		assertEquals(cliente.buscar("Simonutti"), e1);
		assertEquals(cliente.buscar("hola"), e2);
		assertEquals(cliente.buscar("faber"), e2);
		
		assertNull(cliente.buscar("nadaa"));
		assertEquals(cliente.buscar("nadaaa"), null);
		



	}


}
