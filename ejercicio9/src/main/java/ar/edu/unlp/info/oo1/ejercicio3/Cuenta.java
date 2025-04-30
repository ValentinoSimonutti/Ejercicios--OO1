package ar.edu.unlp.info.oo1.ejercicio3;

public abstract class Cuenta {
    protected double saldo;

    // Constructor
    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    // Obtener el saldo actual
    public double getSaldo() {
        return this.saldo;
    }

    // Depositar un monto en la cuenta
    public void depositar(double monto) {
        this.saldo += monto;
    }

    // Método protegido para extraer sin control (uso interno)
    protected void extraerSinControlar(double monto) {
        this.saldo -= monto;
    }

    // Método para extraer un monto, se debe controlar si es posible
    public boolean extraer(double monto) {
        if (this.puedeExtraer(monto)) {
            this.extraerSinControlar(monto);
            return true;
        }
        return false;
    }

    // Método para transferir a otra cuenta
    public boolean transferirACuenta(double monto, Cuenta cuentaDestino) {
        if (this.extraer(monto)) {
            cuentaDestino.depositar(monto);
            return true;
        }
        return false;
    }

    // Método abstracto que debe implementarse en las subclases
    protected boolean puedeExtraer(double monto) {
    	return this.getSaldo() >= monto;
    }
}
