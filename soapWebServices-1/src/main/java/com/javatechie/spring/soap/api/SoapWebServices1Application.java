package com.javatechie.spring.soap.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.javatechie.spring.soap.api.CelsuisToFahreinheit")
public class SoapWebServices1Application {

	public static void main(String[] args) {
		SpringApplication.run(SoapWebServices1Application.class, args);
		
	}

}
