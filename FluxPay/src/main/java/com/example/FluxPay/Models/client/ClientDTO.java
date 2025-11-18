package com.example.FluxPay.Models.client;

public record ClientDTO( Long clientId, String nome, Integer cpf, Integer numero, String email, String senha) {
    public static ClientDTO toDto(Client client){
        return new ClientDTO(client.getClientID(), client.getNome(), client.getCpf(), client.getNumero(), client.getEmail(), client.getSenha());
    }

    public Client toEntity(){
        Client client = new Client();
        client.setClientID(this.clientId);
        client.setNome(this.nome);
        client.setCpf(this.cpf);
        client.setNumero(this.numero);
        client.setEmail(this.email);
        client.setSenha(this.senha);
        return client;
    }
}
