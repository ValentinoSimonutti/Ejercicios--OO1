package ar.edu.unlp.info.oo1.ejercicio3;

import java.time.LocalDate;

public class EnvioLocal extends Envio {

	private TipoEntrega tipo;
	
	public EnvioLocal(LocalDate despacho, String origen, String destino, double peso, TipoEntrega tipo) {
		super(despacho, origen, destino, peso);
		this.tipo = tipo;
	}

	public double calcular() {
		return tipo.costoFijo();
	}
	
}
