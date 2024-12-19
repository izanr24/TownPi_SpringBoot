package com.TownPi.api.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.TownPi.api.dto.PuebloDto;
import com.google.gson.Gson;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/api/pueblos")
public class TownPiApiRestController {

    // Método GET para obtener la lista de pueblos (con filtrado)
    @GetMapping("/mostrar/{nombre}")
    public String getPueblos(@PathVariable String nombre){
        Gson gson = new Gson();
        PuebloDto puebloAMostrar= new PuebloDto();
        for (PuebloDto indice : pueblos) {
            if(indice.getNombre().equals(nombre)){
                puebloAMostrar= indice;
            }
        }
        return gson.toJson(puebloAMostrar);
    }
    @GetMapping("/mostrar")
        public String getCoches(){
        Gson gson = new Gson();
        return gson.toJson(pueblos);  
    }
    public List<PuebloDto> pueblos = new ArrayList<>();


    // Método POST para añadir un nuevo pueblo
    @PostMapping("/crear")
    public String añadirPueblo(@RequestBody PuebloDto pueblo) {
        Gson gson= new Gson();
        pueblos.add(pueblo);
        return gson.toJson(pueblo);
    }

    // Método PUT para actualizar un pueblo
    @PutMapping("actualizar/{id}")
    public String ActualizarCoche(@PathVariable int id, @RequestBody PuebloDto pueblo) {
        Gson gson = new Gson();
        for (PuebloDto indice : pueblos) {
            if(id==indice.getId()){
                indice=pueblo;
                break;
            }
        }
    
        return gson.toJson(pueblo);
    }

    // Método DELETE para eliminar un pueblo
    @DeleteMapping("borrar/{id}")
    public void BorrarCoche(@PathVariable int id){
        for (PuebloDto indice : pueblos) {
            if(id==indice.getId()){
                pueblos.remove(indice);  
            }
        }

    }
    // Método PATCH para actualizar parcialmente
    @PatchMapping("coches/{id}")
    public String ActualizarCocheParcial(@PathVariable int id, @RequestBody PuebloDto pueblo){
        Gson gson = new Gson();
        for (PuebloDto indice : pueblos) {
            if(id==indice.getId()){
                indice=pueblo;
                break;
            }
        }
    
        return gson.toJson(pueblo);
    }
}
