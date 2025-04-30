package ar.edu.unlp.info.oo1.ejercicio3;

import java.util.ArrayList;

public class Propiedad {
	
	private String direccion;
	private String nombreDesc;
	private double precioPorNoche;
	private Usuario propietario;
	private ArrayList<Reserva> reservas;
	private Politica politica;
	
	public Propiedad(String direccion, String nombreDesc, double precioPorNoche, Usuario propietario, Politica politica) {
	    this.direccion = direccion;
	    this.nombreDesc = nombreDesc;
	    this.precioPorNoche = precioPorNoche;
	    this.propietario = propietario;
	    this.reservas = new ArrayList<Reserva>();
	    this.politica=politica;
	    		
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
	
	public double eliminarReserva(Reserva r) {
		this.reservas.remove(r);
		return politica.cancelacion(r);
	}

	public double getPrecioPorNoche() {
		return precioPorNoche;
	}

	public void setPrecioPorNoche(double precioPorNoche) {
		this.precioPorNoche = precioPorNoche;
	}
	
	
	
	
	

}
