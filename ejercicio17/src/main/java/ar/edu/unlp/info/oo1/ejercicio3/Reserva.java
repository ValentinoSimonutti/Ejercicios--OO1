package ar.edu.unlp.info.oo1.ejercicio3;

public class Reserva {

	private DateLapse periodo;
	private Propiedad propiedad;
	private Usuario inquilino;
	
	public Reserva(Usuario u , Propiedad p, DateLapse periodo) {
		this.inquilino=u;
		this.propiedad=p;
		this.periodo=periodo;
		p.agregarReserva(this);
		u.agregarReserva(this);
	}
	
	public double precio() {
		return this.propiedad.getPrecioPorNoche() * periodo.sizeInDays();
	}

	public DateLapse getPeriodo() {
		return periodo;
	}

	public void setPeriodo(DateLapse periodo) {
		this.periodo = periodo;
	}

	public Propiedad getPropiedad() {
		return propiedad;
	}

	public void setPropiedad(Propiedad propiedad) {
		this.propiedad = propiedad;
	}

	public Usuario getInquilino() {
		return inquilino;
	}

	public void setInquilino(Usuario inquilino) {
		this.inquilino = inquilino;
	}
	
	public boolean cancelarReserva() {
	        // Verifica que la reserva exista y que el periodo no esté en curso
	        if (!this.getPeriodo().isInProgress()) {
	            inquilino.eliminarReserva(this);
	            propiedad.eliminarReserva(this);
	            return true;
	        }
	        return false;
	        
	    }
	
	
	
}
