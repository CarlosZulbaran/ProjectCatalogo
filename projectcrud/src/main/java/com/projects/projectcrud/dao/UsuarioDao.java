package com.projects.projectcrud.dao;

import com.projects.projectcrud.entity.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDao extends JpaRepository <Usuario,Long>{
    Usuario finByUsername (String username);
}