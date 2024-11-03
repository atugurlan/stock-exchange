package com.example.stockExchangeBackend.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<Client> getClients(){
       return clientRepository.findAll();
    }

    public void addNewClient(Client client) {
        clientRepository.save(client);
    }
}
