package com.gestiondocentes.v1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor

@Entity
public class Docente {

    @Id
    @GeneratedValue
    private Long idDocente;
    private String nombreDocente;
    private String apellidosDocente;
    private String emailDocente;
    private String siglasDocente;

    @OneToMany(mappedBy = "docente")
    private List<AsuntoPropio> asuntoPropios;

    @ManyToOne
    @JoinColumn(name="idDepartamento")
    private Departamento departamento;

    @OneToMany(mappedBy = "docente")
    private List<Horario> horarios;

    @OneToMany(mappedBy = "docente")
    private List<Rol> rols;

    @OneToMany(mappedBy = "docente")
    private List<Falta> faltas;
}
