package ar.edu.unlp.info.oo1.ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClienteTest {
	
	private Cliente c; 
	private Producto p;
	private Producto pUnidades;
	private FormaDeEnvio fde;
	private MedioDePago mdp;

	@BeforeEach
	void setUp() throws Exception {
		
		c = new Cliente("agus" , "colli" , "51");
		fde = new Domicilio();
		mdp = new AlContado();
		p = new Producto("valen " , "electro" , 100.00 , 3 , null );
		pUnidades = new Producto("valen " , "electro" , 100.00 , 10 , null );

	}

	@Test
	void testCrearPedidoVacio() {
		assertEquals(c.crearPedido(p, fde, mdp, 4), false);
		
	}
	
	@Test
	void testCrearPedido() {
		assertEquals(c.crearPedido(pUnidades, fde, mdp, 4), true);
		
	}
	
	@Test
	void testCantidadPorCategoria() {
		c.crearPedido(pUnidades, fde, mdp, 1);
		assertEquals(c.pedidosPorCategoria("electro"), 1);
	}
	
	@Test
	void testCantidadPorCategoriaSin() {
		c.crearPedido(pUnidades, fde, mdp, 1);
		assertEquals(c.pedidosPorCategoria("nada"), 0);
	}

}
