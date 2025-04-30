package ar.edu.unlp.info.oo1.ejercicio3;

public class SeisCuotas implements MedioDePago{

	
	public double calcularPago(Producto producto) {
		
		return producto.getPrecio() * 1.20;
		
	}
}
