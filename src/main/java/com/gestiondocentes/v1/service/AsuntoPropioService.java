package com.gestiondocentes.v1.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiondocentes.v1.model.AsuntoPropio;
import com.gestiondocentes.v1.model.Docente;
import com.gestiondocentes.v1.repository.AsuntoPropioRepository;
import com.gestiondocentes.v1.repository.DocenteRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AsuntoPropioService {

    @Autowired
    private AsuntoPropioRepository asuntoPropioRepository;

    @Autowired
    private DocenteRepository docenteRepository;

    public List<AsuntoPropio> listarTodosAsuntosPropios(){

        return asuntoPropioRepository.findAll();
    }

    public List<AsuntoPropio> listarAsuntosPropiosPorDocente(Long idDocente){

        Docente docente = docenteRepository.findById(idDocente).orElseThrow(()-> new RuntimeException("Docente no encontrado."));
        
        return asuntoPropioRepository.findByDocente(docente);
    }

    public AsuntoPropio solicitarAsuntoPropio (Long idDocente, LocalDate diaAsunto, String descripcionAsunto){

        Docente docente = docenteRepository.findById(idDocente).orElseThrow(()-> new RuntimeException("Docente No Encontrado."));

        AsuntoPropio ap = new AsuntoPropio();
        ap.setDocente(docente);
        ap.setDiaSolicitadoAsuntoPropio(diaAsunto);
        ap.setDescripcionAsuntoPropio(descripcionAsunto);
        ap.setAprobadoAsuntoPropio(false);
        ap.setFechaTramitacionAsuntoPropio(null);

        return asuntoPropioRepository.save(ap);
    }

    public AsuntoPropio validarAsuntoPropio (Long idAsuntoPropio, boolean aprobado){
        AsuntoPropio ap = asuntoPropioRepository.findById(idAsuntoPropio).orElseThrow(()->new RuntimeException("Asunto Propio no encontrado"));

        ap.setAprobadoAsuntoPropio(aprobado);
        ap.setFechaTramitacionAsuntoPropio(LocalDateTime.now());

        return asuntoPropioRepository.save(ap);
    }

    public void borrarAsuntoPropio (Long id){

        asuntoPropioRepository.deleteById(id);
    }

}
