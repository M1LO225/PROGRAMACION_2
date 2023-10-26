//programa que permite transformar numeros del sistema decimal en otros sistemas
//numericos utilizados en Ingenieria
//pars convertir tipo de dato

import javax.swing.*;


public class ConsoleIO {
    public static void main(String[] args) {
        //lectura de datos
        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero decimal del sistema decimal : ");
        int numeroDecimal = 0;
        try{
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch (Exception e){
            JOptionPane.showInputDialog(null,"Error Capa 8 :");
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



        JOptionPane.showInputDialog(null, mensaje);


    }
}
