package com.duoc.pagos.service;

import com.duoc.pagos.model.Pago;
import com.duoc.pagos.repository.PagoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PagoService {
    @Autowired
    private PagoRepository pagoRepository;

    public List<Pago> getPagos(){
        return pagoRepository.obtenerPagos();
    }

    public Pago savePago(Pago pago){
        return pagoRepository.guardar(pago);
    }

    public Pago getPagoId(Long id){
        return pagoRepository.buscarPorId(id);
    }

    public Pago updatePago(Pago pago){
        return pagoRepository.actualizarPago(pago);
    }

    public String deletePago(Long id){
        pagoRepository.eliminar(id);
        return "pago eliminado";
    }

    public int totalPagos() {
        return pagoRepository.obtenerPagos().size();
    }

    public int totalPagosV2() {
        return pagoRepository.totalPagos();
    }



}
