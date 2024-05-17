package com.example.buensaboruno.controllers;

import com.example.buensaboruno.domain.entities.ArticuloInsumo;
import com.example.buensaboruno.services.IArticuloInsumoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/articulo-insumo")
public class ArticuloInsumoController {
    @Autowired
    private IArticuloInsumoService articuloInsumoService;

    @GetMapping("/search")
    public List<ArticuloInsumo> search(@RequestParam String denominacion){
        return this.articuloInsumoService.search(denominacion);
    }

    @GetMapping("/all")
    public List<ArticuloInsumo> getAll(){
        return this.articuloInsumoService.getAll();
    }
}
