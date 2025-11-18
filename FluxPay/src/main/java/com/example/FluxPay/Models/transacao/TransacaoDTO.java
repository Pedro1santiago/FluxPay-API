package com.example.FluxPay.Models.transacao;

import java.time.LocalDateTime;

public record TransacaoDTO(Long id, Long clientId, Long valor, TipoTransacao tipoTransacao, String descricao, LocalDateTime dataTransacao) {

    public static TransacaoDTO toDto(Transacao transacao){
        return new TransacaoDTO(transacao.getId(), transacao.getClientId(), transacao.getValor(), transacao.getTipoTransacao(), transacao.getDescricao(), transacao.getDataTransacao());
    }

    public Transacao toEntity(){
        Transacao transacao = new Transacao();
        transacao.setId(this.id);
        transacao.setClientId(this.clientId);
        transacao.setValor(this.valor);
        transacao.setTipoTransacao(this.tipoTransacao);
        transacao.setDescricao(this.descricao);
        transacao.setDataTransacao(this.dataTransacao);
        return transacao;
    }
}
