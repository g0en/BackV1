package com.example.buensaboruno.services.Implementation;

import com.example.buensaboruno.domain.entities.Provincia;
import com.example.buensaboruno.repositories.ProvinciaRepository;
import com.example.buensaboruno.services.IProvinciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinciaService implements IProvinciaService {
    @Autowired
    ProvinciaRepository provinciaRepository;

    @Override
    public List<Provincia> getAll() {
        return this.provinciaRepository.findAll();
    }
}
