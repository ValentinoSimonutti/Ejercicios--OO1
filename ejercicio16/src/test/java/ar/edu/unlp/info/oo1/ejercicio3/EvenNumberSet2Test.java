package ar.edu.unlp.info.oo1.ejercicio3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Set;

public class EvenNumberSet2Test {
    private Set<Integer> evenSet2;

    @BeforeEach
    public void setUp() {
        evenSet2 = new EvenNumberSet2();
    }

    @Test
    public void testAddEvenNumber() {
        assertTrue(evenSet2.add(2)); // Debería agregarlo
        assertTrue(evenSet2.contains(2));
    }

    @Test
    public void testAddOddNumber() {
        assertFalse(evenSet2.add(3)); // No debería agregarlo
        assertFalse(evenSet2.contains(3));
    }

    @Test
    public void testAddDuplicateEvenNumber() {
        evenSet2.add(4);
        assertFalse(evenSet2.add(4)); // Ya está en el set, no debería agregarlo de nuevo
    }

    @Test
    public void testAddAllEvenNumbers() {
        evenSet2.addAll(Set.of(2, 4, 6));
        assertTrue(evenSet2.contains(2));
        assertTrue(evenSet2.contains(4));
        assertTrue(evenSet2.contains(6));
    }

    @Test
    public void testAddAllMixedNumbers() {
        evenSet2.addAll(Set.of(1, 2, 3, 4));
        assertFalse(evenSet2.contains(1));
        assertTrue(evenSet2.contains(2));
        assertFalse(evenSet2.contains(3));
        assertTrue(evenSet2.contains(4));
    }

    @Test
    public void testRemove() {
        evenSet2.add(2);
        evenSet2.add(4);
        assertTrue(evenSet2.remove(2)); // Debería eliminar el número 2
        assertFalse(evenSet2.contains(2));
        assertTrue(evenSet2.contains(4)); // El 4 aún debe estar
    }

    @Test
    public void testSize() {
        evenSet2.add(2);
        evenSet2.add(4);
        assertEquals(2, evenSet2.size());
        evenSet2.add(4); // Intentar agregar duplicado
        assertEquals(2, evenSet2.size()); // No debería cambiar
    }

    @Test
    public void testIsEmpty() {
        assertTrue(evenSet2.isEmpty());
        evenSet2.add(2);
        assertFalse(evenSet2.isEmpty());
    }

    @Test
    public void testClear() {
        evenSet2.add(2);
        evenSet2.add(4);
        evenSet2.clear();
        assertTrue(evenSet2.isEmpty());
    }
}

