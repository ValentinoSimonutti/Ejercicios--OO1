package ar.edu.unlp.info.oo1.ejercicio3;

import java.util.*;

public class ClienteDeCorreo {

	private Carpeta inbox;
	private List<Carpeta> carpetas;
	
	public ClienteDeCorreo(){
		this.carpetas= new ArrayList<Carpeta>();
		this.inbox= new Carpeta("Inbox");
	}
	
	public void recibir(Email email) {
		this.inbox.agregarEmail(email);
	}
	
	public Carpeta getInbox() {
		return inbox;
	}

	public List<Carpeta> getCarpetas() {
		return carpetas;
	}

	public Email buscar(String texto) {
		return this.carpetas.stream().map(c -> c.buscar(texto)).findFirst().orElse(null);
	}
	
	public int espacioOcupado() {
		return this.inbox.espacioOcupado() 
				+ this.carpetas.stream()
				.mapToInt(c -> c.espacioOcupado()).sum();
	}
	
	public int cantidadTotalDeCorreos() {
		return this.inbox.cantidadMails() + this.carpetas.stream().mapToInt(c -> c.cantidadMails()).sum();
	}
	
	
	public BagImpl<String> cantidadMailsPorCategoria() {
		BagImpl<String> b = new BagImpl<String>();
		this.inbox.cantidadMailsPorCategoria(b);
		this.carpetas.stream().forEach(c -> c.cantidadMailsPorCategoria(b));
		return b;
	}
}
