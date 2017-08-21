package com.hardik.spring.config;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

import com.hardik.spring.scheduling.MyBean;

/**
 * This is the updated Configuration class with thread-pooling included
 * 
 * @author HARDIK HIRAPARA
 *
 */
@Configuration
@EnableScheduling
public class AppConfigWithThreadPooling implements SchedulingConfigurer {

	@Bean
	public MyBean bean() {
		return new MyBean();
	}

	@Override
	public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
		taskRegistrar.setScheduler(taskExecutor());
	}

	@Bean(destroyMethod = "shutdown")
	public Executor taskExecutor() {
		return Executors.newScheduledThreadPool(10);
	}
}
