package ar.edu.unlp.info.oo1.ejercicio3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse implements DateLapseI {
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


}
