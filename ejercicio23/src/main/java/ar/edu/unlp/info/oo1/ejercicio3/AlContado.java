package ar.edu.unlp.info.oo1.ejercicio3;

public class AlContado implements MedioDePago {

	
	public double calcularPago(Producto producto) {
		return producto.getPrecio();
	}
}
