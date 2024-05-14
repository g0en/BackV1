package com.example.buensaboruno.controllers;

import com.example.buensaboruno.domain.entities.ArticuloManufacturado;
import com.example.buensaboruno.services.IArticuloManufacturadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/articulo-manufacturado")
public class ArticuloManufacturadoController {
    @Autowired
    private IArticuloManufacturadoService articuloManufacturadoService;

    @PostMapping("/create")
    public ArticuloManufacturado create(@RequestBody ArticuloManufacturado articuloManufacturado){
        return this.articuloManufacturadoService.create(articuloManufacturado);
    }

    @GetMapping("/{id}")
    public ArticuloManufacturado getById(@PathVariable Long id){
        return this.articuloManufacturadoService.getById(id);
    }

    @GetMapping("/all")
    public List<ArticuloManufacturado> getAll(){
        return this.articuloManufacturadoService.getAll();
    }

    @PutMapping("/{id}")
    public ArticuloManufacturado update(@PathVariable Long id, @RequestBody ArticuloManufacturado articuloManufacturado){
        return this.articuloManufacturadoService.update(id, articuloManufacturado);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id){
        return this.articuloManufacturadoService.delete(id);
    }
}
