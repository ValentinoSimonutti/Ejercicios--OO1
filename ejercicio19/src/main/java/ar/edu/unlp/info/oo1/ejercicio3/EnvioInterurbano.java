package ar.edu.unlp.info.oo1.ejercicio3;

import java.time.LocalDate;

public class EnvioInterurbano extends Envio {

	private double distancia;
	
	public EnvioInterurbano(LocalDate despacho, String origen, String destino, double peso, double distancia) {
		super(despacho, origen, destino, peso);
		this.distancia = distancia;
	}

	public double calcular(){	
		if (this.distancia < 100) {
			return 20 * this.getPeso();
		}
		else if (this.distancia >= 100 && this.distancia <= 500) {
			return 25 * this.getPeso();
		}
		else return 30 * this.getPeso();
	}
	
	
}
