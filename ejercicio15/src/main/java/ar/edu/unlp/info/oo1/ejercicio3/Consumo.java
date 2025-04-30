package ar.edu.unlp.info.oo1.ejercicio3;

public class Consumo {

	private double energiaActiva;
	private double energiaReactiva;
	
	public double getEnergiaActiva() {
		return energiaActiva;
	}
	public void setEnergiaActiva(double energiaActiva) {
		this.energiaActiva = energiaActiva;
	}
	public double getEnergiaReactiva() {
		return energiaReactiva;
	}
	public void setEnergiaReactiva(double energiaReactiva) {
		this.energiaReactiva = energiaReactiva;
	}
	
	public double calcularFpe() {
		return this.energiaActiva /  
				Math.sqrt(Math.pow(this.energiaActiva, 2) + Math.pow(this.energiaReactiva, 2));
	}
	
	public double calcularConsumo(double kwh) {
		return this.energiaActiva * kwh;
	}
	
	
	
}
