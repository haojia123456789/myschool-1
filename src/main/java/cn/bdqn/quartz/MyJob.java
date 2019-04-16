package cn.bdqn.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class MyJob implements Job {
	private Reminders reminders;
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		reminders=new Reminders();
		reminders.showMsg();
	}

}
