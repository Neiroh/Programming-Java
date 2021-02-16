/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raul
 */
public class Departamento {
    
    //Atributos
    int id;
    String nombre;
    
    public Departamento(){
        
    }
     
    public Departamento(int id, String nombre){
        this.id = id;
        this. nombre = nombre;
    }
    
    public boolean equals(Departamento otro){
        if(this.id == otro.getId()){
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public String toString(){
        return "Departamento{" + "Identificador: " + id + ", Nombre: " + nombre;
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
