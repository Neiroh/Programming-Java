package gestionGrupos;

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
    Alumno alumno;
    Estudio estudio;
    String turno;
    boolean estado;

    public Matricula() {

    }

    public Matricula(int id, Alumno alumno, Estudio estudio, String turno, boolean estado) {
        this.id = id;
        this.alumno = alumno;
        this.estudio = estudio;
        this.turno = turno;
        this.estado = estado;
    }

    public boolean equals(Matricula otra) {
        if (this.id == otra.getId()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "matricula{" + "\nIdentificador: " + id + "\nAlumno: " + alumno + "\nEstudio: " + estudio + "\nTurno: " + turno + "\nEstado: " + estado + "\n}";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Estudio getEstudio() {
        return estudio;
    }

    public void setEstudio(Estudio estudio) {
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
