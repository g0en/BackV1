package com.example.buensaboruno.services.Implementation;

import com.example.buensaboruno.domain.entities.ArticuloManufacturado;
import com.example.buensaboruno.domain.entities.ArticuloManufacturadoDetalle;
import com.example.buensaboruno.repositories.ArticuloManufacturadoRepository;
import com.example.buensaboruno.services.IArticuloManufacturadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticuloManufacturadoService implements IArticuloManufacturadoService {
    @Autowired
    private ArticuloManufacturadoRepository articuloManufacturadoRepository;

    @Override
    public ArticuloManufacturado create(ArticuloManufacturado articuloManufacturado) {
        this.articuloManufacturadoRepository.save(articuloManufacturado);
        Long id = this.articuloManufacturadoRepository.findUltimoArticuloManufacturadoId();
        return this.articuloManufacturadoRepository.findById(id).get();
    }

    @Override
    public ArticuloManufacturado getById(Long id) {
        return this.articuloManufacturadoRepository.findById(id).get();
    }

    @Override
    public List<ArticuloManufacturado> getAll() {
        return this.articuloManufacturadoRepository.findAll();
    }

    @Override
    public ArticuloManufacturado update(Long id, ArticuloManufacturado articuloManufacturado) {
        ArticuloManufacturado articuloManufacturadoAux = this.articuloManufacturadoRepository.findById(id).get();
        articuloManufacturado.setId(articuloManufacturadoAux.getId());
        return this.articuloManufacturadoRepository.save(articuloManufacturado);
    }

    @Override
    public String delete(Long id) {
        try{
            this.articuloManufacturadoRepository.deleteById(id);
            return "El articulo se elimino correctamente";
        }catch (Exception e) {
            return "Error al eliminar el articulo: ".concat(e.getMessage());
        }
    }
}
