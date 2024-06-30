package com.maldonadopublisher.petclinicweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.maldonadopublisher.petclinicdata.model.Vet;

@ComponentScan({"com.maldonadopublisher.petclinicweb", "com.maldonadopublisher.petclinicdata" })
@SpringBootApplication
public class SpringwebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringwebappApplication.class, args);

		Vet vet = new Vet("Jerry", "Maldonado");
		System.out.println(vet);
	}
}
