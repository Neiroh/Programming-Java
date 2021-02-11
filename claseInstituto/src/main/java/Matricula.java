/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neiroh
 */
public class Matricula {

    //Atributos
    int id;
    String alumno;
    String estudio;
    String turno;
    boolean estado;
    
    public Matricula(){
        
    }
    
    public Matricula(int id, String alumno, String estudio, String turno, boolean estado){
        this.id = id;
        this.alumno = alumno;
        this.estudio = estudio;
        this.turno = turno;
        this.estado = estado;
    }
    
    @Override
    public String toString(){
        return "matricula{" + "Identificador: " + id + ", Alumno: " + alumno + ", Estudio: " + estudio + ", Turno: " + turno + ", Estado: " + estado;
    }
}
