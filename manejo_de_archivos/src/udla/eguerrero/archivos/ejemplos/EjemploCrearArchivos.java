package udla.eguerrero.archivos.ejemplos;

import udla.eguerrero.archivos.ejemplos.servicio.ArchivoServicio;

public class EjemploCrearArchivos {
    public static void main(String[] args) {
        String nombreArchivo = "D:\\Ejercicios\\java.txt"; //PathFile
        ArchivoServicio service = new ArchivoServicio();
        service.crearArchivo2(nombreArchivo);


    }
}
