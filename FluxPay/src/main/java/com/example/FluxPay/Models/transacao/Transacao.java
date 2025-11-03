package com.example.FluxPay.Models.transacao;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("Transacao")
public class Transacao {

    @Id
    private Long id;


    private Long clientID;
    private Long valor;
    private TipoTransacao tipoTransacao;
    private String descricao;

    public Long getId() {
        return id;
    }


    public Long getClientID() {
        return clientID;
    }

    public Long getValor() {
        return valor;
    }

    public void setValor(Long valor) {
        this.valor = valor;
    }

    public TipoTransacao getTipoTransacao() {
        return tipoTransacao;
    }

    public void setTipoTransacao(TipoTransacao tipoTransacao) {
        this.tipoTransacao = tipoTransacao;
    }

    public String getDescricao() {return descricao;}

    public void setDescricao(String descricao){ this.descricao = descricao;}
}