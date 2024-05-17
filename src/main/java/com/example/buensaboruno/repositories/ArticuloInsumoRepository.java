package com.example.buensaboruno.repositories;

import com.example.buensaboruno.domain.entities.ArticuloInsumo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticuloInsumoRepository extends BaseRepository<ArticuloInsumo,Long> {
    List<ArticuloInsumo> findByDenominacionContainingIgnoreCaseAndEsParaElaborarTrue(String denominacion);
}
