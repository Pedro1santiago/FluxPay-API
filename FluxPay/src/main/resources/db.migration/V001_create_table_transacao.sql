CREATE TABLE transacao (
    id BIGSERIAL PRIMARY KEY,
    client_id BIGINT NOT NULL,
    valor BIGINT NOT NULL,
    tipo_transacao VARCHAR(50) NOT NULL,
    descricao TEXT,
    data_transacao TIMESTAMP,

    CONSTRAINT fk_transacao_cliente
        FOREIGN KEY (client_id)
        REFERENCES cliente(id)
);
