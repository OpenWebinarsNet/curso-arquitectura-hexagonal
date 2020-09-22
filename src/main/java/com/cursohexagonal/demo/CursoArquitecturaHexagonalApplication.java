package com.cursohexagonal.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication(scanBasePackages = {"com.cursohexagonal.demo"})
public class CursoArquitecturaHexagonalApplication {

	public static void main(String[] args) {
		SpringApplication.run(CursoArquitecturaHexagonalApplication.class, args);
	}

}
