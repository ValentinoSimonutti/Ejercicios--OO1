package ar.edu.unlp.info.oo1.ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConsultaMedicaTest {
	
	private ConsultaMedica cm;
	private Mascota mascota;
	private Medico medico;

	@BeforeEach
	void setUp() throws Exception {
		medico= new Medico("valen", LocalDate.now() , 100.0);
		mascota = new Mascota("pirulo" , LocalDate.now() , "perro");
		cm = new ConsultaMedica(mascota, medico);
		
	}

	@Test
	void testCalcularCosto() { // funciona de lunes a sabado
		assertEquals(cm.calcularCosto(), 400.0);
	}
	
	@Test
	void testCalcularCostoDomingo() { // domingo 
		cm.setFecha(LocalDate.of(2024 , 11 ,10));
		assertEquals(cm.calcularCosto(), 600 );
	}

}
