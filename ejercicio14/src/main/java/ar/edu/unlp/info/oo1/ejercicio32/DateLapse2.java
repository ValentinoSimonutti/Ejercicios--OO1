package ar.edu.unlp.info.oo1.ejercicio32;

import java.time.LocalDate;

import ar.edu.unlp.info.oo1.ejercicio3.DateLapseI;

public class DateLapse2 implements DateLapseI {
	private LocalDate from;
	private int sizeInDays;
	
	public DateLapse2(LocalDate from, int sizeInDays) {
		this.from=from;
		this.sizeInDays = sizeInDays;
	}
	
	public LocalDate getFrom() {
		return this.from;
	}
	
	public LocalDate getTo() {
		return this.from.plusDays(sizeInDays);
	}
	
	public int sizeInDays() {
		return this.sizeInDays;
	}
	
	public boolean includesDate(LocalDate other) {
		LocalDate to = this.getTo();
		return other.isAfter(from) && other.isBefore(to) || (other.isEqual(from) || other.isEqual(to));
	}
	
}
