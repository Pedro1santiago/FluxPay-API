package com.example.FluxPay.service;

import com.example.FluxPay.dto.ClientDTO;
import com.example.FluxPay.models.ClientStatus;
import com.example.FluxPay.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ClientService {

    @Autowired
    ClientRepository repository;

    public List<ClientDTO> listActiveClients(){
        return repository.findActiveClients().stream().map(ClientDTO::toDTO).toList();
    }
}
