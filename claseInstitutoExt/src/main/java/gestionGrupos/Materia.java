package gestionGrupos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raul
 */
public class Materia {
    
    //Atributos
    int id;
    String nombre;
    
    public Materia(){
        
    }
    
    public Materia(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }
    
    public boolean equals(Materia other){
        if(this.id == other.getId()){
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public String toString(){
        return "Materia{" + "\nIdentificador: " + id + "\nNombre: " + nombre + "\n}";
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
    
    
}
