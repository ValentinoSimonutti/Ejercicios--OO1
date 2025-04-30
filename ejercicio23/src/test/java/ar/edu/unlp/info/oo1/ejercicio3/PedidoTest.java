package ar.edu.unlp.info.oo1.ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PedidoTest {
	
	private Pedido p;
	private Producto prod;
	private Cliente c;
	private MedioDePago mdp;
	private FormaDeEnvio fde;

	@BeforeEach
	void setUp() throws Exception {
		c = new Cliente("agus" , "colli" , "51");
		prod = new Producto("valen " , "electro" , 100.00 , 3 , null );
		p = new Pedido(10 , prod , mdp , fde , c);
	}

	@Test
	void test() {

	}

}
