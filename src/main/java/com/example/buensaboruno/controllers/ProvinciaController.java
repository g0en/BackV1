package com.example.buensaboruno.controllers;

import com.example.buensaboruno.domain.entities.Provincia;
import com.example.buensaboruno.services.IProvinciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/provincia")
public class ProvinciaController {
    @Autowired
    IProvinciaService provinciaService;

    @GetMapping("/all")
    public List<Provincia> getAll(){
        return this.provinciaService.getAll();
    }
}
