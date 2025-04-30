package ar.edu.unlp.info.oo1.ejercicio3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestInversor {

    private Inversion inversionEnAcciones;
    private Inversion plazoFijo;
    private Inversor inversor;

    @BeforeEach
    void setUp() {
        // Configurar la inversión en acciones
        inversionEnAcciones = new InversionEnAcciones("Google", 5, 200.0); // 5 acciones de 200 cada una

        // Configurar el plazo fijo
        LocalDate fechaConstitucion = LocalDate.now().minusDays(60); // Plazo fijo constituido hace 60 días
        plazoFijo = new PlazoFijo(fechaConstitucion, 5000.0, 0.001); // Interés diario del 0.1%
        
        // Crear inversor con las inversiones
        inversor = new Inversor("Juan");
        inversor.agregarInversion(inversionEnAcciones);
        inversor.agregarInversion(plazoFijo);
    }

    @Test
    void testValorActualInversionEnAcciones() {
        // El valor actual de la inversión en acciones debería ser 5 * 200
        assertEquals(1000.0, inversionEnAcciones.valorActual());
        inversionEnAcciones = new InversionEnAcciones("valentinita", 5, 0); // 5 acciones de 200 cada una
        assertEquals(0, inversionEnAcciones.valorActual());

    }

    @Test
    void testValorActualPlazoFijo() {
        // Cálculo esperado del interés compuesto
        double interesDiario = 1.001; // 1 + 0.1%
        long dias = 60;
        double valorEsperado = 5000.0 * Math.pow(interesDiario, dias);

        // Verificar que el valor actual calculado sea correcto
        assertEquals(valorEsperado, plazoFijo.valorActual(), 0.001);
    }

    @Test
    void testValorTotalInversionesDelInversor() {
        // Calcular el valor total esperado
        double valorAcciones = 1000.0; // 5 acciones de 200 cada una
        double interesDiario = 1.001; // 1 + 0.1%
        long dias = 60;
        double valorPlazoFijo = 5000.0 * Math.pow(interesDiario, dias);

        double valorTotalEsperado = valorAcciones + valorPlazoFijo;

        // Verificar que el valor total de las inversiones del inversor sea correcto
        assertEquals(valorTotalEsperado, inversor.valorActual(), 0.001);
    }
}

