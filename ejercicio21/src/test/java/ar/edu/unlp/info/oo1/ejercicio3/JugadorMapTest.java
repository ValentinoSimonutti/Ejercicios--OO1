package ar.edu.unlp.info.oo1.ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JugadorMapTest {
	
		private Map<Jugador,Integer> mapa;

		@BeforeEach
		void setUp() throws Exception {
			mapa = new HashMap<>();
		}

		@Test
		void agregarYeliminarTuplas() {	
			
			Jugador j = new Jugador("lio", "messi");
			Jugador j2 = new Jugador("Gabriel", "Batistuta");
			Jugador j3 = new Jugador("Kun","Aguero");

			mapa.put(j , 111);
			mapa.put(j2, 56);
			mapa.put(j3, 42);
			
			assertEquals(mapa.size(), 3);
			
			mapa.remove(j3);
			assertEquals(mapa.size(), 2);	
			
			Jugador j4 = new Jugador("lio", "messi");
			mapa.put(j4, 112);
			assertEquals(mapa.size(), 2);
			assertEquals(mapa.get(j), 112);
			
			Jugador j5 = new Jugador("Gabriel", "Batistuta");
			
			 if (mapa.put(j5, 56) != null) {
		            System.out.println("No se puede agregar otra entrada con la clave 'Gabriel Batistuta'.");
		     } else {
		            System.out.println("Se agregó la entrada con la clave 'Gabriel Batistuta'.");
		     }
			
			int suma = mapa.values().stream().mapToInt(goles-> goles).sum();
			System.out.println("Cantidad total de goles: " + suma);

			

		}

	}

