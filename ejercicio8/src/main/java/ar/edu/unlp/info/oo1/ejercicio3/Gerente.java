package ar.edu.unlp.info.oo1.ejercicio3;

public class Gerente extends EmpleadoJerarquico {
	private String nombre;
	
	public Gerente(String nombre) {
		this.nombre=nombre;
	}
	
	public double aportes() {
		return this.montoBasico() * 0.05d;
	}
	
	public double montoBasico() {
		return 57000;
	}
}
