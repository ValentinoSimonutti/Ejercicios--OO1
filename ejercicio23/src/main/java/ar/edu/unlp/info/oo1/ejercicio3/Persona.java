package ar.edu.unlp.info.oo1.ejercicio3;

public abstract class Persona {

	private String nombre;
	private String apellido;
	private String direccion;
	
	public Persona(String nombre, String apellido, String direccion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion= direccion;
	}

	public String getDireccion() {
		return direccion;
	}
	
	
	
	
	
}
