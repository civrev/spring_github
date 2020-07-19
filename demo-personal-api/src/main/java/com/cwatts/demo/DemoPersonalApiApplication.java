package com.cwatts.demo;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cwatts.demo.repository.ProjectRepository;

@SpringBootApplication
public class DemoPersonalApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoPersonalApiApplication.class, args);
	}

}
