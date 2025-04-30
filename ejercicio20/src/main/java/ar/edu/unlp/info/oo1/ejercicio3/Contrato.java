package ar.edu.unlp.info.oo1.ejercicio3;
import java.time.*;

public abstract class Contrato {

		private LocalDate fechaInicio;
		
		public Contrato(LocalDate fechaInicio) {
			this.fechaInicio = fechaInicio;
		}
		
		public abstract double calcularSueldoBasico();
		public abstract int calcularDuracion();

		public LocalDate getFechaInicio() {
			return fechaInicio;
		}

		
		
		

}
