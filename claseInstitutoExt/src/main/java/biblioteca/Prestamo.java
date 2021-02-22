/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package biblioteca;

import gestionGrupos.Alumno;
import java.util.Date;

/**
 *
 * @author Neiroh
 */
public class Prestamo {

    //Atributos
    Libro libro;
    Alumno alumno;
    Date fechaPres;
    Date fechaEnt;
    
    public Prestamo(){
        
    }
    
    public Prestamo(Libro libro, Alumno alumno, Date fechaPres, Date fechaEnt){
        this.libro = libro;
        this.alumno = alumno;
        this.fechaPres = fechaPres;
        this.fechaEnt = fechaEnt;
    }
    
    public boolean equals(Prestamo other){
        if(libro.getIsbn() == other.getLibro().getIsbn()){
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public String toString(){
        return "Préstamo{\nlibro: " + libro + "\nAlumno: " + alumno + "\nFecha de Préstamo: " + fechaPres + "\nFecha de Entrega: " + fechaEnt + "\n}";
    }
    
    //Getters and Setters
    public void setLibro(Libro libro){
        this.libro = libro;
    }
    
    public Libro getLibro(){
        return libro;
    }
    
    public void setAlumno(Alumno alumno){
        this.alumno = alumno;
    }
    
    public Alumno getAlumno(){
        return alumno;
    }
    
    public void setFechaPres(Date fechaPres){
        this.fechaPres = fechaPres;
    }
    
    public Date getFechaPres(){
        return fechaPres;
    }
    
    public void setFechaEnt(Date fechaEnt){
        this.fechaEnt = fechaEnt;
    }
    
    public Date getFechaEnt(){
        return fechaEnt;
    }
}
