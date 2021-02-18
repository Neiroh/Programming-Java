
import java.util.Arrays;

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
    
    public Alumno(String nombre, String ap1, String ap2, int edad, int tlf, String dni, int exp, String correo, String nombrePadre, String nombreMadre, int tlfPadre, int tlfMadre, Direccion[] direcciones){
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
        this.direcciones = direcciones;
    }
    
    public boolean equals(Alumno otro){
        if(this.dni == otro.getDni()){
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public String toString(){
        return "Alumno{" + "\nNombre: " + nombre + "\nApellidos: " + ap1 + " " + ap2 + "\nEdad: " + edad + "\nTeléfono: " + tlf + "\nDni: " + dni + "\nNúmero de Expediente: " + exp + "\nCorreo: " + correo + "\nNombre del Padre: " + nombrePadre + "\nNombre de la Madre: " + nombreMadre + "\nTeléfono del Padre: " + tlfPadre + "\nTeléfono de la Madre: " + tlfMadre + "\nDirecciones: " + Arrays.toString(direcciones) + "\n}";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAp1() {
        return ap1;
    }

    public void setAp1(String ap1) {
        this.ap1 = ap1;
    }

    public String getAp2() {
        return ap2;
    }

    public void setAp2(String ap2) {
        this.ap2 = ap2;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTlf() {
        return tlf;
    }

    public void setTlf(int tlf) {
        this.tlf = tlf;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombrePadre() {
        return nombrePadre;
    }

    public void setNombrePadre(String nombrePadre) {
        this.nombrePadre = nombrePadre;
    }

    public String getNombreMadre() {
        return nombreMadre;
    }

    public void setNombreMadre(String nombreMadre) {
        this.nombreMadre = nombreMadre;
    }

    public int getTlfPadre() {
        return tlfPadre;
    }

    public void setTlfPadre(int tlfPadre) {
        this.tlfPadre = tlfPadre;
    }

    public int getTlfMadre() {
        return tlfMadre;
    }

    public void setTlfMadre(int tlfMadre) {
        this.tlfMadre = tlfMadre;
    }

    public Direccion[] getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(Direccion[] direcciones) {
        this.direcciones = direcciones;
    }
    
    
}
