package ar.edu.unlp.info.oo1.ejercicio3;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Vacunacion extends ServicioMedico {
	
	private Medico medico;
	private String nombre;
	private double costo;
	
	public Vacunacion(Mascota mascota, String nombre, double costo, Medico medico) {
		super(mascota);
		this.nombre =nombre;
		this.costo = costo;	
		this.medico=medico;
	}
	
	public double calcularCosto() {
		
		double total = this.medico.getHonorarios() + 500 + this.costo;
		if (this.getFechaDeServicio().getDayOfWeek() == DayOfWeek.SUNDAY) {
			total+=200;
		}
		return total;
	}
	
	
	
	
	

}
