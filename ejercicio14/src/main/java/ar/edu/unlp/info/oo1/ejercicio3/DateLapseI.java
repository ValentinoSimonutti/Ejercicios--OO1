package ar.edu.unlp.info.oo1.ejercicio3;

import java.time.LocalDate;

public interface DateLapseI {
	
	public LocalDate getFrom();
	public LocalDate getTo();
	public int sizeInDays();
	public boolean includesDate(LocalDate other);


}
