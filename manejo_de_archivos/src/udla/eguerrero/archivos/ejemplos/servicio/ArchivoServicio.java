package udla.eguerrero.archivos.ejemplos.servicio;
import java.io.*;

//BufferWriter
public class ArchivoServicio {
    public void crearArchivo(String nombre){
        File archivo = new File(nombre);
        try (BufferedWriter buffer = new BufferedWriter(new FileWriter(archivo, true))){
            //FileWriter escritor = new FileWriter(archivo, true);
            //BufferedWriter buffer = new BufferedWriter(new FileWriter(archivo, true));

            buffer.append("Buenos dias estrellitas, la tierra les dice hola!!!\n")
                    .append("YAAAFFFFF\n")
                    .append("QUE ONDA GENTE\n");
            //buffer.close();
            System.out.println("El archivo se ha creado con exito:!:!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



//PrintWriter
    public void crearArchivo2(String nombre){
        File archivo = new File(nombre);
        try (PrintWriter buffer = new PrintWriter(new FileWriter(archivo, true))){
            //FileWriter escritor = new FileWriter(archivo, true);
            //BufferedWriter buffer = new BufferedWriter(new FileWriter(archivo, true));

            buffer.println("\nBuenos dias estrellitas, la tierra les dice hola!!!");
            buffer.println("YAAAFFFFF");
            buffer.printf("QUE ONDA GENTE\n");
            //buffer.close();
            System.out.println("El archivo se ha creado con exito:!:!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //Lectura de Archivos
    public String leerArchivo(String nombre){
        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombre);
        try {
            BufferedReader reader = new BufferedReader(new FileReader(archivo));
            String linea;
            while((linea = reader.readLine()) !=null);{
                sb.append(linea);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }
}
