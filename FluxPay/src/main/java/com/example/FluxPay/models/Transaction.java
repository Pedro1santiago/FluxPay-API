package com.example.FluxPay.models;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Entity(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long clientId;
    private Double amount;
    private TransactionType type;
    private String description;
    private LocalDateTime createdAt;

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public Long getClientId() {return clientId;}

    public void setClientId(Long clientId) {this.clientId = clientId;}

    public Double getAmount() {return amount;}

    public void setAmount(Double amount) {this.amount = amount;}

    public TransactionType getType() {return type;}

    public void setType(TransactionType type) {this.type = type;}

    public String getDescription() {return description;}

    public void setDescription(String description) {this.description = description;}

    public LocalDateTime getCreatedAt() {return createdAt;}

    public void setCreatedAt(LocalDateTime createdAt) {this.createdAt = createdAt;}
}