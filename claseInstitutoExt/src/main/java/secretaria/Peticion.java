/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package secretaria;

import gestionGrupos.Profesor;
import java.util.Date;

/**
 *
 * @author Neiroh
 */
public class Peticion {

    //Atributos
    int id;
    Date fechaPeticion;
    boolean estadoPeticion;
    Profesor profesor;
    
    public Peticion(){
    
    }
    
    public Peticion(int id, Date FechaPeticion, boolean EstadoPeticion, Profesor profesor){
        this.id = id;
        this.fechaPeticion = fechaPeticion;
        this.estadoPeticion = estadoPeticion;
        this.profesor = profesor;
    }
    
    public boolean equals(Peticion other){
        if(this.id == other.getId()){
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public String toString(){
        return "Petición{\nIdentificador: " + id + "\nFecha de Petición: " + fechaPeticion + "\nEstado de la Petición: " + estadoPeticion + "\n Profesor: " + profesor + "\n}";
    }
    
    //Getters y Setters
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return id;
    }
    
    public void setFechaPeticion(Date fechaPeticion){
        this.fechaPeticion = fechaPeticion;
    }
    
    public Date getFechaPeticion(){
        return fechaPeticion;
    }
    
    public void setEstadoPeticion(boolean estadoPeticion){
        this.estadoPeticion = estadoPeticion;
    }
    
    public boolean getEstadoPeticion(){
        return estadoPeticion;
    }
    
    public void setProfesor(Profesor profesor){
        this.profesor = profesor;
    }
    
    public Profesor getProfesor(){
        return profesor;
    }
}
