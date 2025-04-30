package ar.edu.unlp.info.oo1.ejercicio3;

public class Cuerpo3D {

	private double altura;
	private Figura caraBasal;
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public void setCaraBasal(Figura cara) {
		this.caraBasal = cara;
	}
	
	public double getSuperficieExterior() {
		return (2* this.caraBasal.getArea() + this.caraBasal.getPerimetro() * getAltura());		
	}
	
	public double getVolumen() {
		return this.caraBasal.getArea() * this.getAltura();
	}
	
	
}
