/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package secretaria;

import java.util.Date;

/**
 *
 * @author Neiroh
 */
public class SolicitudBeca {

    //Atributos
    int id;
    String nombre;
    String ap1;
    String ap2;
    String cuentaBancaria;
    String estadoCivil;
    Date fechaNac;
    boolean residePadres;
    
    public SolicitudBeca(){
        
    }
    
    public SolicitudBeca(int id, String nombre, String ap1, String ap2, String cuentaBancaria, String estadoCivil, Date fechaNac, boolean residePadres){
        this.id = id;
        this.nombre = nombre;
        this.ap1 = ap1;
        this.ap2 = ap2;
        this.cuentaBancaria = cuentaBancaria;
        this.estadoCivil = estadoCivil;
        this.fechaNac = fechaNac;
        this.residePadres = residePadres;
    }
    
    public boolean equals(SolicitudBeca other){
        if(this.id == other.getId()){
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public String toString(){
        return "Solicitud de Beca{\nIdentificador: " + id + "\nNombre: " + nombre + "\nApellidos: " + ap1 + " " + ap2 + "\nCuenta Bancaria: " + cuentaBancaria + "\n Estado Civil: " + estadoCivil + "\nFecha de Nacimiento: " + fechaNac + "\nReside con Padres: " + residePadres + "\n}";
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
    
    public void setAp1(String ap1){
        this.ap1 = ap1;
    }
    
    public String getAp1(){
        return ap1;
    }
    
    public void setAp2(String ap2){
        this.ap2 = ap2;
    }
    
    public String getAp2(){
        return ap2;
    }
    
    public void setCuentaBancaria(String cuentaBancaria){
        this.cuentaBancaria = cuentaBancaria;
    }
    
    public String getCuentaBancaria(){
        return cuentaBancaria;
    }
    
    public void setEstadoCivil(String estadoCivil){
        this.estadoCivil = estadoCivil;
    }
    
    public String getEstadoCivil(){
        return estadoCivil;
    }
    
    public void setFechaNac(Date fechaNac){
        this.fechaNac = fechaNac;
    }
    
    public Date getFechaNac(){
        return fechaNac;
    }
    
    public void setResidePadres(boolean residePadres){
        this.residePadres = residePadres;
    }
    
    public boolean getResidePadres(){
        return residePadres;
    }
}
