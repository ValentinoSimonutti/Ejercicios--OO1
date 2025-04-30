package ar.edu.unlp.info.oo1.ejercicio3;

public class PersonaFisica extends Cliente {

	private double dni;

	public PersonaFisica(String nombre, String direccion, double dni) {
		super(nombre, direccion);
		this.dni = dni;
	}

	public double enviosEntre(DateLapse periodo) {
		return super.enviosEntre(periodo) * 0.90;
	}	
}
