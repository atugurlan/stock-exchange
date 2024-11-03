package com.example.stockExchangeBackend;

import com.example.stockExchangeBackend.client.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class StockExchangeBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockExchangeBackendApplication.class, args);
	}
}
