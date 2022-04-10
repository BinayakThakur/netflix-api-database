package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/*
	The program implements a JPA and a Entity Manager
	Steps
	1) It connects to a database named needledb
	2) It implements a repo named according to entity
	3) It configure a EntityManager according entity
	**********************************************
	4) It uses and isolated search algorithm where we define a table,field and search items
	5) Two different post endpoints are visible
	6) /search_and params are table,array of fields, array of items and do a and query according to items
	7) /search_or params are table,array of fields, array of items and do a and query according to items

 */
@EnableJpaRepositories
@SpringBootApplication
public class NeedleApplication {

	public static void main(String[] args) {
		SpringApplication.run(NeedleApplication.class, args);
	}

}
