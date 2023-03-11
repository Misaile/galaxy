package com.psigx.galaxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class GalaxyApplication {

	public static void main(String[] args) {
		GalaxyInitializer.initialize();
		SpringApplication.run(GalaxyApplication.class, args);
	}

}
