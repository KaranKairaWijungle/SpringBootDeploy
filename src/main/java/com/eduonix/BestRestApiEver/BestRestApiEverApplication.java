package com.eduonix.BestRestApiEver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class BestRestApiEverApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
		return application.sources(BestRestApiEverApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(BestRestApiEverApplication.class, args);
	}
}
