package ar.edu.unlp.info.oo1.ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MascotaTest {
	private Mascota mascota;
	private Mascota mascotaCinco;
	private Medico medico;

	@BeforeEach
	void setUp() throws Exception {
		mascota = new Mascota("pirulo", LocalDate.now().minusYears(1), "perro");
		mascotaCinco = new Mascota("pirulo", LocalDate.now().minusYears(5), "perro");
		medico = new Medico("elagus" , LocalDate.now().minusYears(5) , 100.0);

		ConsultaMedica s;
		for (int i = 0 ; i < 5 ; i++) {
			s = new ConsultaMedica( mascotaCinco , medico );
		}

	}

	@Test
	void testnoTieneCinco() {
		assertEquals(mascota.tieneCinco(), false);
	}
	
	@Test
	void testTieneCinco() {
		assertEquals(mascotaCinco.tieneCinco(), true);
	}

}
