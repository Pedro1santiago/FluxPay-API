package com.example.FluxPay.Repository;


import com.example.FluxPay.Models.transacao.Transacao;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransacaoRepository extends ReactiveCrudRepository<Transacao, Long> {
}
