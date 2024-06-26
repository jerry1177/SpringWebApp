package com.maldonadopublisher.petclinicweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.maldonadopublisher.petclinicdata.model.Vet;

@SpringBootApplication
public class SpringwebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringwebappApplication.class, args);

		Vet vet = new Vet("Jerry", "Maldonado");
		System.out.println(vet);
		
	}

}
