//programa que permite transformar numeros del sistema decimal en otros sistemas
//numericos utilizados en Ingenieria
//pars convertir tipo de dato

import javax.swing.*;
import java.util.Scanner;


public class ScreenIO {
    public static void main(String[] args) {
        //lectura de datos
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero decimal del sistema decimal : ");
        int numeroDecimal = 0;
        try{
            numeroDecimal = scanner.nextInt();
        } catch (Exception e){
            System.out.print("Error Capa 8.. !!\n");
            main(args);
            System.exit(0);
        }

        //Transformar un numero decimal a si mismo y en string
        String mensajeDecimal = "Numero decimal de "+ numeroDecimal + " = " + Integer.toString(numeroDecimal);
        System.out.println(mensajeDecimal);

        //Transformar un numero decimal en binario
        String mensajeBinario = "Numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(mensajeBinario);

        //Transformar un numero decimal a octal
        String mensajeOctal ="Numero Octal de "+ numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(mensajeOctal);

        //Transformar un numero decimal en hexadecimal
        String mensajeHexadecimal= "Numero Hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(mensajeHexadecimal);

        //Desplegar los valores capturados
        String mensaje = mensajeDecimal + "\n";
        mensaje += mensajeBinario + "\n";
        mensaje += mensajeOctal + "\n";
        mensaje+= mensajeHexadecimal + "\n";


        System.out.println(mensaje);


    }
}
