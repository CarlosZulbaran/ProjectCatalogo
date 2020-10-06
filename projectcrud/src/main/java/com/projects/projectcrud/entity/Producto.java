package com.projects.projectcrud.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Value;

@Entity
@Table(name="productos")
public class Producto implements Serializable{
        private static final long serialVersonaUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long IdProducto;
    private String nombre;
    private int cantidad, precio;

    public Producto(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public long getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(long idProducto) {
        IdProducto = idProducto;
    }


   
    
}