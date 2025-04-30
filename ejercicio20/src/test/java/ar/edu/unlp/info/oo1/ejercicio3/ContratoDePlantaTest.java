package ar.edu.unlp.info.oo1.ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContratoDePlantaTest {
	
	private ContratoDePlanta contrato;
	private ContratoDePlanta contratoSinHijos;
	private ContratoDePlanta contratoSinConyuge;
	private ContratoDePlanta contratoSinBonos;
	private ContratoDePlanta contratoCero;

	@BeforeEach
	void setUp() throws Exception {
		contrato = new ContratoDePlanta(LocalDate.now(), 100 , 100 , 100 , true , true);
		contratoSinHijos = new ContratoDePlanta(LocalDate.now().minusDays(15), 100 , 100 , 100 , false , true);
		contratoSinConyuge = new ContratoDePlanta(LocalDate.now(), 100 , 100 , 100 , true , false);
		contratoSinBonos= new ContratoDePlanta(LocalDate.now(), 100 , 100 , 100 , false , false);
		contratoCero = new ContratoDePlanta(LocalDate.now(), 0 , 100 , 100 , false , false);

	}

	@Test
	void calcularSueldoBasico() {
		assertEquals(contrato.calcularSueldoBasico(), 300);
	}
	
	@Test	
	void calcularSueldoBasicoCero() {
		assertEquals(contratoCero.calcularSueldoBasico(),0);
	}
	
	@Test
	void calcularSueldoBasicoSinHijos() {
		assertEquals(contratoSinHijos.calcularSueldoBasico(), 200);
	}
	
	@Test
	void calcularSueldoBasicoSinConyuge() {
		assertEquals(contratoSinConyuge.calcularSueldoBasico(), 200);
	}
	
	@Test
	void calcularSueldoBasicoSinBonos() {
		assertEquals(contratoSinBonos.calcularSueldoBasico(), 100);
	}

	@Test
	void calcularDuracionCero() {
		assertEquals(contrato.calcularDuracion(), 0);
		
	}
	
	@Test	
	void calcularDuracion() {
		assertEquals(contratoSinHijos.calcularDuracion(), 15 );	
	}

}
