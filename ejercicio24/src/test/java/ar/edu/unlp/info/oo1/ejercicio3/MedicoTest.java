package ar.edu.unlp.info.oo1.ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MedicoTest {
	private Medico medico;
	private Medico medicoCero;
	

	@BeforeEach
	void setUp() throws Exception {
		medico = new Medico("elagus" , LocalDate.now().minusYears(5) , 100.0);
		medicoCero = new Medico("elagus" , LocalDate.now() , 100.0);

	}

	@Test
	void testGetAntiguedad() {
		assertEquals(medico.getAntiguedad(), 5);
	}
	
	@Test
	void testGetAntiguedadCero() {
		assertEquals(medicoCero.getAntiguedad(), 0);
	}
	
	

}
