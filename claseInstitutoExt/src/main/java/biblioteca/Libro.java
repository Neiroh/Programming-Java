/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package biblioteca;

/**
 *
 * @author Neiroh
 */
public class Libro {

    //Atributos
    int isbn;
    String nombre;
    String autor;
    int numPag;
    String editorial;
    int cantidad;
    
    public Libro(){
        
    }
    
    public Libro(int isbn, String nombre, String autor, int numPag, String editorial, int cantidad){
        this.isbn = isbn;
        this.nombre = nombre;
        this.autor = autor;
        this.numPag = numPag;
        this.editorial = editorial;
        this.cantidad = cantidad;
    }
    
    public boolean equals(Libro other){
        if(this.isbn == other.getIsbn()){
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public String toString(){
        return "Libro{\nISBN: " + isbn + "\nNombre: " + nombre + "\nAutor: " + autor + "\nNúmero de Páginas: " + numPag + "\nEditorial: " + editorial + "\nCantidad: " + cantidad + "\n}";
    }
    
    //Getters and Setters
    public void setIsbn(int isbn){
        this.isbn = isbn;
    }
    
    public int getIsbn(){
        return isbn;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public void setNumPag(int numPag){
        this.numPag = numPag;
    }
    
    public int getNumPag(){
        return numPag;
    }
    
    public void setEditorial(String editorial){
        this.editorial = editorial;
    }
    
    public String getEditorial(){
        return editorial;
    }
    
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    
    public int getCantidad(){
        return cantidad;
    }
}
