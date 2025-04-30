package ar.edu.unlp.info.oo1.ejercicio3;


public class PoliticaModerada implements Politica{

	public double cancelacion(Reserva r) {
		
		int diasRestantes= r.getPeriodo().diasParaQueArranque();
		
		if (diasRestantes >= 7) {
			return r.precio();
		}
		else  if (diasRestantes >= 2){
			return r.precio() * 0.50;
		}
		else {
			return 0.0;
		}
		
	}
}
