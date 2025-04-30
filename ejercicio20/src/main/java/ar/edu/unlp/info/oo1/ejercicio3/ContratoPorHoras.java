package ar.edu.unlp.info.oo1.ejercicio3;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class ContratoPorHoras extends Contrato {

	private double valorHora;
	private int numeroHoras;
	private LocalDate fechaFin;
	
	public ContratoPorHoras(LocalDate fechaInicio, double valorHora, int numeroHoras, LocalDate fechaFin) {
		super(fechaInicio);
		this.valorHora = valorHora;
		this.numeroHoras = numeroHoras;
		this.fechaFin = fechaFin;
	}

	public double calcularSueldoBasico() {
		return this.valorHora * this.numeroHoras;
	}

	public int calcularDuracion() {
		
		int dias =0;
		if(fechaFin.isAfter(LocalDate.now())) {
			dias = (int) this.getFechaInicio().until(LocalDate.now(), ChronoUnit.DAYS); 
		}
		else {
			dias = (int) this.getFechaInicio().until(fechaFin, ChronoUnit.DAYS);
		}
	
		return dias;
	
	}
	
}
