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
import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor

@Entity
public class AsuntoPropio {

    @Id
    @GeneratedValue
    private Long idAsuntoPropio;
    private LocalDate diaSolicitadoAsuntoPropio;
    private String descripcionAsuntoPropio;
    private LocalDateTime fechaTramitacionAsuntoPropio;
    private boolean aprobadoAsuntoPropio;

    @ManyToOne
    @JoinColumn(name = "idDocente")
    private Docente docente;

}
