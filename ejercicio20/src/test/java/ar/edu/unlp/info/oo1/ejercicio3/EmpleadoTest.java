package ar.edu.unlp.info.oo1.ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoTest {

	private Empleado empleadoSinContratos;
    private Empleado empleadoConContratoHora;
    private Empleado empleadoConContratoPlanta;
    private Empleado empleadoConVariosContratos;

    @BeforeEach
    void setUp() {
        empleadoSinContratos = new Empleado("Juan", "Perez", 12345678, LocalDate.of(1985, 5, 10), false, false);
        empleadoConContratoHora = new Empleado("Ana", "Gomez", 87654321, LocalDate.of(1990, 3, 15), false, false);
        empleadoConContratoPlanta = new Empleado("Luis", "Lopez", 45678901, LocalDate.of(1988, 7, 25), true, true);
        empleadoConVariosContratos = new Empleado("Maria", "Diaz", 23456789, LocalDate.of(1980, 1, 5), true, false);

        // Agregando contratos para pruebas
        empleadoConVariosContratos.agregarContratoPorHora(LocalDate.now().minusYears(4), 60, 100, LocalDate.now().minusYears(3));
        empleadoConVariosContratos.agregarContratoDePlanta(LocalDate.now().minusYears(1), 2500, 400, 300);
    }
    
    @Test
    void agregarContratoDePlanta() {
        empleadoConContratoPlanta.agregarContratoDePlanta(LocalDate.now().minusYears(2), 2000, 300, 200);
        assertEquals(empleadoConContratoPlanta.getContratos().size(), 1);
    }
    @Test

    void agregarContratoPorHora() {
        empleadoConContratoHora.agregarContratoPorHora(LocalDate.now().minusMonths(2), 50, 100, LocalDate.now().plusMonths(1));
        assertEquals(empleadoConContratoHora.getContratos().size(), 1);
    }
    @Test
    
    void getAntiguedadCero() {
    	assertEquals(empleadoConContratoHora.getAntiguedad(), 0);
    }
    
    @Test
    void getAntiguedad() {
    	empleadoConContratoHora.agregarContratoPorHora(LocalDate.now().minusYears(1), 50, 100, LocalDate.now());
    	assertEquals(empleadoConContratoHora.getAntiguedad(), 1);

    }
    
    
    @Test
    void generarReciboSinContratos() {
    	assertNull(empleadoSinContratos.generarReciboDeSueldo());
    }
    
    
    @Test
    void generarReciboConContratos() {
    	assertNotNull(empleadoConVariosContratos.generarReciboDeSueldo());
    }
    @Test
    void calcularMontoTotal() {
    	assertEquals(empleadoSinContratos.calcularMontoTotal(100, 1), 100);
    	
    }
    @Test
    void calcularMontoTotalDentroDeRango() {
    	assertEquals(empleadoSinContratos.calcularMontoTotal(100, 5), 130);
    	
    }

}
