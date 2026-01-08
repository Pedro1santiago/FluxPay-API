package com.example.FluxPay.dto;


import com.example.FluxPay.models.Client;
import com.example.FluxPay.models.ClientStatus;

public record ClientDTO(Long id, String name, ClientStatus clientStatus) {

    public static ClientDTO fromDTO(Client dto){
        return new ClientDTO(dto.getClientId(), dto.getName(), dto.getStatus());
    }

    public Client fromEntity(){
        Client client = new Client();
        client.setClientId(this.id);
        client.setName(this.name);
        client.setStatus(this.clientStatus);
        return client;
    }
}
