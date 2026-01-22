package com.example.FluxPay.controller;

import com.example.FluxPay.dto.ClientDTO;
import com.example.FluxPay.service.ClientService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/listActiveClients")
     public List<ClientDTO> listActiveClients(){
        return clientService.listActiveClients();
    }

    @GetMapping("/listAllClients")
    public List<ClientDTO> listAllClients(){
        return clientService.listAllClients();
    }

    @GetMapping("/{id}")
    public ClientDTO findClientById(@PathVariable Long id){
        return clientService.findClientById(id);
    }
}
