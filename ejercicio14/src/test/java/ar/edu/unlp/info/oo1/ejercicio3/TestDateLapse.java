package ar.edu.unlp.info.oo1.ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.oo1.ejercicio32.DateLapse2;

import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestDateLapse {

    private DateLapseI lapsoNormal;
    private DateLapseI lapsoUnDia;
    private DateLapseI lapsoFechasIguales;
    
    @BeforeEach
    void setUp() {
        lapsoNormal = new DateLapse(LocalDate.of(2024, 1, 1), LocalDate.of(2024, 1, 15));
        //lapsoNormal = new DateLapse2(LocalDate.of(2024, 1, 1), 14);

        
        //lapsoUnDia = new DateLapse(LocalDate.of(2024, 1, 1), LocalDate.of(2024, 1, 2));
        lapsoUnDia = new DateLapse2(LocalDate.of(2024, 1, 1), 1);

        
        lapsoFechasIguales = new DateLapse(LocalDate.of(2024, 1, 1), LocalDate.of(2024, 1, 1));
        //lapsoFechasIguales = new DateLapse2(LocalDate.of(2024, 1, 1), 0);
        
        //no importa cual comente funcionan para todos los casos

        
    }
    
    @Test
    void testSizeInDays_LapsoNormal() {
        assertEquals(14, lapsoNormal.sizeInDays(), "El tamaño del lapso debería ser 14 días");
    }

    @Test
    void testSizeInDays_UnDia() {
        assertEquals(1, lapsoUnDia.sizeInDays(), "El tamaño del lapso debería ser de 1 día");
    }

    @Test
    void testSizeInDays_FechasIguales() {
        assertEquals(0, lapsoFechasIguales.sizeInDays(), "El tamaño del lapso debería ser 0 días");
    }
    
    @Test
    void testLapsos() {
    	LocalDate f = LocalDate.of(2024, 1, 15);
    	assertTrue(lapsoNormal.includesDate(f));
    	
    	 f = LocalDate.of(2024, 1, 1);
    	assertTrue(lapsoNormal.includesDate(f));
    	
    	 f = LocalDate.of(2024, 1, 10);
    	assertTrue(lapsoNormal.includesDate(f));
    	
    	f = LocalDate.of(2023, 12, 31);
    	assertFalse(lapsoNormal.includesDate(f));
    	
    	f = LocalDate.of(2024, 1, 16);
    	assertFalse(lapsoNormal.includesDate(f));
    }

    
}