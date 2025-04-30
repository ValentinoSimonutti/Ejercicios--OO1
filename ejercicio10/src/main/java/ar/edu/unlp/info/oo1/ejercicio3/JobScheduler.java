package ar.edu.unlp.info.oo1.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class JobScheduler {
    protected List<JobDescription> jobs;
    protected Prioridad strategy;

    public JobScheduler (Prioridad unaP) {
        this.jobs = new ArrayList<>();
        this.strategy = unaP;
    }

    public void schedule(JobDescription job) {
        this.jobs.add(job);
    }

    public void unschedule(JobDescription job) {
        if (job != null) {
            this.jobs.remove(job);
        }
    }

    public Prioridad getStrategy() {
        return this.strategy; 
    }

    public List<JobDescription> getJobs(){
        return jobs;
    }

    public void setStrategy(Prioridad aStrategy) {
        this.strategy = aStrategy;
    }

    public JobDescription next() {
    	
    	if (this.jobs.isEmpty()) {
            return null;
        }
    	
        JobDescription nextJob = strategy.resolver(this.jobs);
        this.unschedule(nextJob);
        return nextJob;
    }

}
