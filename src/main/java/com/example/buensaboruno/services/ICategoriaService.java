package com.example.buensaboruno.services;


import com.example.buensaboruno.domain.entities.Categoria;

import java.util.List;

public interface ICategoriaService {
    List<Categoria> getAll();
    Categoria getById(Long id);
    Categoria create(Categoria categoria);
    Categoria update(Long id, Categoria categoria);
    String delete(Long id);
}
