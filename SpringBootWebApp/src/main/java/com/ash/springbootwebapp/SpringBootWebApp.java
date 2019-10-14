package com.ash.springbootwebappsample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;

import javax.annotation.PreDestroy;

@SpringBootApplication
@EnableAutoConfiguration(
        exclude = {
                org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration.class})
public class SpringBootWebApp extends SpringBootServletInitializer {

	final static Logger logger = LoggerFactory.getLogger(SpringBootWebApp.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebApp.class, args);
    }
	
    @PreDestroy
    public void shutdownProc() {
		//TODO implement process before application shutdown
        logger.info("shutdown!!");
    }
}
