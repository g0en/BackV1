package com.example.buensaboruno.controllers;

import com.example.buensaboruno.domain.entities.Articulo;
import com.example.buensaboruno.services.IArticuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/articulo")
public class ArticuloController {
    @Autowired
    private IArticuloService articuloService;

    @GetMapping("{id}")
    public Articulo getById(@PathVariable Long id){
        return this.articuloService.getById(id);
    }
}
