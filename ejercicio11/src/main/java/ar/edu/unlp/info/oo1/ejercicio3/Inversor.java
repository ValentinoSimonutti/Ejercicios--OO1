package ar.edu.unlp.info.oo1.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Inversor {
	
	private String nombre;
	private ArrayList<Inversion> inversiones;
	
	public Inversor(String nombre) {
		this.nombre=nombre;
		this.inversiones= new ArrayList<Inversion>();
	}
	
	public void agregarInversion(Inversion inversion) {
        this.inversiones.add(inversion);
    }
	
	public double valorActual() {
		return this.inversiones
				.stream()
				.mapToDouble(inversion -> inversion.valorActual())
				.sum();
	}

}
