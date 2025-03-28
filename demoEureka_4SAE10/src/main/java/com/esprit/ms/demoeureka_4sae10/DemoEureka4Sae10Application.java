package com.esprit.ms.demoeureka_4sae10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DemoEureka4Sae10Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoEureka4Sae10Application.class, args);
	}

}
