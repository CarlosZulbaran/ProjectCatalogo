package com.projects.projectcrud.controller;

import java.util.ArrayList;
import java.util.List;

import com.projects.projectcrud.dao.IPersonaDao;
import com.projects.projectcrud.entity.Producto;
import com.projects.projectcrud.services.PersonaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.extern.slf4j.Slf4j;


@Controller
@Slf4j
public class ControllerProducto {
    
   // @Autowired
   @Autowired
 private  PersonaService personaService;
    
    @GetMapping("/")
    public String inicio(Model model){
       List<Producto> productos = personaService.listar();
       model.addAttribute("productos", productos);
        return "index";

    }
    @GetMapping("crear-producto")
    public String crearProducto(){
      return "crear-producto";
    }

    @PostMapping("/guardar")
    public String guardarProducto(Producto producto){
      personaService.guardar(producto);
      return "redirect:/";
    }

    @GetMapping("/editar/{idProducto}")
    public String editarProducto(Producto producto,Model model){
      producto = personaService.encontrarProducto(producto);
      model.addAttribute("producto", producto);
    return "editar-producto";
    }

    @GetMapping("/eliminar/{idProducto}")
    public String eliminarProducto (Producto producto){
      personaService.eliminar(producto);
      return "redirect:/";
    }


}