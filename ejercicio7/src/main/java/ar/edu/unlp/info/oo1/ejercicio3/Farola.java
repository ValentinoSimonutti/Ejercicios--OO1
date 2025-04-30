package ar.edu.unlp.info.oo1.ejercicio3;

import java.util.LinkedList;
import java.util.List;

public class Farola {
	
	private boolean estado;
	private List<Farola> vecinas;
	/*
	* Crear una farola. Debe inicializarla como apagada
	*/
	public Farola () {
		this.estado=false;
		this.vecinas = new LinkedList<Farola>();
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	/*
	* Crea la relación de vecinos entre las farolas. La relación de vecinos entre las farolas es recíproca, es decir el receptor del mensaje será vecino de otraFarola, al igual que otraFarola también se convertirá en vecina del receptor del mensaje
	*/
	public void pairWithNeighbor( Farola otraFarola ) {
		this.getNeighbors().add(otraFarola);
		otraFarola.helper(this);
	}
	
	private void helper(Farola unaFarola) {
		this.getNeighbors().add(unaFarola);
	}
	/*
	* Retorna sus farolas vecinas
	*/
	public List<Farola> getNeighbors (){
		return this.vecinas;
	}
	/*
	* Si la farola no está encendida, la enciende y propaga la acción.
	*/
	public void turnOn() {
		if(this.isOff()) {
			this.setEstado(true);
			this.vecinas.stream().forEach(f -> f.setEstado(true));
		}
	}

	/*
	* Si la farola no está apagada, la apaga y propaga la acción.
	*/
	public void turnOff() {
		if(this.isOn()) {
			this.setEstado(false);
			this.vecinas.stream().forEach(f -> f.setEstado(false));
		}
	}
	/*
	* Retorna true si la farola está encendida.
	*/
	public boolean isOn() {
		return this.estado == true;
	}
	
	public boolean isOff() {
		return this.estado == false;
	}


}
