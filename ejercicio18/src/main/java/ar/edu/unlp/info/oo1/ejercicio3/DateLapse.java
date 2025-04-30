package ar.edu.unlp.info.oo1.ejercicio3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse {
	private LocalDate from;
	private LocalDate to;
	
	
	public DateLapse(LocalDate from, LocalDate to) {
		this.from=from;
		this.to = to;
	}


	public LocalDate getFrom() {
		return this.from;
	}
	

	public LocalDate getTo() {
		return this.to;
	}

	public int sizeInDays() {
		int dias = (int) from.until(to, ChronoUnit.DAYS); 
		return dias;
	}

	public boolean includesDate(LocalDate other) {
		return other.isAfter(from) && other.isBefore(to) || (other.isEqual(from) || other.isEqual(to));
	}
	
	public boolean overlaps(DateLapse otro) {
		
		return !this.to.isBefore(otro.getFrom()) && !this.from.isAfter(otro.getTo());
		
	}
	
	public boolean isInProgress() {
        LocalDate today = LocalDate.now();
        return !today.isBefore(from) && !today.isAfter(to);
    }
	
	public int diasParaQueArranque() {
		
		if(LocalDate.now().isAfter(from)) {
			return 0;
		}
		else {
			return (int) ChronoUnit.DAYS.between(LocalDate.now(),from);
		}
	}


}
