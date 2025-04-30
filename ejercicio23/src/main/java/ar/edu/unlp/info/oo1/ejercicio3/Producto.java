package ar.edu.unlp.info.oo1.ejercicio3;

public class Producto {
	
	private String nombre;
	private String categoria;
	private double precio;
	private int cantidadUnidades;
	private Vendedor vendedor;
	
	public Producto(String nombre, String categoria, double precio, int cantidadUnidades , Vendedor vendedor) {
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.cantidadUnidades = cantidadUnidades;
		this.vendedor = vendedor;
	}
	
	public boolean tieneUnidades(int cantidad) {
			
		return this.cantidadUnidades >= cantidad;
	
	}
	
	public void restarUnidades(int cantidad) {
		
		this.cantidadUnidades= this.cantidadUnidades- cantidad;
	}
	
	public boolean esDeCategoria(String categoria) {
		return this.categoria.equals(categoria);
	}

	public double getPrecio() {
		return precio;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}
	
	public int getCantidadDeUnidades() {
		return this.cantidadUnidades;
	}
	
	
	
	
	

}
