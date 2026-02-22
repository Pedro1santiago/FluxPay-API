package com.example.FluxPay.dto;


import com.example.FluxPay.models.Client;
import com.example.FluxPay.models.ClientStatus;

public record ClientDTO(Long id, String name, ClientStatus clientStatus) {

    public static ClientDTO toDTO(Client dto){
        return new ClientDTO(dto.getClientId(), dto.getName(), dto.getStatus());
    }


}
