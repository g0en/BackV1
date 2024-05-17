package com.example.buensaboruno.services.Implementation;

import com.example.buensaboruno.domain.entities.ArticuloManufacturadoDetalle;
import com.example.buensaboruno.repositories.ArticuloManufacturadoDetalleRepository;
import com.example.buensaboruno.services.IArticuloManufacturadoDetalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticuloManufacturadoDetalleService implements IArticuloManufacturadoDetalleService {
    @Autowired
    private ArticuloManufacturadoDetalleRepository articuloManufacturadoDetalleRepository;
    @Override
    public ArticuloManufacturadoDetalle create(ArticuloManufacturadoDetalle articuloManufacturadoDetalle) {
        return this.articuloManufacturadoDetalleRepository.save(articuloManufacturadoDetalle);
    }
}
