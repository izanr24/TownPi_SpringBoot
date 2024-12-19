
package com.TownPi.api.dto;

import java.util.ArrayList;
import java.util.List;

public class PuebloDto {
    private String nombre, descripcion, categorias, localidad, nombreProvincia;
    private int id, idProvincia;
    private static int n=0;


    

    public PuebloDto(String nombre, String descripcion, String categorias, String localidad, String nombreProvincia,
            int idProvincia) {
        n++;
        id=n;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categorias = categorias;
        this.localidad = localidad;
        this.nombreProvincia = nombreProvincia;
        this.idProvincia = idProvincia;
    }

    public PuebloDto() {

    }
    
    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public String getCategorias() {
        return categorias;
    }
    public String getLocalidad() {
        return localidad;
    }
    public String getNombreProvincia() {
        return nombreProvincia;
    }
    public int getId() {
        return id;
    }
    public int getIdProvincia() {
        return idProvincia;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setCategorias(String categorias) {
        this.categorias = categorias;
    }
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    public void setNombreProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setIdProvincia(int idProvincia) {
        this.idProvincia = idProvincia;
    }

    
    
    
}
