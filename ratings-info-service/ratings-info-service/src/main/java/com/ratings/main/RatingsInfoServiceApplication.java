package com.ratings.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan("com.ratings")
public class RatingsInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RatingsInfoServiceApplication.class, args);
	}

}
