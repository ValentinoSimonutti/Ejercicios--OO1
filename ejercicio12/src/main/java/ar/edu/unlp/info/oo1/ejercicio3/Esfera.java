package ar.edu.unlp.info.oo1.ejercicio3;

public class Esfera extends Pieza {
	private int radio;
	
	public Esfera(String material, String color, int radio) {
		super(material, color);
		this.radio = radio;
	}

	public double getSuperficie() {
		return 4 * Math.PI * this.radio * this.radio;
	}
	
	public double getVolumen() {
		return (4.00/3.00) * Math.PI * this.radio * this.radio * this.radio;
	}
}
