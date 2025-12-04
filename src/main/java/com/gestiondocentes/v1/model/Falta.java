package com.gestiondocentes.v1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
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
    @GeneratedValue
    private Long idFalta;
    private LocalDate fechaFalta;
    private String anotacionFalta;
    private String materialFalta;

    @ManyToOne
    @JoinColumn(name = "idHorario")
    private Horario horario;

    @ManyToOne
    @JoinColumn(name = "idDocente")
    private Docente docente;
}
