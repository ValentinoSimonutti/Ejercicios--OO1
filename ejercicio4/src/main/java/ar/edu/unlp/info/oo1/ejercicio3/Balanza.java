package ar.edu.unlp.info.oo1.ejercicio3;
import java.time.LocalDate;
import java.util.*;

public class Balanza implements TienenProductos {
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	public List<Producto> lista;
	
	public Balanza() {
		this.cantidadDeProductos=0;
		this.precioTotal=0;
		this.pesoTotal=0;
		this.lista = new LinkedList<Producto>();
	}
	
	public List<Producto> getProductos(){
		return this.lista;
	}
	
	public void ponerEnCero() {
		this.cantidadDeProductos=0;
		this.precioTotal=0;
		this.pesoTotal=0;
		this.lista.clear();
	}
	
	public void agregarProducto(Producto producto) {
		this.cantidadDeProductos++;
		this.pesoTotal = this.pesoTotal + producto.getPeso();
		this.precioTotal = this.precioTotal + (producto.getPrecioPorKilo() * producto.getPeso());
	}
	
	public Ticket emitirTicket() {
		Ticket t = new Ticket(LocalDate.now(), this.cantidadDeProductos , this.pesoTotal, this.precioTotal, this.lista);
		return t;
	}

	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public void setCantidadDeProductos(int cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}

	public double getPesoTotal() {
		return pesoTotal;
	}

	public void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}
	
	
}
