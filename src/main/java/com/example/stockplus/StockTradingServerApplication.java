package com.example.stockplus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class StockTradingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockTradingServerApplication.class, args);
	}

}
