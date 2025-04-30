package ar.edu.unlp.info.oo1.ejercicio3;

public class PoliticaFlexible implements Politica {

	
	public double cancelacion(Reserva r) {
		
		return r.precio();
	}
}
