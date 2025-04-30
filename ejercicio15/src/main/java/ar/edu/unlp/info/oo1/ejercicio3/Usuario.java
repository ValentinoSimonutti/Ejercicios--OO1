package ar.edu.unlp.info.oo1.ejercicio3;

import java.time.LocalDate;
import java.util.List;

public class Usuario {

	private String nombre;
	private String domicilio;
	private List<Consumo> consumos;
	
	public Usuario(String nombre, String domicilio, List<Consumo> consumos) {
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.consumos = consumos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public Consumo getUltimo() {
		return consumos.get(consumos.size()-1);
	}
	
	public Factura emitirFactura(CuadroTarifario c) {
    	
		double bonificacion = calcularBonificacion(c.getPrecioKwh());
		double montofinal = calcularMontoFinal(c.getPrecioKwh(), bonificacion);		
        Factura f = new Factura(this, LocalDate.now(), bonificacion , montofinal);
        return f;
        
    }
    
    private double calcularMontoFinal(double kwh, double bonificacion) {
    	Consumo c = this.getUltimo();
		double costo = c.calcularConsumo(kwh);
		return costo * (1 - bonificacion); 
		
    	
    }
    
    private double calcularBonificacion(double kwh) {
		
    	Consumo c = this.getUltimo();
    	if (c.calcularFpe() > 0.8) {
    		return 0.10;
    	}
    	else {
    		return 0.0;
    	}
    	
    }
	
}
