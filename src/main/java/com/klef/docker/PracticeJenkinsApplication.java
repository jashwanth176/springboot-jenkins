package com.klef.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class PracticeJenkinsApplication extends SpringBootServletInitializer{
	
	
	//SpringBootServletInitializer
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(PracticeJenkinsApplication.class);
    }
	
	public static void main(String[] args) {
		SpringApplication.run(PracticeJenkinsApplication.class, args);
	}

}
