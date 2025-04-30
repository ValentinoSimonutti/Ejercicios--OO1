package ar.edu.unlp.info.oo1.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	private String nombre;
	private String direccion;
	private int dni;
	private List<Propiedad> propiedades;
	private List<Reserva> reservas;
	
	public Usuario(String nombre, String direccion, int dni) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.dni = dni;
		this.propiedades = new ArrayList<Propiedad>();
		this.reservas = new ArrayList<Reserva>();
	}

	public List<Reserva> getReservasEnPeriodo(DateLapse periodo) {
		return this.reservas.stream()
				.filter(r -> r.getPeriodo().overlaps(periodo))
				.toList();
	}
	
	public double calcularIngresos(DateLapse periodo) {
		List<Reserva> r = this.getReservasEnPeriodo(periodo);
		return r.stream().mapToDouble(res -> res.precio()).sum()  * 0.75;	
	}
	
	// Método para agregar una propiedad
    public void agregarPropiedad(Propiedad propiedad) {
        this.propiedades.add(propiedad);
    }

    // Método para agregar una reserva
    public void agregarReserva(Reserva reserva) {
        this.reservas.add(reserva);
    }
    
    //  método para verificar si una reserva existe
    public boolean existeReserva(Reserva reserva) {
        return this.reservas.contains(reserva);
    }
	
    public void eliminarReserva(Reserva reserva) {
        this.reservas.remove(reserva);
    }

}
