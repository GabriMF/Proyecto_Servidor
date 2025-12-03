package com.gestiondocentes.v1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiondocentes.v1.repository.AsignaturaRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AsignaturaService {

    @Autowired
    private AsignaturaRepository asignaturaRepository;
    
}
