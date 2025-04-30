package ar.edu.unlp.info.oo1.ejercicio3;

import java.util.List;

public class MostEffort implements Prioridad{

	public JobDescription resolver(List<JobDescription> jobs){
		
		return jobs.stream()
				.max((j1,j2) -> Double.compare(j1.getEffort(), j2.getEffort()))
				.orElse(null);
	}
}

