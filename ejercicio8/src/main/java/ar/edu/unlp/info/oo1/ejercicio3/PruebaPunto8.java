package ar.edu.unlp.info.oo1.ejercicio3;

public class PruebaPunto8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente alan = new Gerente("Alan Turing");
		double aportesDeAlan = alan.aportes();
		
		Gerente alan2 = new Gerente("Alan Turing");
		double sueldoBasicoDeAlan = alan.sueldoBasico();

		System.out.println(aportesDeAlan);
		System.out.println(sueldoBasicoDeAlan);
		
	}

}
