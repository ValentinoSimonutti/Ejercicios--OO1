package ar.edu.unlp.info.oo1.ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VacunacionTest {
	
	private Vacunacion v;
	private Mascota mascota;
	private Medico medico;

	@BeforeEach
	void setUp() throws Exception {
		medico= new Medico("valen", LocalDate.now() , 100.0);
		mascota = new Mascota("pirulo" , LocalDate.now() , "perro");
		v = new Vacunacion(mascota, "physer" , 100.0 , medico);
		
	}

	@Test
	void testCalcularCosto() { // funciona de lunes a sabado
		assertEquals(v.calcularCosto(), 700.0);
	}
	
	@Test
	void testCalcularCostoDomingo() { // domingo 
		v.setFecha(LocalDate.of(2024 , 11 ,10));
		assertEquals(v.calcularCosto(), 900 );
	}

}
