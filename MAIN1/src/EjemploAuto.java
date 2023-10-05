public class EjemploAuto {
    public static void main(String[] args) {
        Autos chevrolet = new Autos();
        chevrolet.marca= "Chevrolet";
        chevrolet.modelo= "Aveo";
        chevrolet.color= "Rojo";
        chevrolet.cilindraje= 3.7;


        Autos toyota = new Autos();
        Autos nissan = new Autos();


        /*System.out.println("Marca " +chevrolet.marca);
        System.out.println("Modelo " +chevrolet.modelo);
        System.out.println("Color " +chevrolet.color);
        System.out.println("Cilindraje " +chevrolet.cilindraje);*/

        System.out.println(chevrolet.detalleAuto());
        System.out.println(chevrolet.acelerar(3500));
        System.out.println(chevrolet.frenar(3500, 15));

        System.out.println(toyota.detalleAuto());
        System.out.println(nissan.detalleAuto());


    }
}
