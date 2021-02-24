package main;




import biblioteca.Libro;
import biblioteca.Prestamo;
import gestionGrupos.Alumno;
import gestionGrupos.Departamento;
import gestionGrupos.Direccion;
import gestionGrupos.Estudio;
import gestionGrupos.Grupo;
import gestionGrupos.Materia;
import gestionGrupos.Matricula;
import gestionGrupos.Profesor;
import java.util.Date;
import secretaria.Peticion;
import secretaria.SolicitudBeca;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arce
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Crea un objeto de Direccion
        //@param nombre es un String que almacena el nombre de la calle
        //@param num es un String que almacena el número del portal
        //@param piso es un int que almacena el piso de la direccion
        //@param puerta es un String que almacena la puerta del piso
        //@param codPostal es un int que almacena el código postal
        //Direccion nombre = new Direccion(nombre, num, piso, puerta, codPostal)
        Direccion[] direcciones = new Direccion[3];
        direcciones[0] = new Direccion("abc", 3, 4, "a", 51002);
        direcciones[1] = new Direccion("cba", 3, 4, "a", 51002);
        direcciones[2] = new Direccion("bac", 3, 4, "a", 51002);

        //Crea un objeto del tipo Alumno
        //@param nombre es un String que almacena el nombre del alumno
        //@param ap1 es un String que almacena el primer apellido del alumno
        //@param ap2 es un String que almacena el segundo apellido del alumno
        //@param edad es un int que almacena la edad del alumno
        //@param tlf es un int que almacena el teléfono del alumno
        //@param dni es un String que almacena el dni del alumno
        //@param numExpt es un int que almacena el número de expediente del alumno
        //@param correo es un String que almacena el correo del alumno
        //@param nombrePadre es un String que almacena el nombre del padre del alumno
        //@param nombreMadre es un String que almacena el nombre de la madre del alumno
        //@param tlfPadre es un int que almacena el teléfono del padre del alumno
        //@param tlfMadre es un int que almacena el teléfono de la madre del alumno
        //@param direcciones es un objeto de tipo Direccion que almacena las direcciones del alumno
        //Alumno nombre = new Alumno(nombre, ap1, ap2, edad, tlf, dni, numExp, correo, nombrePadre, nombreMadre, tlfPadre, tlfMadre, direcciones)
        Alumno a = new Alumno("RAUL", "FERNANDEZ", "ARCE", 19, 123456789, "123456789A", 9854, "ALUMNOA@GMAIL.COM", "JOSE", "LAURA", 123456789, 123456789, direcciones);
        Alumno b = new Alumno("ALVARO", "BAUTISTA", "ARCE", 25, 123456789, "133456789A", 9855, "ALUMNOB@GMAIL.COM", "JESUS", "LAURA", 123456789, 123456789, direcciones);

        if (a.equals(b)) {
            System.out.println("EL DNI SE REPITE");
        } else {
//             System.out.println(a.toString());
//            System.out.println(b.toString());
//            System.out.println();
        }

        //Crea un objeto de la clase Materia
        //@param id es un int que almacena el id de la materia
        //@param nombre es un String que almacena el nombre de la materia
        //Materia nombre = new Materia(id, nombre)
        Materia[] materias = new Materia[6];
        materias[0] = new Materia(1, "Programación");
        materias[1] = new Materia(2, "SI");
        materias[2] = new Materia(3, "Entornos");
        materias[3] = new Materia(4, "BBDD");
        materias[4] = new Materia(5, "LMSGI");
        materias[5] = new Materia(7, "FOL");

//        System.out.println(mod1.toString());
//        System.out.println(mod2.toString());
//        System.out.println(mod3.toString());
//        System.out.println(mod4.toString());
//        System.out.println(mod5.toString());
//        System.out.println(mod6.toString());
//        System.out.println();

        //Crea un objeto de la clase Departamento
        //@param id es un int que almacena el ide del departamento
        //@param nombre es un String que almacena el nombre del departamento
        //Departamento nombre = new Departamento(id, nombre)
        Departamento dep1 = new Departamento(1, "Informática");
        Departamento dep2 = new Departamento(2, "Formación Laboral");

        if (dep1.equals(dep2)) {
            System.out.println("EL ID ES EL MISMO");
        } else {
//            System.out.println(dep1.toString());
//            System.out.println(dep2.toString());
//            System.out.println();
        }

        Estudio std1 = new Estudio(1, "Desarrollo de Aplicaciones Web", materias);
        Estudio std2 = new Estudio(2, "Desarrollo de Aplicaciones Multiplataforma", materias);

//        System.out.println(std1.toString());
        Matricula mat1 = new Matricula(1, a, std1, "Diurno", true);
        Matricula mat2 = new Matricula(2, b, std2, "Diurno", true);

        Matricula[] mat = new Matricula[2];
        mat[0] = mat1;
        mat[1] = mat2;

        //Comprueba que la matrícula es única
        if (mat1.equals(mat2)) {
            System.out.println("LA MATRICULA ES LA MISMA");
        } else {
//            System.out.println(mat1.toString());
//            System.out.println(mat2.toString());
//            System.out.println();
        }

        //Crea una clase de tipo Profesor
        //@param id es un int que almacena el id del profesor
        //@param dni es un String que almacena el dni del profesor
        //@param nombre es un String que almacena el nombre del profesor
        //@param ap1 es un String que almacena el primer apellido del profesor
        //@param ap2 es un String que almacena el segundo apellido del profesor
        //@param departamento es un objeto de la clase Departamento que almacena el departamento al que pertenece el profesor
        //Profesor nombre = new Profesor(id, dni, nombre, ap1, ap2, departamento)
        Profesor[] prof = new Profesor[6];
        prof[0] = new Profesor(1, "123456789A", "Javier", "De Reyes", "A", dep1);
        prof[1] = new Profesor(2, "133456789A", "José Óscar", "González", "B", dep1);
        prof[2] = new Profesor(3, "143456789A", "Rosendo", "C", "D", dep1);
        prof[3] = new Profesor(4, "153456789A", "Javier", "Castillo", "E", dep1);
        prof[4] = new Profesor(5, "163456789A", "Javier", "Criado", "F", dep1);
        prof[5] = new Profesor(6, "173456789A", "Maite", "Lagares", "G", dep2);

