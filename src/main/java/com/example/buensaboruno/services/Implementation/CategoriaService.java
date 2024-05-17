package com.example.buensaboruno.services.Implementation;

import com.example.buensaboruno.domain.entities.Categoria;
import com.example.buensaboruno.repositories.CategoriaRepository;
import com.example.buensaboruno.services.ICategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService implements ICategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public List<Categoria> getAll() {
        return this.categoriaRepository.findAll();
    }

    @Override
    public Categoria getById(Long id) {
        return this.categoriaRepository.findById(id).get();
    }

    @Override
    public Categoria create(Categoria categoria) {
        return this.categoriaRepository.save(categoria);
    }

    @Override
    public Categoria update(Long id, Categoria categoria) {
        Categoria categoriaAux = categoria;
        categoriaAux.setId(id);
        return this.categoriaRepository.save(categoriaAux);
    }

    @Override
    public String delete(Long id) {
        try{
            this.categoriaRepository.deleteById(id);
            return "Se elimino la categoria: " + id;
        }catch (Exception e){
            return "Error al eliminar la categoria " + id + " ".concat(e.getMessage());
        }
    }
}
