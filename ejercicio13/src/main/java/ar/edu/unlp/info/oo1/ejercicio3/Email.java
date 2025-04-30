package ar.edu.unlp.info.oo1.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Email {

	private String titulo;
	private String cuerpo;
	private List<Archivo> adjuntos;
	
	public Email(String titulo , String cuerpo) {
		this.adjuntos= new ArrayList<Archivo>();
		this.titulo=titulo;
		this.cuerpo=cuerpo;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getCuerpo() {
		return cuerpo;
	}

	public List<Archivo> adjuntos() {
		return adjuntos;
	}
	
	public void agregarAdjunto(Archivo a) {
		this.adjuntos.add(a);
	}
	
	public int tamaño(){
		return  this.titulo.length() +
			    this.cuerpo.length() +
				this.adjuntos.stream().mapToInt(arch -> arch.tamaño())
				.sum();
	}
	
	
	public boolean contiene(String texto) {

		return (titulo.contains(texto) || cuerpo.contains(texto)) && !texto.equals("");
	}
	
}
