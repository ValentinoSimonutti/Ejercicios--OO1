package ar.edu.unlp.info.oo1.ejercicio3;

public class Pedido {
	
	private int cantidadSolicitada;
	private Producto producto;
	private MedioDePago medioDePago;
	private FormaDeEnvio formaDeEnvio;
	private Cliente cliente;
	
	public Pedido(int cantidadSolicitada, Producto producto, MedioDePago medioDePago, FormaDeEnvio formaDeEnvio, Cliente cli) {
		this.cantidadSolicitada = cantidadSolicitada;
		this.producto = producto;
		this.medioDePago = medioDePago;
		this.formaDeEnvio = formaDeEnvio;
		this.cliente = cli;
	}
	
	public boolean esDeCategoria(String unaCategoria) {
	
		return this.producto.esDeCategoria(unaCategoria);
	
	}
	
	public double calcularTotal() {
		
		return this.medioDePago.calcularPago(this.producto) + this.formaDeEnvio.calcularEnvio(this.producto , this.cliente);
	}
	
	
	
	

	

}
