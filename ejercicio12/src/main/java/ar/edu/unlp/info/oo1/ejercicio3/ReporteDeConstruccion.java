package ar.edu.unlp.info.oo1.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class ReporteDeConstruccion {
	private List<Pieza> piezas; 
	
	
	public ReporteDeConstruccion() {
		this.piezas = new ArrayList<Pieza>();
	}
	
	public void agregarPieza(Pieza unaPieza) {
		this.piezas.add(unaPieza);
	}
	
	public double getVolumenDeMaterial(String material) {
		return this.piezas.stream()
		.filter(p -> p.getMaterial().equals(material))
		.mapToDouble(p -> p.getVolumen()).sum();
	}
	
	public double getSuperficieDeColor(String color) {
		return this.piezas.stream()
				.filter(p -> p.getColor().equals(color))
				.mapToDouble(p -> p.getSuperficie()).sum();
	}

}
