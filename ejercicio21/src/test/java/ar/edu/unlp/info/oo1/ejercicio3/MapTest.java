package ar.edu.unlp.info.oo1.ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MapTest {
	
	private Map<String,Integer> mapa;

	@BeforeEach
	void setUp() throws Exception {
		
		mapa = new HashMap<>();
	}

	@Test
	void agregarYeliminarTuplas() {	
		mapa.put("Lionel Messi" , 111);
		mapa.put("Gabriel Batistuta", 56);
		mapa.put("Kun Aguero", 42);
		assertEquals(mapa.size(), 3);
		
		mapa.remove("Kun Aguero");
		assertEquals(mapa.size(), 2);	
		
		mapa.put("Lionel Messi", 112);
		assertEquals(mapa.size(), 2);
		assertEquals(mapa.get("Lionel Messi"), 112);
		
		 if (mapa.put("Gabriel Batistuta", 56) != null) {
	            System.out.println("No se puede agregar otra entrada con la clave 'Gabriel Batistuta'.");
	     } else {
	            System.out.println("Se agregó la entrada con la clave 'Gabriel Batistuta'.");
	     }
		
		int suma = mapa.values().stream().mapToInt(goles-> goles).sum();
		System.out.println("Cantidad total de goles: " + suma);

		

	}

}
