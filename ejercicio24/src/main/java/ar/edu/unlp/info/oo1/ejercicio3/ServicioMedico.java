package ar.edu.unlp.info.oo1.ejercicio3;

import java.time.LocalDate;

public abstract class ServicioMedico {
	
	private Mascota mascota;
	private LocalDate fechaDeServicio;

	public ServicioMedico(Mascota mascota) {
		this.mascota = mascota;
		this.fechaDeServicio=LocalDate.now();
		mascota.agregarServicio(this);
	}
	
	public abstract double calcularCosto();

	public LocalDate getFechaDeServicio() {
		return fechaDeServicio;
	}

	public Mascota getMascota() {
		return mascota;
	}
	
	public boolean equalsFecha(LocalDate fecha) {
		return this.fechaDeServicio.equals(fecha);
	}
	
	
	public void setFecha(LocalDate fecha) {
		this.fechaDeServicio = fecha;
	}

}
