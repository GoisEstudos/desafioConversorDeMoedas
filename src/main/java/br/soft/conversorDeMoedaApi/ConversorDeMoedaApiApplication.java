package br.soft.conversorDeMoedaApi;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@OpenAPIDefinition(servers = {@Server(url = "/", description = "Default Server")})
@SpringBootApplication
public class ConversorDeMoedaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConversorDeMoedaApiApplication.class, args);
	}

}
