package ar.edu.unlp.info.oo1.ejercicio3;

import java.time.LocalDate;
import java.time.DayOfWeek;


public class ConsultaMedica extends ServicioMedico {
	
	private Medico medico;
	
	public ConsultaMedica(Mascota mascota , Medico medico) {
		super(mascota);	
		this.medico = medico;
	}
	
	public double calcularCosto() {
		
		double total = this.medico.getHonorarios() + 300 + this.medico.getAntiguedad() * 100;
		if (this.getFechaDeServicio().getDayOfWeek() == DayOfWeek.SUNDAY) {
			total+=200;
		}
		return total;
	}
	

}
