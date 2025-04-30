package ar.edu.unlp.info.oo1.ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContratoPorHorasTest {
	
	private ContratoPorHoras contrato;
	private ContratoPorHoras contratoCero;
	private ContratoPorHoras contratoTerminado;

	
	@BeforeEach
	void setUp() throws Exception {
		contrato = new ContratoPorHoras(LocalDate.now().minusMonths(1), 100, 100, LocalDate.now());
		contratoCero = new ContratoPorHoras(LocalDate.now().minusYears(1), 0, 100, LocalDate.now());
		contratoTerminado = new ContratoPorHoras(LocalDate.now().minusYears(2), 0, 100, LocalDate.now().minusYears(1));

	}

	@Test
	void calcularSueldoBasico() {
		assertEquals(contrato.calcularSueldoBasico(), 10000);
	}
	
	@Test
	void calcularSueldoBasicoCero() {
		assertEquals(contratoCero.calcularSueldoBasico(), 0);
	}
	
	@Test
	void calcularDuracionSinTerminar() {
		int dias = (int) contrato.getFechaInicio().until(LocalDate.now(), ChronoUnit.DAYS); 
		assertEquals(contrato.calcularDuracion(), dias);
	}
	
	@Test
	void calcularDuracionTerminado() {
		int dias = (int) contratoCero.getFechaInicio().until(LocalDate.now(), ChronoUnit.DAYS); 
		assertEquals(contratoCero.calcularDuracion(), dias);
	}
	
	@Test
	void calcularDuracionTerminadoHaceUnAño() {
		int dias = (int) contratoTerminado.getFechaInicio().until(LocalDate.now().minusYears(1), ChronoUnit.DAYS); 
		assertEquals(contratoTerminado.calcularDuracion(), dias);
	}

}
