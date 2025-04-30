package ar.edu.unlp.info.oo1.ejercicio3;

import java.time.LocalDate;

public class Guarderia extends ServicioMedico {

	private int cantDias;

	public Guarderia(Mascota mascota, int cantDias) {
		super(mascota);
		this.cantDias = cantDias;
	}
	
	public double calcularCosto() {
		
		double total = this.cantDias * 500;
		if(this.getMascota().tieneCinco() ) {
			total= total * 0.90;
		}
		return total;
	}
	
	
	
}
