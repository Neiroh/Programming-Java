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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}
