package ar.edu.unlp.info.oo1.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona {

	private List<Pedido> pedidos;

	public Cliente(String nombre, String apellido, String direccion) {
		super(nombre, apellido, direccion);
		this.pedidos = new ArrayList<Pedido>();
	}
	
	public boolean crearPedido(Producto producto , FormaDeEnvio fde , MedioDePago mdp , int cantSolicitada ) {
		
		if(producto.tieneUnidades(cantSolicitada)) {
			producto.restarUnidades(cantSolicitada);
			pedidos.add( new Pedido(cantSolicitada, producto , mdp , fde, this));
			return true;
		}
		else return false;
		
	}
	
	public int pedidosPorCategoria(String unaCategoria) {
		
		return (int) this.pedidos.stream().filter(p -> p.esDeCategoria(unaCategoria)).count();
	
	}
	
	
	
	
}
