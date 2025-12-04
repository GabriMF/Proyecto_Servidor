package com.gestiondocentes.v1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestiondocentes.v1.model.AsuntoPropio;
import com.gestiondocentes.v1.model.Docente;

public interface AsuntoPropioRepository extends JpaRepository<AsuntoPropio, Long>{

    List<AsuntoPropio> findByDocente(Docente docente);
}
