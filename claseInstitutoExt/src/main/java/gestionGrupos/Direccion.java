package gestionGrupos;

/*
 * To change this license header\nchoose License Headers in Project Properties.
 * To change this template file\nchoose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neiroh
 */
public class Direccion {
    
    //Atributos
    String nombre;
    int num;
    int planta;
    String puerta;
    int codPostal;
    
    public Direccion(){
        
    }
    
    public Direccion(String nombre){
        this.nombre = nombre;
    }
    
    public Direccion(String nombre, int num, int planta, String puerta, int codPostal){
        this.nombre = nombre;
        this.num = num;
        this.planta = planta;
        this.puerta = puerta;
        this.codPostal = codPostal;
    }
    
    public boolean equals(Direccion otra){
        if(!this.nombre.equals(otra.getNombre())){
            return false;
        }
        if(this.num != otra.num){
            return false;
        }
        if(this.planta != otra.planta){
            return false;
        }
        if (!this.puerta.equals(otra.puerta)) {
            return false;
        }
        if(this.codPostal != otra.codPostal){
            return false;
        }
        
        return true;
        
    }
    
    
    @Override
    public String toString(){
        return "\ndireccion{" + "\nNombre: " + nombre + "\nNúmero: " + num + "\nPlanta : " + planta + "\nPuerta: " + puerta + "\nCódigo Postal: " +codPostal + "\n}" + "\n";
    }

    // GETTER y SETTER
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getPlanta() {
        return planta;
    }

    public void setPlanta(int planta) {
        this.planta = planta;
    }

    public String getPuerta() {
        return puerta;
    }

    public void setPuerta(String puerta) {
        this.puerta = puerta;
    }

    public int getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(int codPostal) {
        this.codPostal = codPostal;
    }
    
    
}
