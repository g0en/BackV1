package com.example.buensaboruno.services;

import com.example.buensaboruno.domain.entities.ArticuloInsumo;

import java.util.List;

public interface IArticuloInsumoService {
    List<ArticuloInsumo> search(String denominacion);
    List<ArticuloInsumo> getAll();
}
