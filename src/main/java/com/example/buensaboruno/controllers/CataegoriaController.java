package com.example.buensaboruno.controllers;

import com.example.buensaboruno.domain.entities.Categoria;
import com.example.buensaboruno.services.ICategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CataegoriaController {
    @Autowired
    private ICategoriaService categoriaService;

    @GetMapping("/all")
    public List<Categoria> getAll(){
        return this.categoriaService.getAll();
    }

    @GetMapping("/{id}")
    public Categoria getById(@PathVariable Long id){
        return this.categoriaService.getById(id);
    }

    @PostMapping("/create")
    public Categoria create(@RequestBody Categoria categoria){
        return this.categoriaService.create(categoria);
    }

    @PutMapping("/{id}")
    public Categoria update(@PathVariable Long id, @RequestBody Categoria categoria){
        return this.categoriaService.update(id, categoria);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id){
        return this.categoriaService.delete(id);
    }
}