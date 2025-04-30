package ar.edu.unlp.info.oo1.ejercicio3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CuentaTest {

	private Cuenta cuenta1;
	private Cuenta cuenta2;
	
	@BeforeEach
	void setUp() throws Exception{
		cuenta1 = new CajaDeAhorro(100.00);
		cuenta2 = new CuentaCorriente(100.00 , 100.00);

	}
	
	@Test
	void testDepositar() {
		cuenta1.depositar(100.00);
		assertEquals(cuenta1.getSaldo(),198.00);
		
		cuenta2.depositar(100.00);
		assertEquals(cuenta2.getSaldo(), 200.00);
	}
	
	@Test
	void testExtraer() {
		cuenta1.extraer(98.00);
		assertEquals(cuenta1.getSaldo(), 100 - (98 * 1.02));
		
		cuenta2.depositar(100.00);
		cuenta2.extraer(100.00);
		assertEquals(cuenta2.getSaldo(), 100.00);
	}
	
	@Test
	void testTransferir() {
		
		cuenta1.transferirACuenta(50.00, cuenta1);
		double saldoDesp = (100.00 - (50.00 * 1.02));
		saldoDesp = saldoDesp + 50.00 * 0.98;
		assertEquals(cuenta1.getSaldo(),saldoDesp );
		
		
		cuenta2.transferirACuenta(100.00, cuenta2);
		assertEquals(cuenta2.getSaldo() , 100.00);
		

	}
	
	@Test
	void testTransferirEntreCuentas() {
		
		cuenta1.transferirACuenta(50.00, cuenta2);
		double saldoDesp = (100.00 - (50.00 * 1.02));
		assertEquals(cuenta1.getSaldo(),saldoDesp );
		assertEquals(cuenta2.getSaldo() , 150);
		
		cuenta2.transferirACuenta(200.00, cuenta1);
		assertEquals(cuenta1.getSaldo() , saldoDesp + 200.00 * 0.98);
		assertEquals(cuenta2.getSaldo() , -50.00);
		

	}
	
	
	
	
}
