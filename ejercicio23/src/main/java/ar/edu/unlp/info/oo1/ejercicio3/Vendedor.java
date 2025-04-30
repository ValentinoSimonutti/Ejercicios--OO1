package ar.edu.unlp.info.oo1.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Persona {

	private List<Producto> productos;

	public Vendedor(String nombre, String apellido ,String direccion) {
		super(nombre, apellido, direccion);
		this.productos = new ArrayList<Producto>();
	}
	
	public void agregarProducto(String nombre , String categoria , double precio , int cantUnidades) {
		Producto p = new Producto(nombre , categoria, precio , cantUnidades , this);
		this.productos.add(p);
	}
	
	public List<Producto> getProductos() {
		return productos;
	}
	
	
	
	
}
