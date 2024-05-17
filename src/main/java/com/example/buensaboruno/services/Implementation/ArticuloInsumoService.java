package com.example.buensaboruno.services.Implementation;

import com.example.buensaboruno.domain.entities.ArticuloInsumo;
import com.example.buensaboruno.repositories.ArticuloInsumoRepository;
import com.example.buensaboruno.services.IArticuloInsumoService;
import com.example.buensaboruno.services.IArticuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticuloInsumoService implements IArticuloInsumoService {
    @Autowired
    private ArticuloInsumoRepository articuloInsumoRepository;
    @Override
    public List<ArticuloInsumo> search(String denominacion) {
        return articuloInsumoRepository.findByDenominacionContainingIgnoreCaseAndEsParaElaborarTrue(denominacion);
    }

    @Override
    public List<ArticuloInsumo> getAll() {
        return this.articuloInsumoRepository.findAll();
    }
}
