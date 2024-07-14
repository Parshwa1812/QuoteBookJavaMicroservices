package com.learning.sevice.FavouriteQuoteService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FavouriteQuoteServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FavouriteQuoteServiceApplication.class, args);
	}

}
