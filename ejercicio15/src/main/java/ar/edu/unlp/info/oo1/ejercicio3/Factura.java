package ar.edu.unlp.info.oo1.ejercicio3;

import java.time.LocalDate;

public class Factura {
	
	private Usuario usuario;
	private LocalDate fechaDeEmision;
	private double bonificacion;
	private double montoFinal;
	
	public Factura (Usuario us , LocalDate fecha, double bonificacion , double montofinal) {
		this.usuario=us;
		this.fechaDeEmision=fecha;
		this.bonificacion= bonificacion;
		this.montoFinal= montofinal;
	}
	
	
	

}
