
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
    String estudio;
    String turno;
    int curso;
    String tutor;
    Matricula[] matriculas;
    Profesor[] profesores;
    
    public Grupo(){
        
    }
    
    public Grupo(int id, String cod, String estudio, String turno, int curso, String tutor, Matricula[] matriculas, Profesor[] profesores){
        this.id = id;
        this.cod = cod;
        this.estudio = estudio;
        this.turno = turno;
        this.curso = curso;
        this.tutor = tutor;
        this.matriculas = matriculas;
        this.profesores = profesores;
    }
    
    @Override
    public String toString(){
        return "grupo{" + "Identificador: " + id + ", Código: " + cod + ", Estudio: " + estudio + ", Turno: " + turno + ", Curso: " + curso + ", Tutor: " + tutor + ", matriculas: " + Arrays.toString(matriculas) + ", Profesores: " + Arrays.toString(profesores);
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

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
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
