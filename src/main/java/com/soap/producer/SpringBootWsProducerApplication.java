package com.soap.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.soap.producer.repository")
@SpringBootApplication
public class SpringBootWsProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWsProducerApplication.class, args);
	}

}
