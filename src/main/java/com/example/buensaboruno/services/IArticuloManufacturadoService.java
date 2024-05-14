package com.example.buensaboruno.services;

import com.example.buensaboruno.domain.entities.ArticuloManufacturado;
import com.example.buensaboruno.domain.entities.ArticuloManufacturadoDetalle;

import java.util.List;

public interface IArticuloManufacturadoService {
    ArticuloManufacturado create(ArticuloManufacturado articuloManufacturado);
    ArticuloManufacturado getById(Long id);
    List<ArticuloManufacturado> getAll();
    ArticuloManufacturado update(Long id, ArticuloManufacturado articuloManufacturado);
    String delete(Long id);
}
