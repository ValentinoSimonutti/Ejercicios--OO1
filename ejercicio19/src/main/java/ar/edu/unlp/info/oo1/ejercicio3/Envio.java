package ar.edu.unlp.info.oo1.ejercicio3;

import java.time.LocalDate;

public abstract class Envio {
	
	private LocalDate despacho;
	private String origen;
	private String destino;
	private double peso;

	public Envio(LocalDate despacho, String origen, String destino, double peso) {
		this.despacho = despacho;
		this.origen = origen;
		this.destino = destino;
		this.peso = peso;
	}
	
	public LocalDate getDespacho() {
		return despacho;
	}
	public void setDespacho(LocalDate despacho) {
		this.despacho = despacho;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public abstract double calcular();
	
}
