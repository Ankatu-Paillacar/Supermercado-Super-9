CREATE DATABASE db_lealtad;
USE db_lealtad;

CREATE TABLE lealtad(
    id_lealtad BIGINT AUTO_INCREMENT PRIMARY KEY,
    usuario_id BIGINT NOT NULL,
    puntos_acumulados INT NOT NULL DEFAULT 0,
    nivel_cliente VARCHAR(20) DEFAULT 'BRONCE',
    ultima_compra_id BIGINT DEFAULT NULL
);