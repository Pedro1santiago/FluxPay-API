package com.example.FluxPay.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

@Entity(name = "clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String apiKey;

    private ClientStatus status;

    public Long getClientId(){return id;}
    public void setClientId(Long id){this.id = id;}

    public String getName(){return name;}
    public void setName(String name){this.name = name;}

    public String getApiKey(){return apiKey;}
    public void setApiKey(String apiKey){this.apiKey = apiKey;}

    public ClientStatus getStatus() {return status;}
    public void setStatus(ClientStatus status) {this.status = status;}
}
