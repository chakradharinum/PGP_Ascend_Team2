package com.product.mongo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import jakarta.servlet.annotation.WebFilter;


@SpringBootApplication
@EnableMongoRepositories
@ServletComponentScan
public class MdbProductSpringWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(MdbProductSpringWebApplication.class, args);
	}

}