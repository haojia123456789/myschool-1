package cn.bdqn.quartz;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.scheduling.quartz.SimpleTriggerFactoryBean;

@Configuration
public class JobConfig {
	@Bean
	public JobDetailFactoryBean jobDetail() {
		JobDetailFactoryBean jobDetail = new JobDetailFactoryBean();
		jobDetail.setJobClass(MyJob.class);
		return jobDetail;
	}
	@Bean
	public SimpleTriggerFactoryBean  trigger(JobDetailFactoryBean jobDetail) {
		SimpleTriggerFactoryBean trigger = new SimpleTriggerFactoryBean();
		trigger.setJobDetail(jobDetail.getObject());
		//trigger.setRepeatCount(3);
		trigger.setRepeatInterval(2000);
		return trigger;
	}
	@Bean
	public SchedulerFactoryBean sheduler(SimpleTriggerFactoryBean trigger ) {
		SchedulerFactoryBean sc = new SchedulerFactoryBean();
		sc.setTriggers(trigger.getObject());
		return sc;
	}
}
