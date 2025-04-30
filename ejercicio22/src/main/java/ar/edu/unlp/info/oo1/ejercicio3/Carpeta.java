package ar.edu.unlp.info.oo1.ejercicio3;

import java.util.*;


public class Carpeta {
	private String nombre;
	private List<Email> emails;
	
	public Carpeta (String nombre) {
		this.emails = new ArrayList<Email>();
		this.nombre=nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public List<Email> getEmails(){
		return emails;
	}
	
	public void agregarEmail(Email e) {
		this.emails.add(e);
	}
	
	public void mover(Email email , Carpeta destino) {
		this.emails.remove(email);
		destino.agregarEmail(email);
	}
	
	public int espacioOcupado() {
		return this.emails.stream().mapToInt(e -> e.tamaño()).sum();
	}
	
	public Email buscar(String texto) {
		return this.emails.stream().filter(e -> e.contiene(texto)).findFirst().orElse(null);
	}
	
	public int cantidadMails() {
		return this.emails.size();
	}
	
	public void cantidadMailsPorCategoria(BagImpl<String> bolsa) {
		
		this.emails.stream().forEach(e -> e.categoria(bolsa));
					
	}
	
}
