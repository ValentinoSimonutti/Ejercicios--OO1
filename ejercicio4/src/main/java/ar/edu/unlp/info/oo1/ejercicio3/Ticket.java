package ar.edu.unlp.info.oo1.ejercicio3;
import java.time.LocalDate;
import java.util.*;

public class Ticket implements TienenProductos {
	private LocalDate fecha;
	private int cantidadDeProductos;
	private double pesoTotal;
	private double precioTotal;
	private List<Producto> lista;
	
	public Ticket(LocalDate fecha, int cantidadDeProductos, double pesoTotal, double precioTotal, List<Producto> lista) {
		this.fecha = fecha;
		this.cantidadDeProductos = cantidadDeProductos;
		this.pesoTotal = pesoTotal;
		this.precioTotal = precioTotal;
		this.lista = lista;
	}
	
	public List<Producto> getProductos(){
		return this.lista;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}
	public void setCantidadDeProductos(int cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}
	public double getPesoTotal() {
		return pesoTotal;
	}
	public void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}
	public double getPrecioTotal() {
		return precioTotal;
	}
	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}
	
	public double impuesto() {
		return this.precioTotal * 0.21;
	}
	
	
}
