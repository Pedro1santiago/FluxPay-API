package com.example.FluxPay.service;

import com.example.FluxPay.dto.ClientDTO;
import com.example.FluxPay.models.ClientStatus;
import com.example.FluxPay.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class ClientService {

    @Autowired
    ClientRepository repository;

    public Flux<ClientDTO> listActiveClients(){
        return repository.findActiveClients().map(ClientDTO::fromEntity);
    }
}
