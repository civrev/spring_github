package com.cwatts.swapi;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ServiceWithApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceWithApiApplication.class, args);
	}

}
