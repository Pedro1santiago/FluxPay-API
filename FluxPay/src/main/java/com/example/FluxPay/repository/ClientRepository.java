package com.example.FluxPay.repository;

import com.example.FluxPay.models.Client;
import com.example.FluxPay.models.ClientStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface ClientRepository extends JpaRepository<Client, Long> {

    @Query("SELECT * FROM clients WHERE clientStatus = 'ATIVO'")
    List<Client> findActiveClients();

    @Query("SELECT * FROM clients")
    List<Client> findAllClients();
}
