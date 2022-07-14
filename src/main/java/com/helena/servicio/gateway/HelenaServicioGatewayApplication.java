package com.helena.servicio.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class HelenaServicioGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelenaServicioGatewayApplication.class, args);
	}

}
