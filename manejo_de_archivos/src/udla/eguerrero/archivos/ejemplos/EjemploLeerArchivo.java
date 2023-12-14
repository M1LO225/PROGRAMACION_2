package udla.eguerrero.archivos.ejemplos;

import udla.eguerrero.archivos.ejemplos.servicio.ArchivoServicio;

public class EjemploLeerArchivo {
    public static void main(String[] args) {

        ArchivoServicio servicio = new ArchivoServicio();
        System.out.println(servicio.leerArchivo(nombreArchivo));
    }
}
