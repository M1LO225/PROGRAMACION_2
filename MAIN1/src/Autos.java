public class Autos {
    private String marca;
    private String modelo;
    private String color;
    private Double cilindraje;

    //constructor
    /*public Autos (String marca, String modelo, String color){
        this.marca=marca;
        this.modelo=modelo;
        this.color=color;
    }*/

    public Autos(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }
    

    public String getMarca(){
        return this.marca;

    }
    public void setMarca(String marca){
        this.marca=marca;

    }

    public String getModelo(){
        return this.modelo;

    }
    public void setModelo(String modelo){
        this.modelo=modelo;

    }


    public String getColor(){
        return this.color;

    }
    public void setColor(String color){
        this.color=color;

    }

    public Double getCilindraje(){
        return this.cilindraje;

    }
    public void setCilindraje(Double cilindraje){
        this.cilindraje=cilindraje;

    }




    public String detalleAuto()
    {
        //String color= "verde";
        /*System.out.println("Marca " +this.marca);
        System.out.println("Modelo " +this.modelo);
        System.out.println("Color " +this.color);
        System.out.println("Cilindraje " +this.cilindraje);*/
        String da = "Marca " + this.getMarca() +
                "\nModelo " + this.getModelo() +
                "\nColor " + this.getColor() +
                "\nCilindraje " + this.getCilindraje()+"\n";

        return da;


    }

    public String acelerar(int rpm)
    {
        return "El auto " +this.getMarca()+" esta acelerando a " +rpm+"rpm";
    }

    public String frenar(int rpm, int seg)
    {
        return "El auto " +this.getMarca()+" esta acelerando a " +rpm+"rpm "+"y va a frenar a " +seg+" segundos\n";
    }

    public float calcularTanque(float kmRecorridos, float galonesUsados){
        float capacidadTanque= kmRecorridos/galonesUsados;
        return  capacidadTanque;
    }
    public int calcularTanque(int kmRecorridos, int galonesUsados){
        int calcularTanque=kmRecorridos/galonesUsados;
        return calcularTanque;
    }



}

