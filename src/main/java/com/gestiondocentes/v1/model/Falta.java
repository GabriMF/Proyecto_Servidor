package com.gestiondocentes.v1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor

@Entity
public class Falta {
    @Id
    private Long id;
    private LocalDate fecha;
    private String anotacion;
    private String material;

    @ManyToOne
    @JoinColumn(name = "id")
    private Horario horario;

    @ManyToOne
    @JoinColumn(name = "id")
    private Docente docente;
}
