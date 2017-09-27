package com.tmattila;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/**
 * 
 * @author tapsa
 *
 */
@SpringBootApplication
public class App extends SpringBootServletInitializer {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Override
	protected final SpringApplicationBuilder 
		configure(final SpringApplicationBuilder builder) {
		
		return builder.sources(App.class);
	}
}
