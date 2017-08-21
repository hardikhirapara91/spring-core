package com.hardik.spring.quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.hardik.spring.scheduling.MyBean;

/**
 * Scheduled Job
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class ScheduledJob extends QuartzJobBean {

	private MyBean myBean;

	@Override
	protected void executeInternal(JobExecutionContext arg0) throws JobExecutionException {
		myBean.printMessage();
	}

	public void setMyBean(MyBean myBean) {
		this.myBean = myBean;
	}

}
