package ar.edu.unlp.info.oo1.ejercicio3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ContratoDePlanta extends Contrato {

	private double sueldoMensual;
	private double montoPorConyuge;
	private double montoPorHijos;
	private boolean tieneHijosACargo;
	private boolean tieneConyugeACargo;
	
	public ContratoDePlanta(LocalDate fechaInicio, double sueldoMensual, double montoPorConyuge, double montoPorHijos, boolean tieneH , boolean tieneC) {
		super(fechaInicio);
		this.sueldoMensual = sueldoMensual;
		this.montoPorConyuge = montoPorConyuge;
		this.montoPorHijos = montoPorHijos;
		this.tieneHijosACargo=tieneH;
		this.tieneConyugeACargo=tieneC;

	}

	public double calcularSueldoBasico() {
		
		double total = this.sueldoMensual;
		if( this.tieneHijosACargo) {
			total+=montoPorHijos;
		}
		if( this.tieneConyugeACargo) {
			total+=montoPorConyuge;
		}
		return total;
	}

	public int calcularDuracion() {
		int dias = (int) this.getFechaInicio().until(LocalDate.now(), ChronoUnit.DAYS); 
		return dias;
	}
	
}
