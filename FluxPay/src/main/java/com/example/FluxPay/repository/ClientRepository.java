package com.example.FluxPay.repository;

import com.example.FluxPay.models.Client;
import com.example.FluxPay.models.ClientStatus;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface ClientRepository extends ReactiveCrudRepository<Client, Long> {

    @Query("SELECT * FROM clients WHERE clientStatus = 'ATIVO'")
    Flux<Client> findActiveClients();
}
