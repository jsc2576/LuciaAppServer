package com.hiruashi.simgyuseon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class SimAppServerApplication extends SpringBootServletInitializer{

	protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
		return application.sources(SimAppServerApplication.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(SimAppServerApplication.class, args);
	}
}
