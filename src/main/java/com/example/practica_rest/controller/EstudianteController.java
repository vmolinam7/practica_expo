/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.practica_rest.controller;

import com.example.practica_rest.entity.Estudiante;
import com.example.practica_rest.service.EstudianteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estudiantes")
@CrossOrigin(origins = "http://localhost:4200")
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteservice;
    
    @GetMapping
    public List<Estudiante> listar(){
        return estudianteservice.listar();
    }
    
    @PostMapping
    public Estudiante insertar (@RequestBody Estudiante est){
        return estudianteservice.insertar(est);
    }
    
    @PutMapping
    public Estudiante actualizar (@RequestBody Estudiante est){
        return estudianteservice.actualizar(est);
    }
    
    @DeleteMapping
    public void eliminar (@RequestBody Estudiante est){
        estudianteservice.eliminar(est);
    }
}
