package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class Proy2MicroserviceZuulGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(Proy2MicroserviceZuulGatewayApplication.class, args);
	}

}
