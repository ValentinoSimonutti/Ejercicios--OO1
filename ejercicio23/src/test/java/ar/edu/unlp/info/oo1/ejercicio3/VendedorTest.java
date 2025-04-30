package ar.edu.unlp.info.oo1.ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VendedorTest {
	private Vendedor v;
	
	@BeforeEach
	void setUp() throws Exception {
		v = new Vendedor("agus" , "colli" , "51");
		

	}

	@Test
	void testAgregarProducto() {
		v.agregarProducto("algo", "algo", 100.0, 1);
		assertEquals(v.getProductos().size() ,1);
	}

}
