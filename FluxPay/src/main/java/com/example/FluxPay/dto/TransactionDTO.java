package com.example.FluxPay.dto;

import com.example.FluxPay.models.Transaction;
import com.example.FluxPay.models.TransactionType;

import java.time.LocalDateTime;

public record TransactionDTO(
        Long id,
        Long clientId,
        Double amount,
        TransactionType type,
        String description,
        LocalDateTime createdAt
) {

    public static TransactionDTO toDto(Transaction transaction) {
        return new TransactionDTO(
                transaction.getId(),
                transaction.getClientId(),
                transaction.getAmount(),
                transaction.getType(),
                transaction.getDescription(),
                transaction.getCreatedAt()
        );
    }

}
