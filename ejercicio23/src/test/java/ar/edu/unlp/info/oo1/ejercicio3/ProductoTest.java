package ar.edu.unlp.info.oo1.ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTest {
	private Producto p;

	@BeforeEach
	void setUp() throws Exception {
		p = new Producto("algo" , "electro", 10.0 , 10 , null);
	}

	@Test
	void testTieneUnidadesLimite() {
		assertEquals(p.tieneUnidades(10), true);
	}
	
	@Test
	void testNoTieneUnidades() {
		assertEquals(p.tieneUnidades(15), false);
	}
	
	@Test
	void testTieneUnidades() {
		assertEquals(p.tieneUnidades(5), true);
	}
	
	@Test
	void testRestarUnidades() {
		
		p.restarUnidades(10);
		assertEquals(p.getCantidadDeUnidades(), 0);
	}
	
	@Test
	void testEsDeCategoria() {
		
		assertEquals(p.esDeCategoria("electro"), true);
	}
	
	@Test
	void testNoEsDeCategoria() {
		
		assertEquals(p.esDeCategoria("home"), false);
	}

}
