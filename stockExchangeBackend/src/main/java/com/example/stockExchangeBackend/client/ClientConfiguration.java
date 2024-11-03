package com.example.stockExchangeBackend.client;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ClientConfiguration {

    @Bean
    CommandLineRunner commandLineRunner(ClientRepository clientRepository) {
        return args -> {
           Client Client1 =  new Client(
                   "Mihai",
                   500
            );

            Client Client2 =  new Client(
                    "Tudor",
                    502
            );

            clientRepository.saveAll(
                    List.of(Client1, Client2)
            );
        };
    }
}
