package ar.edu.unlp.info.oo1.ejercicio3;

public class CuentaCorriente extends Cuenta {

	private double descubierto;
	
	public CuentaCorriente(double descubierto , double saldo ) {
		super(saldo);
		this.descubierto=descubierto;
	}

	public double getDescubierto() {
		return descubierto;
	}

	protected boolean puedeExtraer(double monto) {
		return super.puedeExtraer(monto - this.getDescubierto());
	}	
	
	
}
