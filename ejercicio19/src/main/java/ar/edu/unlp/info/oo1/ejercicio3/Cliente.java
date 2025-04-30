package ar.edu.unlp.info.oo1.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {
	
	private List<Envio> envios;
	private String nombre;
	private String direccion;
	
	public Cliente( String nombre, String direccion) {
		this.envios = new ArrayList<Envio>();
		this.nombre = nombre;
		this.direccion = direccion;
	}

	public void agregarEnvio(Envio e) {
		this.envios.add(e);
	}
	
	public List<Envio> getEnvios() {
		return envios;
	}
	
	public double enviosEntre(DateLapse periodo) {
		
		return this.envios.stream()
				.filter(env -> periodo.includesDate(env.getDespacho()))
				.mapToDouble(e -> e.calcular())
				.sum();
	}
	

}
