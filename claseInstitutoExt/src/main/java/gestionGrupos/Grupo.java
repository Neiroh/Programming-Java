package gestionGrupos;


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
public class Grupo {

    //Atributos
    int id;
    String cod;
    Estudio estudio;
    String turno;
    int curso;
    Profesor tutor;
    Matricula[] matriculas;
    Profesor[] profesores;
    
    public Grupo(){
        
    }
    
    public Grupo(int id, String cod, Estudio estudio, String turno, int curso, Profesor tutor, Matricula[] matriculas, Profesor[] profesores){
        this.id = id;
        this.cod = cod;
        this.estudio = estudio;
        this.turno = turno;
        this.curso = curso;
        this.tutor = tutor;
        this.matriculas = matriculas;
        this.profesores = profesores;
    }
    
    public boolean equals(Grupo otro){
        if(this.id == otro.getId()){
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public String toString(){
        return "grupo{" + "\nIdentificador: " + id + "\nCódigo: " + cod + "\nEstudio: " + estudio + "\nTurno: " + turno + "\nCurso: " + curso + "\nTutor: " + tutor + "\nmatriculas: " + Arrays.toString(matriculas) + "\nProfesores: " + Arrays.toString(profesores) + "\n}";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
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

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public Profesor getTutor() {
        return tutor;
    }

    public void setTutor(Profesor tutor) {
        this.tutor = tutor;
    }

    public Matricula[] getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(Matricula[] matriculas) {
        this.matriculas = matriculas;
    }

    public Profesor[] getProfesores() {
        return profesores;
    }

    public void setProfesores(Profesor[] profesores) {
        this.profesores = profesores;
    }
    
    
}
