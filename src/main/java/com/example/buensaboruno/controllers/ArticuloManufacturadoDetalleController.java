package com.example.buensaboruno.controllers;

import com.example.buensaboruno.domain.entities.ArticuloManufacturadoDetalle;
import com.example.buensaboruno.services.IArticuloManufacturadoDetalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/articulo-manufacturado-detalle")
public class ArticuloManufacturadoDetalleController {
    @Autowired
    private IArticuloManufacturadoDetalleService articuloManufacturadoDetalleService;

    @PostMapping("/detalles")
    public ArticuloManufacturadoDetalle create(@RequestBody ArticuloManufacturadoDetalle articuloManufacturadoDetalle){
        return this.articuloManufacturadoDetalleService.create(articuloManufacturadoDetalle);
    }
}
