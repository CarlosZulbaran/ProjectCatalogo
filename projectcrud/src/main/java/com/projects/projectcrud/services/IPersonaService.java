package com.projects.projectcrud.services;

import java.util.List;

import com.projects.projectcrud.dao.IPersonaDao;
import com.projects.projectcrud.entity.Producto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class IPersonaService implements PersonaService {

    @Autowired
   private IPersonaDao personaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Producto> listar() {
       
        return (List<Producto>) personaDao.findAll();
    }
    
    @Override
    @Transactional
    public void guardar(Producto producto) {
        personaDao.save(producto);

    }

    @Override
    @Transactional
    public void eliminar(Producto producto) {
      personaDao.delete(producto);

    }

    @Override
    @Transactional(readOnly= true)
    public Producto encontrarProducto(Producto producto) {
        
        return personaDao.findById(producto.getIdProducto()).orElse(null);
    }
    
}