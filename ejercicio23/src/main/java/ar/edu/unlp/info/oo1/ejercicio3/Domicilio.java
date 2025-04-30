package ar.edu.unlp.info.oo1.ejercicio3;

public class Domicilio implements FormaDeEnvio{
	
	public double calcularEnvio(Producto p , Cliente cliente) {
		
		CalculadoraDeDistancia calc = new CalculadoraDeDistancia();
		return calc.distanciaEntre(p.getVendedor().getDireccion(), cliente.getDireccion()) * 0.5;
		
	}

}
