package com.projects.projectcrud.services;

import java.util.List;

import com.projects.projectcrud.entity.Producto;

import org.springframework.stereotype.Service;

public interface PersonaService {
    public List<Producto>listar();
    public void guardar(Producto producto);
    public void eliminar(Producto producto);
    public Producto encontrarProducto (Producto producto);
}