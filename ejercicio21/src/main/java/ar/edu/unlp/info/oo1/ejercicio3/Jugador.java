package ar.edu.unlp.info.oo1.ejercicio3;

public class Jugador {

	private String nombre;
	private String apellido;
	
	public Jugador(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/*
	public boolean equals(Jugador j) {
		return this.nombre.equals(j.getNombre()) && this.apellido.equals(j.getApellido());
	}
	*/
	
	 @Override
	public boolean equals(Object obj) {
	        if (this == obj) return true; // Comparar referencia
	        if (obj == null || getClass() != obj.getClass()) return false; // Verificar null y tipo
	        Jugador j = (Jugador) obj; // Hacer casting
	        return nombre.equals(j.getNombre()) && apellido.equals(j.getApellido());
	    }
	    
	    
	
	public int hashCode() {
	    return 31 * nombre.hashCode() + apellido.hashCode();
	}
	
	
}
