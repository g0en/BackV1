package com.example.buensaboruno.services.Implementation;

import com.example.buensaboruno.domain.entities.Articulo;
import com.example.buensaboruno.repositories.ArticuloRepository;
import com.example.buensaboruno.services.IArticuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticuloService implements IArticuloService {
    @Autowired
    private ArticuloRepository articuloRepository;

    @Override
    public Articulo getById(Long id) {
        return this.articuloRepository.findById(id).get();
    }
}