//        System.out.println(pr1.toString());
//        System.out.println(pr2.toString());
//        System.out.println(pr3.toString());
//        System.out.println(pr4.toString());
//        System.out.println(pr5.toString());
//        System.out.println(pr6.toString());
//        System.out.println();
        Grupo gr1 = new Grupo(1, "DAW1", std1, "Diurno", 1, prof[1], mat, prof);
        
        Date date1 = new Date();
        Date date2 = new Date(2020, 12, 13);
        
        //Crea un objeto de la clase Peticion
        //@param id es un int que almacena el id de la petición
        //@param fechaPeticion es un Date que almacena la fecha en que se realiza la petición
        //@param estadoPeticion es un boolean que almacena si se a aceptado o rechazado
        //@param profesor es un objeto de la clase Profesor y almacena el profesor que la realiza
        //Peticion nombre = new Peticion(id, fechaPeticion, estadoPeticion, profesor)
        Peticion pe1 = new Peticion(1, date1, true, prof[3]);
        Peticion pe2 = new Peticion(2, date2, false, prof[5]);
        
        //Comprobamos que el ID de la petición no se repite
        if(pe1.equals(pe2)){
            System.out.println("El id de la petición es el mismo");
        }else{
            System.out.println(pe1.toString());
            System.out.println(pe2.toString());
            System.out.println();
            System.out.println("");
            System.out.println("");
        }
        
        Date date3 = new Date(2021, 02, 10);
        Date date4 = new Date(2021, 01, 27);
        Date date5 = new Date(2021, 01, 23);
        Date date6 = new Date(2021, 02, 04);
        
        //Crea un objeto de clase Libro
        //@param isbn es un int que almacena el isbn del libro
        //@param nombre es un String que almacena el nombre del libro
        //@param autor es un String que almacena el nombre del autor
        //@param numPag es un int que almacena el número de páginas
        //@param editorial es un String que almacena la editorial del libro
        //@param cantidad es un int que almacena la cantidad de libros que hay disponibles
        //Libro nombre = new Libro(isbn, nombre, autor, numPag, editorial, cantidad)
        Libro lb1 = new Libro(123456, "El Temor de un Hombre Sabio", "Patrick Rothfus", 972, "DeBolsillo", 6);
        Libro lb2 = new Libro(213456, "El Sonido del Silencio", "Patrick Rothfus", 467, "DeBolsillo", 3);
        
        //comprobamos que el ISBN es único
        if(lb1.equals(lb2)){
            System.out.println("El ISBN de los libros es el mismo");
        }
        
        //Crea un préstamo
        //@param libro es de tipo Libro y almacena qué libro ha solicitado
        //@param alumno es de tipo Alumno y almacena el alumno que lo solicita
        //@param fechaPres es un Date que almacena la fecha en la que se realiza la solicitud
        //@param fechaEnt es un Date que almacena la fecha en la que hay que entregar el libro
        //Prestamo nombre = new Prestamo(libro, alumno, fechaPres, fechaEnt)
        Prestamo pr1 = new Prestamo(lb1, a, date4, date3);
        Prestamo pr2 = new Prestamo(lb2, b, date5, date6);
        
        //comprobamos que el libro no se repita
        if(pr1.equals(pr2)){
            System.out.println("El libro es el mismo");
        }else{
            System.out.println(pr1.toString());
            System.out.println(pr2.toString());
            System.out.println();
            System.out.println();
            System.out.println();
        }
        
        Date fnac1 = new Date(2001, 06, 13);
        Date fnac2 = new Date(1995, 06, 20);
        
        //Crea una nueva solicitud de Beca
        //@param id es un entero unico
        //@param nombre es el String del nombre del alumno
        //@param ap1 es un String que guarda el primer apellido del alumno
        //@param ap2 es un String que guarda el segundo apellido del alumno
        //@param cuentaBancaria es un String que guarda la cuenta Bancaria
        //@param estadoCivil es un String que almacena el estado civil
        //@param fechaNacimiento es un Date
        //@param residePadres es un boolean que almacena si vive con sus padres
        //SolicitudBeca nombreSolicitud = new SolicitudBeca(id, nombre, ap1, ap2, cuentaBancaria, estadoCivil, fechaNacimiento, residePadres)
        SolicitudBeca sb1 = new SolicitudBeca(1, "Raúl", "Fernández", "Arce", "ES1234567890", "Solito", fnac1, true);
        SolicitudBeca sb2 = new SolicitudBeca(2, "Álvaro", "Bautista", "Arce", "ES1234567899", "Casao", fnac2, false);
        
        //Comprobamos que el id no se repita
        if(sb1.equals(sb2)){
            System.out.println("El ID de la solicitud es la misma");
        }else{
            System.out.println(sb1.toString());
            System.out.println(sb2.toString());
        }
    }
}
