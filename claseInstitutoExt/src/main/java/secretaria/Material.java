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
public class Material {

    //Atributos
    int id;
    String nombre;
    TipoMaterial tipo;
    
    public Material(){
        
    }
    
    public Material(int id, String nombre, TipoMaterial tipo){
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
    }
    
    public boolean equals(Material other){
        if(this.id == other.getId()){
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public String toString(){
        return "Material:\nIdentificador: " + id + "\nNombre: " + nombre + "\nTipo de Material: " + tipo + "\n}";
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
    
    public void setTipo(TipoMaterial tipo){
        this.tipo = tipo;
    }
    
    public TipoMaterial getTipo(){
        return tipo;
    }
}
