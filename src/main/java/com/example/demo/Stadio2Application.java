package com.example.demo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories("com.example.repository")
@EntityScan("com.example.entity")
public class Stadio2Application {

	public static void main(String[] args) {
		SpringApplication.run(Stadio2Application.class, args);


		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();


		entityManager.close();
		entityManagerFactory.close();

	}

}
