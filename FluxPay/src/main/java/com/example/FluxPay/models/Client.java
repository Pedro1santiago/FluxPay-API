package com.example.FluxPay.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("client")
public class Client {

    @Id
    private Long Id;

    private String name;

    private String apiKey;

    private ClientStatus status;

    public Long getClientId(){return Id;}
    public void setClientId(Long Id){this.Id = Id;}

    public String getName(){return name;}
    public void setName(String name){this.name = name;}

    public String getApiKey(){return apiKey;}
    public void setApiKey(String apiKey){this.apiKey = apiKey;}

    public ClientStatus getStatus() {return status;}
    public void setStatus(ClientStatus status) {this.status = status;}
}
