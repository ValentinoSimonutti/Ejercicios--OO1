package ar.edu.unlp.info.oo1.ejercicio3;

public class CajaDeAhorro extends Cuenta{

	public CajaDeAhorro(double saldo) {
		super(saldo);
	}
    
    public void depositar(double monto) {
        super.depositar(monto * 0.98);
    }
    
    public boolean extraer(double monto) {
        return super.extraer(monto * 1.02);
    } 
      
}
