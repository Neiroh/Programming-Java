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
public class PeticionMaterial {

    //Atributos
    Peticion peticion;
    Material material;
    int cantidad;
    
    public PeticionMaterial(){
        
    }
    
    public PeticionMaterial(Peticion peticion, Material material, int cantidad){
        this.peticion = peticion;
        this.material = material;
        this.cantidad = cantidad;
    }
    
    public boolean equals(PeticionMaterial other){
        if(this.peticion.getId() == other.getPeticion().getId()){
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public String toString(){
        return "Peticion de Material:\nPeticion: " + peticion + "\nMaterial: " + material + "\nCantidad: " + cantidad + "\n}";
    }
    
    //Getters and Setters
    public void setPeticion(Peticion peticion){
        this.peticion = peticion;
    }
    
    public Peticion getPeticion(){
        return peticion;
    }
    
    public void setMaterial(Material material){
        this.material = material;
    }
    
    public Material getMaterial(){
        return material;
    }
    
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    
    public int getCantidad(){
        return cantidad;
    }
}
