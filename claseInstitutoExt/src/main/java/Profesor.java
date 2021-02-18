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
    Departamento departamento;
    
    public Profesor(){
        
    }
    
    public Profesor(int id, String dni, String nombre, String ap1, String ap2, Departamento departamento){
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.ap1 = ap1;
        this.ap2 = ap2;
        this.departamento = departamento;
    }
    
    public boolean equals(Profesor other){
        if(this.dni == other.getDni()){
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public String toString(){
        return "profesor{" + "\nIdentificador: " + id + "\nDNI: " + dni + "\nNombre: " + nombre + "\nApellido: " + ap1 + ap2 + "\nDepartamento: " + departamento + "\n}";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
    
}
