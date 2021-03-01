/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 *
 * @author profesor
 */
public class Forma {
    
    public String nombre;
    public int a;
    
    public Forma(){
        
    }
    
    public Forma(String nombre, int a){
        //this.nombre = nombre;
        this.nombre = "forma .. ";
        this.a = a;
    }
    
    public Forma(int a){
        this.a = a;
    }

    @Override
    public String toString() {
        return "Forma{" + "nombre=" + nombre + '}';
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void calcularArea(){
        System.out.println("Aquí no calculo nada");
    }
    
    
}
