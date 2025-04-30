package ar.edu.unlp.info.oo1.ejercicio3;

import java.time.LocalDate;

public class EnvioInternacional extends Envio {
	
	public EnvioInternacional(LocalDate despacho, String origen, String destino, double peso) {
		super(despacho, origen, destino, peso);
	}
	
	public double calcular() {
		
		if (this.getPeso() <= 1000) {
			return 5000 + (10 * this.getPeso());
		}
		else {
			return 5000 + (12 * this.getPeso());
		}
		
	}

}
