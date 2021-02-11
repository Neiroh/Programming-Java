/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raul
 */
public class Profesor {
    
    //Atributos
    int id;
    String dni;
    String nombre;
    String ap1;
    String ap2;
    String departamento;
    
    public Profesor(){
        
    }
    
    public Profesor(int id, String dni, String nombre, String ap1, String ap2, String departamento){
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.ap1 = ap1;
        this.ap2 = ap2;
        this.departamento = departamento;
    }
    
    public String toString(){
        return "profesor{" +  +
    }
}
