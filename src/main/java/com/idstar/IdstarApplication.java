package com.idstar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class IdstarApplication {

	public static void main(String[] args) {
		SpringApplication.run(IdstarApplication.class, args);
	}

}
