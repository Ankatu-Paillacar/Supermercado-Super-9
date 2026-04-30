package com.duoc.pagos.repository;

import com.duoc.pagos.model.Pago;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface PagoRepository extends JpaRepository<Pago, Long> {
    // No necesitas escribir métodos como "guardar" o "buscar", 
    // JpaRepository ya los trae incluidos (.save, .findAll, .findById)
}

