package ar.edu.unlp.info.oo1.ejercicio3;

import java.util.List;

public class Lifo implements Prioridad{

	public JobDescription resolver(List<JobDescription> jobs){
		
		return jobs.get(jobs.size()-1);	
	}

}
