package com.gestiondocentes.v1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestiondocentes.v1.model.Docente;

public interface DocenteRepository extends JpaRepository<Docente, Long> {

}
