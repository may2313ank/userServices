package com.mayank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class UserServicesApplication extends SpringBootServletInitializer {

	/*
	 * @Autowired public RestTemplate template;
	 */

	public static void main(String[] args) {
		SpringApplication.run(UserServicesApplication.class, args);
	}


	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(UserServicesApplication.class);
	}
}
