package ar.edu.unlp.info.oo1.ejercicio3;

public class Circulo implements Figura {
	
	private double diametro;
	private double radio;
	
	public double getDiametro() {
		return this.radio * 2;
	}
	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double getPerimetro() {
		return Math.PI * getDiametro();
	}
	
	public double getArea() {
		return Math.PI * (this.radio* this.radio); 
	}
	
}
