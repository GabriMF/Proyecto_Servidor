package com.gestiondocentes.v1.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocentes.v1.model.AsuntoPropio;
import com.gestiondocentes.v1.service.AsuntoPropioService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("api/asuntoPropio")
@RequiredArgsConstructor
public class AsuntoPropioController {

    @Autowired
    private AsuntoPropioService asuntoPropioService;

    @GetMapping
    public List<AsuntoPropio> listarTodosAsuntosPropios(){

        return asuntoPropioService.listarTodosAsuntosPropios();
    }

    @GetMapping("/docente/{idDocente}")
    public List<AsuntoPropio> listarAsuntosPropiosPorDocente(@PathVariable Long idDocente){
        return asuntoPropioService.listarAsuntosPropiosPorDocente(idDocente);
    }

    @PostMapping("/solicitar/{idDocente}")
    public AsuntoPropio solicitarAsuntoPropio(@PathVariable Long idDocente, @RequestParam LocalDate diaAsunto, @RequestParam String descripcionAsunto){
        return asuntoPropioService.solicitarAsuntoPropio(idDocente, diaAsunto, descripcionAsunto);
    }
    
    @PutMapping("/validar/{idAsuntoPropio}")
    public AsuntoPropio validarAsuntoPropio(@PathVariable Long idAsuntoPropio, @RequestParam boolean aprobado){
        return asuntoPropioService.validarAsuntoPropio(idAsuntoPropio, aprobado);
    }
    
}
