package ar.edu.unlp.info.oo1.ejercicio3;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Set;

public class EvenNumberSetTest {
    private Set<Integer> evenSet;

    @BeforeEach
    public void setUp() {
        evenSet = new EvenNumberSet();
    }

    @Test
    public void testAddEvenNumber() {
        assertTrue(evenSet.add(2)); // Debería agregarlo
        assertTrue(evenSet.contains(2));
    }

    @Test
    public void testAddOddNumber() {
        assertFalse(evenSet.add(3)); // No debería agregarlo
        assertFalse(evenSet.contains(3));
    }

    @Test
    public void testAddDuplicateEvenNumber() {
        evenSet.add(4);
        assertFalse(evenSet.add(4)); // Ya está en el set, no debería agregarlo de nuevo
    }

    @Test
    public void testAddAllEvenNumbers() {
        evenSet.addAll(Set.of(2, 4, 6));
        assertTrue(evenSet.contains(2));
        assertTrue(evenSet.contains(4));
        assertTrue(evenSet.contains(6));
    }

    @Test
    public void testAddAllMixedNumbers() {
        evenSet.addAll(Set.of(1, 2, 3, 4));
        assertFalse(evenSet.contains(1));
        assertTrue(evenSet.contains(2));
        assertFalse(evenSet.contains(3));
        assertTrue(evenSet.contains(4));
    }

    @Test
    public void testRemove() {
        evenSet.add(2);
        evenSet.add(4);
        assertTrue(evenSet.remove(2)); // Debería eliminar el número 2
        assertFalse(evenSet.contains(2));
        assertTrue(evenSet.contains(4)); // El 4 aún debe estar
    }

    @Test
    public void testSize() {
        evenSet.add(2);
        evenSet.add(4);
        assertEquals(2, evenSet.size());
        evenSet.add(4); // Intentar agregar duplicado
        assertEquals(2, evenSet.size()); // No debería cambiar
    }

    @Test
    public void testIsEmpty() {
        assertTrue(evenSet.isEmpty());
        evenSet.add(2);
        assertFalse(evenSet.isEmpty());
    }

    @Test
    public void testClear() {
        evenSet.add(2);
        evenSet.add(4);
        evenSet.clear();
        assertTrue(evenSet.isEmpty());
    }
}
