package ar.edu.unlp.info.oo1.ejercicio3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo implements Inversion {
	
	private LocalDate fechaDeConstitucion;
	private double montoDepositado;
	private double porcentajeDeInteresDiario;

	public PlazoFijo(LocalDate fechaDeConstitucion, double montoDepositado, double porcentajeDeInteresDiario) {
        this.fechaDeConstitucion = fechaDeConstitucion;
        this.montoDepositado = montoDepositado;
        this.porcentajeDeInteresDiario = porcentajeDeInteresDiario;
    }
	
	public double valorActual() {
		
		int diasTranscurridos = (int) ChronoUnit.DAYS.between(this.fechaDeConstitucion, LocalDate.now());
		double interesDiario = 1 + this.porcentajeDeInteresDiario;
		return this.montoDepositado * Math.pow(interesDiario, diasTranscurridos);
	}
}
