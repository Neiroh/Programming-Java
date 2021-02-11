/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neiroh
 */
public class Alumno {

    //Atributos
    String nombre;
    String ap1;
    String ap2;
    int edad;
    int tlf;
    String dni;
    int exp;
    String correo;
    String nombrePadre;
    String nombreMadre;
    int tlfPadre;
    int tlfMadre;
    Direccion[] direcciones;
    
    public Alumno(){
        
    }
    
    public Alumno(String nombre, String ap1, String ap2, int edad, int tlf, String dni, int exp, String correo, String nombrePadre, String nombreMadre, int tlfPadre, int tlfMadre){
        this.nombre = nombre;
        this.ap1 = ap1;
        this.ap2 = ap2;
        this.edad = edad;
        this.tlf = tlf;
        this.dni = dni;
        this.exp = exp;
        this.correo = correo;
        this.nombrePadre = nombrePadre;
        this.nombreMadre = nombreMadre;
        this.tlfPadre = tlfPadre;
        this.tlfMadre = tlfMadre;
    }
    
    @Override
    public String toString(){
        return "Alumno{" + "Nombre: " + nombre + ", Apellidos: " + ap1 + ap2 + ", Edad: " + edad + ", Teléfono: " + tlf + ", Dni: " + dni + ", Número de Expediente: " + exp + ", Correo: " + correo + ", Nombre del Padre: " + nombrePadre + ", Nombre de la Madre: " + nombreMadre + ", Teléfono del Padre: " + tlfPadre + ", Teléfono de la Madre: " + tlfMadre + ", Direcciones: " +direcciones;
    }
}
