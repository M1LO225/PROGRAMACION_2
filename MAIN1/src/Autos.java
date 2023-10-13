public class Autos {
    String marca;
    String modelo;
    String color= "azul";
    Double cilindraje;
    public String detalleAuto()
    {
        //String color= "verde";
        /*System.out.println("Marca " +this.marca);
        System.out.println("Modelo " +this.modelo);
        System.out.println("Color " +this.color);
        System.out.println("Cilindraje " +this.cilindraje);*/
        String da = "Marca " + this.marca +
                "\nModelo " + this.modelo +
                "\nColor " + this.color +
                "\nCilindraje " + this.cilindraje+"\n";

        return da;


    }

    public float calcularTanque(float kmRecorridos, float galonesUsados){
        float capacidadTanque= kmRecorridos/galonesUsados;
        return  capacidadTanque;
    }
    public float calcularTanque(int kmRecorridos, int galonesUsados){
        float calcularTanque=kmRecorridos/galonesUsados;
        return calcularTanque;
    }

    public String acelerar(int rpm)
    {
        return "El auto " +this.marca+" esta acelerando a " +rpm+"rpm";
    }

    public String frenar(int rpm, int seg)
    {
        return "El auto " +this.marca+" esta acelerando a " +rpm+"rpm "+"y va a frenar a " +seg+" segundos\n";
    }
}

