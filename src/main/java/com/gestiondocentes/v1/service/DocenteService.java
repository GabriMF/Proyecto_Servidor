package com.gestiondocentes.v1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiondocentes.v1.model.Docente;
import com.gestiondocentes.v1.repository.DocenteRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DocenteService {

    @Autowired
    private DocenteRepository docenteRepository;

    private List<Docente> listarDocentes(){

        return docenteRepository.findAll();
    }

    public Optional <Docente> buscarDocentePorId(Long id){
        return docenteRepository.findById(id);
    }

    public Docente guardarDocente(Docente docente){
        return docenteRepository.save(docente);
    }

    public void borrarDocente(Long id){
        docenteRepository.deleteById(id);
    }

}
