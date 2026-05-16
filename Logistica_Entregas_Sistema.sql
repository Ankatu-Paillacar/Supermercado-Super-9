CREATE DATABASE db_delivery;
USE db_delivery;

CREATE TABLE delivery(
    id_delivery BIGINT AUTO_INCREMENT PRIMARY KEY,
    pedido_id BIGINT NOT NULL,                    
    repartidor_id BIGINT DEFAULT NULL,            
    estado VARCHAR(15) NOT NULL DEFAULT 'PENDIENTE',
    direccion_origen VARCHAR(50) NOT NULL,        
    direccion_destino VARCHAR(50) NOT NULL        
);