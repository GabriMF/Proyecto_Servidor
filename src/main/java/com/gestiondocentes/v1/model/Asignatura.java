package com.gestiondocentes.v1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Column;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor

@Entity
public class Asignatura {
    @Id
    @GeneratedValue
    private Long idAsignatura;
    private String nombreAsignatura;
    private String siglasAsignatura;
    private int cursoAsignatura;

    @OneToMany(mappedBy = "asignatura")
    private List<Horario> horarios;

    @ManyToOne
    @JoinColumn(name = "idCiclo")
    private Ciclo ciclo;
}
