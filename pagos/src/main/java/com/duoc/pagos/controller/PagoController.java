package com.duoc.pagos.controller;

import com.duoc.pagos.model.Pago;
import com.duoc.pagos.repository.PagoRepository;
import com.duoc.pagos.service.PagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/pagos")
public class PagoController {
    
    @Autowired
    private PagoService PagoService;

    @GetMapping
    public List<Pago> listaPagos() {
        return PagoService.getPagos();
    }

    @PostMapping
    public Pago agregarPago(@RequestBody Pago pago) {
        return PagoService.savePago(pago);
    }

    @GetMapping("{id}")
    public Pago buscarPago(@PathVariable Long id_Pago){
        return PagoService.getPagoId(id_Pago);
    }

    @PutMapping("{id}")
    public Pago actualizPago(@PathVariable Long id_Pago, @RequestBody Pago pago){
        return PagoService.updatePago(pago);
    }

    @DeleteMapping("{id}")
    public String eliminarPago(@PathVariable Long id_Pago) {
        return PagoService.deletePago(id_Pago);
    }


    @GetMapping("/total")
    public int totalPagosV2() {
        return PagoService.totalPagosV2();
    }

    @Autowired
    private PagoRepository pagoRepository;

    @GetMapping("/test")
    public String testInsert() {
        Pago p = new Pago();
        p.setNombre("pepe");
        p.setApellido("manuel");
        p.setDireccion("las nose 145");
        p.setEmail("Aaroniero@duocuc.cl");
        p.setTelefono(123455);
        p.setCiudad("valparaiso");
        p.setCodigoPostal("asasdas12");
        p.setComuna("valparaiso");
        p.setIdPago("dfsr2");
        p.setRut(12345678);
        p.setDv("K");
        // ... setea los campos que quieras
        
        pagoRepository.save(p); // Aquí se hace el INSERT en Oracle Cloud
        return "¡Insert realizado con éxito!";
    }
}
listaPagos.add(new Pago(434175L ,123456789, "k","Torune"
 , "Hagakure", "Alvarez 123", "torunehagakure@gmail.cl", 12345678, "Valparaiso", "2345678", "chile" , "valparaiso", "comuna1"));