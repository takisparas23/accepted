package com.accepted.accepted;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Match API", version = "v1", description = "API for managing matches and odds"))
public class AcceptedApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcceptedApplication.class, args);
	}

}
