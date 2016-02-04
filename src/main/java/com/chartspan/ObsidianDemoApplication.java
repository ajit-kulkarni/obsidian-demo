package com.chartspan;

import com.carfey.ops.job.di.SpringSchedulerStarter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class ObsidianDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ObsidianDemoApplication.class, args);
	}

	@Bean
	public SpringSchedulerStarter getSpringSchedulerStarter() {return new SpringSchedulerStarter();}
}
