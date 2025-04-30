package ar.edu.unlp.info.oo1.ejercicio3;

import java.util.ArrayList;

public class Propiedad {
	
	private String direccion;
	private String nombreDesc;
	private double precioPorNoche;
	private Usuario propietario;
	private ArrayList<Reserva> reservas;
	
	public Propiedad(String direccion, String nombreDesc, double precioPorNoche, Usuario propietario) {
	    this.direccion = direccion;
	    this.nombreDesc = nombreDesc;
	    this.precioPorNoche = precioPorNoche;
	    this.propietario = propietario;
	    this.reservas = new ArrayList<Reserva>();
	}
	
	public boolean estaDisponible(DateLapse periodo) {
	    // Verifica que ninguna reserva existente se solape con el período dado
	    return this.reservas.stream().noneMatch(reserva -> reserva.getPeriodo().overlaps(periodo));
	}
	
	
	public boolean crearReserva(Usuario u , DateLapse periodo) {
		if (this.estaDisponible(periodo)) {
			 new Reserva(u , this, periodo);
			 return true;
		}
		return false;
	}
	
	public void agregarReserva(Reserva r) {
		this.reservas.add(r);
	}
	
	public void eliminarReserva(Reserva r) {
		this.reservas.remove(r);
	}

	public double getPrecioPorNoche() {
		return precioPorNoche;
	}

	public void setPrecioPorNoche(double precioPorNoche) {
		this.precioPorNoche = precioPorNoche;
	}
	
	
	
	
	

}
