public class EjemploAuto {
    public static void main(String[] args) {

        Autos chevrolet = new Autos("Chevrolet", "Aveo", "Rojo");
        /*chevrolet.marca= "Chevrolet";
        chevrolet.modelo= "Aveo";
        chevrolet.color= "Rojo";
        chevrolet.cilindraje= 3.7;

        chevrolet.setMarca("Chevrolet");
        chevrolet.setModelo("Aveo");
        chevrolet.setColor("Rojo");*/
        chevrolet.setCilindraje(3.7);


        Autos toyota = new Autos("Toyota", "Auris", "Blanco");
        /*toyota.marca="Toyota";
        toyota.modelo="Auris";
        toyota.color="Blanco";
        toyota.cilindraje= 3.5;
        toyota.setMarca("Toyota");
        toyota.setModelo("Auris");
        toyota.setColor("Blanco");*/
        toyota.setCilindraje(3.5);



        Autos nissan = new Autos("Nissan", "Pahtfinder", "Azul");
        /*nissan.marca="Nissan";
        nissan.modelo="Pathfinder";
        nissan.color="Azul";
        nissan.cilindraje=3.6;
        nissan.setMarca("Nissan");
        nissan.setModelo("Pathfinder");
        nissan.setColor("Azul");*/
        nissan.setCilindraje(3.6);


        /*System.out.println("Marca " +chevrolet.marca);
        System.out.println("Modelo " +chevrolet.modelo);
        System.out.println("Color " +chevrolet.color);
        System.out.println("Cilindraje " +chevrolet.cilindraje);*/



        System.out.println(chevrolet.detalleAuto());
        System.out.println(chevrolet.acelerar(3500));
        System.out.println(chevrolet.frenar(3500, 15));

        System.out.println(toyota.detalleAuto());
        System.out.println(nissan.detalleAuto());

        System.out.println(chevrolet.calcularTanque(60.0f, 23f));
        System.out.println(chevrolet.calcularTanque(60, 23));

    }
}
