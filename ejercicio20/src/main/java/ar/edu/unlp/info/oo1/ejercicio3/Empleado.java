package ar.edu.unlp.info.oo1.ejercicio3;

import java.time.*;
import java.util.ArrayList;
import java.util.List;

public class Empleado {
	
	private String nombre;
	private String apellido;
	private int cuil;
	private LocalDate fechaDeNacimiento;
	private boolean tieneHijosACargo;
	private boolean tieneConyugeACargo;
	private List<Contrato> contratos;
	
	
	public Empleado(String nombre, String apellido, int cuil, LocalDate fechaDeNacimiento, boolean tieneHijosACargo, boolean tieneConyugeACargo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cuil = cuil;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.tieneHijosACargo = tieneHijosACargo;
		this.tieneConyugeACargo = tieneConyugeACargo;
		this.contratos = new ArrayList<Contrato>();
	}
	
	public void agregarContratoPorHora(LocalDate fechaInicio, double valorHora, int numeroHoras, LocalDate fechaFin) {
		ContratoPorHoras c = new ContratoPorHoras(fechaInicio , valorHora , numeroHoras , fechaFin);
		this.contratos.add(c);
	}
	
	public void agregarContratoDePlanta(LocalDate fechaInicio, double sueldoMensual, double montoPorConyuge, double montoPorHijos) {
		ContratoDePlanta c = new ContratoDePlanta(fechaInicio , sueldoMensual , montoPorConyuge ,montoPorHijos, tieneHijosACargo, tieneConyugeACargo);
		this.contratos.add(c);
	}
	
	public int getAntiguedad() {
		return this.contratos.stream().mapToInt(c -> c.calcularDuracion()).sum() / 365;
	}

	public Recibo generarReciboDeSueldo() {
		
		if (!this.contratos.isEmpty()) {
			Contrato c = this.contratos.get(contratos.size()-1);
			double monto = c.calcularSueldoBasico();
			int años = this.getAntiguedad();
			double montoTotal = calcularMontoTotal(monto, años);
			return new Recibo(this.nombre, this.apellido , this.cuil , años , montoTotal);
		}
		else {
			return null;
		}
	}
	
	public double calcularMontoTotal(double monto, int años) {
	    double montototal = monto;
	    
	    if (años >= 20) {
	        montototal *= 2.00;
	    } else if (años >= 15) {
	        montototal *= 1.70;
	    } else if (años >= 10) {
	        montototal *= 1.50;
	    } else if (años >= 5) {
	        montototal *= 1.30;
	    }
	    
	    return montototal;
	}

	public List<Contrato> getContratos() {
		return contratos;
	}

	
	
}
