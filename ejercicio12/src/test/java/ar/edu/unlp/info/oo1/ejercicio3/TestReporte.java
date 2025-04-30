package ar.edu.unlp.info.oo1.ejercicio3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;

public class TestReporte {
	
	private ReporteDeConstruccion rep;
	private Pieza c;
	private Pieza e;
	private Pieza p;
	
	@BeforeEach
	public void setUp()throws Exception {
		
		rep = new ReporteDeConstruccion();
		
		c = new Cilindro("hierro" , "rojo" , 10 , 10);
		e = new Esfera("hierro" , "azul" , 10);
		p = new PrismaRectangular("metal" , "azul" , 10 , 10 ,10);
		
		rep.agregarPieza(c);
		rep.agregarPieza(e);
		rep.agregarPieza(p);
		
	}
	
	@Test
	void testGetVolumenMaterial() {
		double total = rep.getVolumenDeMaterial("hierro");
		double calculo = c.getVolumen() + e.getVolumen();
		assertEquals(total, calculo);
	}
	
	@Test
	void testGetSuperficieDeColor() {
		double total = rep.getSuperficieDeColor("azul");
		double calculo = e.getSuperficie() + p.getSuperficie();
		assertEquals(total, calculo);
	}
		
	
}
