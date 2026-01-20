package com.example.FluxPay.service;

import com.example.FluxPay.dto.ClientDTO;
import com.example.FluxPay.models.Client;
import com.example.FluxPay.models.ClientStatus;
import com.example.FluxPay.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ClientService {

    @Autowired
    private final ClientRepository repository;

    public ClientService(ClientRepository repository) {
        this.repository = repository;
    }

    public List<ClientDTO> listActiveClients(){
        return repository.findActiveClients().stream().map(ClientDTO::toDTO).toList();
    }

    public List<ClientDTO> listAllClients() {
        return repository.findAllClients().stream().map(ClientDTO::toDTO).toList();
    }

    public ClientDTO findClientById(Long id){
         Client client = repository.findById(id).orElseThrow(() -> new RuntimeException("Cliente não encontrado"));

         return ClientDTO.toDTO(client);
    }
}
