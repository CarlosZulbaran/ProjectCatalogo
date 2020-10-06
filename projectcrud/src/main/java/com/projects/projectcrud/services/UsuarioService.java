package com.projects.projectcrud.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.projects.projectcrud.dao.UsuarioDao;
import com.projects.projectcrud.entity.Rol;
import com.projects.projectcrud.entity.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthoritiesContainer;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service("userDetailsService")
public class UsuarioService implements UserDetailsService {

@Autowired
private UsuarioDao usuarioDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario= usuarioDao.finByUsername(username);
        if(usuario== null){
            throw new UsernameNotFoundException(username);
        }
        ArrayList<GrantedAuthority> roles = new ArrayList<GrantedAuthority>();
            for(Rol rol: usuario.getRoles()){
                roles.add(new SimpleGrantedAuthority(rol.getNombre()))
            }
        return new User(usuario.getUsername(), usuario.getPassword(),roles);
    }


}