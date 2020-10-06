package com.projects.projectcrud.entity;

import java.io.Serializable;

import javax.persistence.*;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="rol")
public class Rol implements Serializable{
    private static final long serialVersionUID =1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idRol;

    @NotEmpty
    private String nombre;

    public long getIdRol() {
        return idRol;
    }

    public void setIdRol(long idRol) {
        this.idRol = idRol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

}