package ar.edu.unlp.info.oo1.ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GuarderiaTest {

	private Guarderia guarderia;
	private Mascota mascota;
	
	@BeforeEach
	void setUp() throws Exception {
		mascota = new Mascota("pirulo" , LocalDate.now().minusYears(1) , "perro");
		guarderia = new Guarderia(mascota , 10);
		
	}

	@Test
	void testCalcularCosto() {
		assertEquals(guarderia.calcularCosto(), 5000);
	}
	
	@Test
	void testCalcularCosto5Servicios() {
		
		for(int i = 0 ; i< 5 ; i++) {
			mascota.agregarServicio(guarderia);
		}
		
		assertEquals(guarderia.calcularCosto(), 5000 * 0.90);
	}

}
