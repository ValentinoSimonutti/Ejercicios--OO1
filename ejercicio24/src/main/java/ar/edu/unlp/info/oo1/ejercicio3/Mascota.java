package ar.edu.unlp.info.oo1.ejercicio3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Mascota {
	
	private String nombre;
	private LocalDate fechaNacimiento;
	private String especie;
	private List<ServicioMedico> servicios;
	
	public Mascota(String nombre, LocalDate fechaNacimiento, String especie) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.especie = especie;
		this.servicios= new ArrayList<ServicioMedico>();
	}
	
	public void agregarServicio(ServicioMedico sm) {
		this.servicios.add(sm);
	}
	
	public boolean tieneCinco() {
		return this.servicios.size() >= 5;
	}
	
	public double recaudacionEnFecha(LocalDate fecha) {
		
		return this.servicios.stream().filter(ser -> ser.equalsFecha(fecha)).mapToDouble( s-> s.calcularCosto()).sum();
	}
	
	
	

}
