public class EjemploAuto {
    public static void main(String[] args) {
        Autos chevrolet = new Autos();
        chevrolet.marca= "Chevrolet";
        chevrolet.modelo= "Aveo";
        chevrolet.color= "Rojo";
        chevrolet.cilindraje= 3.7;


        Autos toyota = new Autos();
        toyota.marca="Toyota";
        toyota.modelo="Auris";
        toyota.color="Blanco";
        toyota.cilindraje= 3.5;

        Autos nissan = new Autos();
        nissan.marca="Nissan";
        nissan.modelo="Pathfinder";
        nissan.color="Azul";
        nissan.cilindraje=3.6;


        /*System.out.println("Marca " +chevrolet.marca);
        System.out.println("Modelo " +chevrolet.modelo);
        System.out.println("Color " +chevrolet.color);
        System.out.println("Cilindraje " +chevrolet.cilindraje);*/
        System.out.println(chevrolet.calcularTanque(60.0f, 23f));
        System.out.println(chevrolet.calcularTanque(60, 23));

        System.out.println(chevrolet.detalleAuto());
        System.out.println(chevrolet.acelerar(3500));
        System.out.println(chevrolet.frenar(3500, 15));

        System.out.println(toyota.detalleAuto());
        System.out.println(nissan.detalleAuto());


    }
}
