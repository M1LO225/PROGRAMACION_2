package edu.eguerrero.herencia;

public class Herencia {
    public static void main(String[] args) {
        //instanciando la clase Alumno
        Alumno alumno=new Alumno();
        alumno.setNombre("Andres");
        alumno.setMateria1("TI");

        System.out.println(alumno.getNombre());
        System.out.println(alumno.getMateria1());

        //instanciando la clase Profesor
        Profesor profesor=new Profesor();


    }
}
