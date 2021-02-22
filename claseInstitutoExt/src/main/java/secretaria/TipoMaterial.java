/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package secretaria;

/**
 *
 * @author Neiroh
 */
public class TipoMaterial {

    //Atributos
    int id;
    String nombre;
    
    public TipoMaterial(){
        
    }
    
    public TipoMaterial(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }
    
    public boolean equals(TipoMaterial other){
        if(this.id == other.getId()){
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public String toString(){
        return "TipoMaterial{\nIdentificador: " + id + "\nNombre: " + nombre + "\n}";
    }
    
    //Getters and Setters
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return id;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
}
