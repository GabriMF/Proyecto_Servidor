package com.gestiondocentes.v1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.util.List;

import jakarta.persistence.Column;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor

@Entity
public class Docente {
    @Id
    private long id;
    private String nombre;
    private String apellidos;
    private String email;
    private String siglas;

    @OneToMany(mappedBy = "docente")
    private List<AsuntoPropio> asuntoPropios;

    @ManyToOne
    @JoinColumn(name="id")
    private Departamento departamento;

    @OneToMany(mappedBy = "docente")
    private List<Horario> horarios;

    @OneToMany(mappedBy = "docente")
    private List<Rol> rols;

    @OneToMany(mappedBy = "docente")
    private List<Falta> faltas;
}
