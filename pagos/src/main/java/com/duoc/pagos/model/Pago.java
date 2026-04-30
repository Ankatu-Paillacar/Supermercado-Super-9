package com.duoc.pagos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "PAGO")


public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PAGO")

    private Long idPago;
    private Integer rut;
    private String dv;
    private String nombre;
    private String apellido;
    private String direccion;
    private String email;
    private int telefono;
    private String ciudad;
    @Column(name = "CODIGOPOSTAL")
    private String codigoPostal;
    private String pais;
    private String region;
    private String comuna;
}
