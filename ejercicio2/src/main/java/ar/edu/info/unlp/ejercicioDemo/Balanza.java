package ar.edu.info.unlp.ejercicioDemo;
import java.time.LocalDate;

public class Balanza {
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	
	public Balanza() {
		this.cantidadDeProductos=0;
		this.precioTotal=0;
		this.pesoTotal=0;
	}
	
	public void ponerEnCero() {
		this.cantidadDeProductos=0;
		this.precioTotal=0;
		this.pesoTotal=0;
	}
	
	public void agregarProducto(Producto producto) {
		this.cantidadDeProductos++;
		this.pesoTotal = this.pesoTotal + producto.getPeso();
		this.precioTotal = this.precioTotal + (producto.getPrecioPorKilo() * producto.getPeso());
	}
	
	public Ticket emitirTicket() {
		Ticket t = new Ticket(LocalDate.now(), this.cantidadDeProductos , this.pesoTotal, this.precioTotal);
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
