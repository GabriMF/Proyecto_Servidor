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
public class Departamento {
    
    @Id
    @GeneratedValue
    private Long idDepartamento;
    private String nombreDepartamento;
    private String codigoDepartamento;
    private String telefonoDepartamento;

    @OneToMany(mappedBy = "departamento")
    private List<Docente> docentes;
}
