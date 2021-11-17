package com.example.practicaspringrest3;

import ch.qos.logback.core.net.server.Client;
import com.example.practicaspringrest3.dtos.Cliente;
import com.example.practicaspringrest3.dtos.ComentatioDTO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class PracticaSpringRest3Application {

	public static void main(String[] args) {
		SpringApplication.run(PracticaSpringRest3Application.class, args);
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			ComentatioDTO comentario = restTemplate.getForObject("https://quoters.apps.pcfone.io/api/random", ComentatioDTO.class);
			//ResponseEntity<ComentatioDTO> quote = restTemplate.getForObject("https://quoters.apps.pcfone.io/api/random", ComentatioDTO.class);
			//if (quote.getStatusCode().is2xxSuccessful()){
			//	System.out.println(quote);
			//}
			System.out.println(comentario.toString());

			// Forma de pegarle a otro servicio
			Cliente cliente=new Cliente();
			cliente.setDni("11");
			cliente.setNombre("Eduardo");
			ResponseEntity<Cliente> clienteResponseEntity = restTemplate.postForEntity("http://localhost:8080/clientes",cliente,Cliente.class);
			System.out.println("Respuesta a peticion" + clienteResponseEntity);
		};
	}
}
