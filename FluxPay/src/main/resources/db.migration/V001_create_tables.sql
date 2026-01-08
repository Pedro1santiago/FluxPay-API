CREATE TABLE transacao (
    id BIGSERIAL PRIMARY KEY,
    client_id BIGINT NOT NULL,
    valor NUMERIC(15,2) NOT NULL,
    tipo_transacao VARCHAR(50) NOT NULL,
    descricao TEXT,
    data_transacao TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,

    CONSTRAINT fk_transacao_cliente
        FOREIGN KEY (client_id)
        REFERENCES cliente(id)
        ON DELETE RESTRICT
        ON UPDATE CASCADE
);