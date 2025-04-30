package ar.edu.unlp.info.oo1.ejercicio3;

import java.util.Date;

public class Mamifero {
	
	private String identificador;
	private String especie;
	private Date fechaNacimiento;
	private Mamifero padre;
	private Mamifero madre;
	
	public Mamifero (String id) {
		this.identificador = id; 
	}
	
	public Mamifero () { 
	}
	
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Mamifero getPadre() {
		return padre;
	}
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	public Mamifero getMadre() {
		return madre;
	}
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	
	public Mamifero getAbueloMaterno() {
		if(this.getMadre() != null) {
			if(this.getMadre().getPadre() != null) {
				return this.getMadre().getPadre();
			}
		}
		return null;
	}
	
	public Mamifero getAbuelaMaterna() {
		if(this.getMadre() != null) {
			if(this.getMadre().getMadre() != null) {
				return this.getMadre().getMadre();				
			}
		}
		return null;
	}
	
	public Mamifero getAbueloPaterno() {
		if(this.getPadre() != null) {
			if (this.getPadre().getPadre() != null) {
				return this.getPadre().getPadre();				
			}
		}
		return null;
	}
	
	public Mamifero getAbuelaPaterna() {
		if(this.getPadre()!= null) {
			if(this.getPadre().getMadre() != null) {
				return this.getPadre().getMadre();				
			}
		}
		return null;
	}
	
	/*
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		
		boolean ok =false;
		
	    if ((this.getPadre() != null && this.getPadre().equals(unMamifero)) || 
	    	(this.getMadre() != null && this.getMadre().equals(unMamifero))) {
	    		return true;
	    }
	    
	    if (this.getPadre() != null) {
	    	ok = this.getPadre().tieneComoAncestroA(unMamifero);
	    }
	    
	    if (this.getMadre() != null && ok ==false)  {
	    	ok = this.getMadre().tieneComoAncestroA(unMamifero);
	    }
	 
	    return ok;   

	}*/
	
	public boolean tieneComoAncestroA(Mamifero unma) {
		return !this.equals(unma) && 
		(this.getPadre()!=null && this.getPadre().aux(unma)) ||
		(this.getMadre()!= null && this.getMadre().aux(unma));
	}
	
	private boolean aux (Mamifero unma) {
		return  this.equals(unma)
				|| (this.getPadre()!=null && this.getPadre().aux(unma)) 
				|| this.getMadre()!=null && this.getMadre().aux(unma);
	}
}
