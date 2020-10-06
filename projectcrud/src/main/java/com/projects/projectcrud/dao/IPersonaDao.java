package com.projects.projectcrud.dao;

import com.projects.projectcrud.entity.Producto;

import org.springframework.data.repository.CrudRepository;

public interface IPersonaDao extends CrudRepository<Producto,Long>{
    
}