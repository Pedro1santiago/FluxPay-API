package com.example.FluxPay.controller;

import com.example.FluxPay.dto.ClientDTO;
import com.example.FluxPay.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@Controller("/clients")
public class Client {

    @Autowired
    ClientService clientService;

    @GetMapping("/listActiveClients")
    List<ClientDTO> listActiveClients(){
        return clientService.listActiveClients();
    }
}
