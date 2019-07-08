package gss.scheduler;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RunScheduler {

  @Autowired
  private JobLauncher jobLauncher;

  @Autowired
  private Job job;
  private String csvName = "231";

  public void run() {

    try {
    	
    	System.out.println("Inicio job del cliente : " + csvName);
    	JobParameters jobParameters = new JobParametersBuilder().addString("csvName", "231").toJobParameters();
		JobExecution execution = jobLauncher.run(job, jobParameters);
		System.out.println("Exit Status : " + execution.getStatus());
		System.out.println("Finalizacion job del cliente : " + csvName);

    } catch (Exception e) {
	e.printStackTrace();
    }

  }
}
