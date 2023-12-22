/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.practica_rest.service;

import com.example.practica_rest.entity.Estudiante;
import com.example.practica_rest.repo.Estudiante_Repo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudianteService {
    
    @Autowired
    private Estudiante_Repo estudiante_repo;
    
    public Estudiante insertar (Estudiante est){
        
        return estudiante_repo.save(est);
    }
    
    public Estudiante actualizar (Estudiante est){
        
        return estudiante_repo.save(est);
    }
    
    public List<Estudiante> listar (){
        
        return estudiante_repo.findAll();
    }
    
    public void eliminar (Estudiante est){
        
        estudiante_repo.delete(est);
    }
    
}
