package ar.edu.unlp.info.oo1.ejercicio3;

import java.time.*;

public class Recibo {

	private String nombre;
	private String apellido;
	private int cuil;
	private int antiguedad;
	private LocalDate fechaDeEmision;
	private double montoTotal;
	
	public Recibo(String nombre , String apellido , int cuil , int antiguedad , double montoTotal) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.cuil=cuil;
		this.antiguedad=antiguedad;
		this.fechaDeEmision=LocalDate.now();
		this.montoTotal=montoTotal;
	}
}
