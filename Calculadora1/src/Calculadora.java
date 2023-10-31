import javax.swing.*;

    public class Calculadora {


        public static void main(String[] args) {

                String numeroStr = JOptionPane.showInputDialog(null, "Ingrese su primer número: ");
                float numero1 = 0;

                try{
                    numero1= Integer.parseInt(numeroStr);


                }catch(Exception e){
                    JOptionPane.showInputDialog(null, "Error capa 8: ");
                    main(args);
                    System.exit(0);
                }

                String numeroStr2 = JOptionPane.showInputDialog(null, "Ingrese su segundo nuemro: ");
                float numero2=0;

                try{
                    numero2 = Integer.parseInt(numeroStr2);
                }catch (Exception e){
                    JOptionPane.showInputDialog(null,"Error capa 8: ");
                    main(args);
                    System.exit(0);
                }

                float suma=numero1+numero2;
                String mensajeSuma= "La suma de " + numero1 + " y " + numero2 + " es igual a: \n" + suma;
                System.out.println(mensajeSuma);

                float resta=numero1-numero2;
                String mensajeResta= "La resta de " + numero1 + " y " + numero2 + " es igual a: \n" + resta;
                System.out.println(mensajeResta);

                double multiplicacion=numero1*numero2;
                String mensajeMultiplicacion= "La multiplicacion de " + numero1 + " y " + numero2 + " es igual a: \n" + multiplicacion;
                System.out.println(mensajeMultiplicacion);

                float division=numero1/numero2;
                String mensajeDivision= "La division de " + numero1 + " y " + numero2 + " es igual a: \n" + division;
                System.out.println(mensajeDivision);

                String mensaje = mensajeSuma + "\n";
                mensaje += mensajeResta + "\n";
                mensaje += mensajeMultiplicacion + "\n";
                mensaje+= mensajeDivision + "\n";

                JOptionPane.showInputDialog(mensaje);



            }


        }







