package com.udemy.primeiroprojetospringbatch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class PrimeiroProjetoSpringBatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeiroProjetoSpringBatchApplication.class, args);
	}

}
