
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raul
 */
public class Estudio {
    
    //Atributos
    int id;
    String nombre;
    Materia[] materias;
    
    public Estudio(){
        
    }
    
    public Estudio(int id, String nombre, Materia[] materias){
        this.id = id;
        this.nombre = nombre;
        this.materias = materias;
    }
    
    public boolean equals(Estudio otro){
        if(this.id == otro.getId()){
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public String toString(){
       return "Estudio{" + "\nIdentificador: " + id + "\nNombre: " + nombre + "\nMaterias: " + Arrays.toString(materias) + "\n}"; 
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Materia[] getMaterias() {
        return materias;
    }

    public void setMaterias(Materia[] materias) {
        this.materias = materias;
    }
    
}
