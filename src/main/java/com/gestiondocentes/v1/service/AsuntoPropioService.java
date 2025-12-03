package com.gestiondocentes.v1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiondocentes.v1.model.AsuntoPropio;
import com.gestiondocentes.v1.repository.AsuntoPropioRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AsuntoPropioService {

    @Autowired
    private AsuntoPropioRepository asuntoPropioRepository;

    public List<AsuntoPropio> listarAsuntosPropios(){

        return asuntoPropioRepository.findAll();
    }

    public Optional<AsuntoPropio> buscarAsuntoPropioPorId(Long id){

        return asuntoPropioRepository.findById(id);
    }

    public AsuntoPropio guardarAsuntoPropio (AsuntoPropio asuntoPropio){

        return asuntoPropioRepository.save(asuntoPropio);
    }

    public void borrarAsuntoPropio (Long id){

        asuntoPropioRepository.deleteById(id);
    }

}
