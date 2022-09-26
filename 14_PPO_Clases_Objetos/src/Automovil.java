public class Automovil {

    private int id;
    private static int ultimoId;
    private String fabricante;
    private String modelo;
    private String color;
    private double cilindrada;
    private int capacidadEstanque=40;
    private static int capacidadEstanqueEstatico=30;
    private static String colorPatente="Naranja";
    public static final int VELOCIDAD_MAX_CARRETERA=120;
    public final static int VELOCIDAD_MAX_CIUDAD=60;
    public static final String COLOR_ROJO="Rojo";
    public static final String COLOR_AMARILLO="Amarillo";
    public static final String COLOR_AZUL="Azul";
    public static final String COLOR_BLANCO="Blanco";
    public static final String COLOR_GRIS="Gris oscuro";

    //Constructor,  Cuando se crea un constructor por defecto con parametros desaparece el vacío por defecto
    //optimizamos los constructores con menos lineas de codigo usando el this();
    public Automovil(){

        this.id=++ultimoId;
    }


    public Automovil(String fabricante, String modelo, String color, double cilindrada, int capacidadEstanque) {
        this(fabricante, modelo, color, cilindrada);
        this.capacidadEstanque = capacidadEstanque;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindrada) {
        this(fabricante,modelo,color);
        this.cilindrada = cilindrada;
    }
    public Automovil(String fabricante, String modelo, String color) {
        this(fabricante,modelo);
        this.color = color;
    }
    public Automovil(String fabricante,String modelo){
        this();//con este va a agregar el id del constructor vacio
        this.fabricante=fabricante;
        this.modelo=modelo;

    }



    //metodos getter&stter


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCapacidadEstanqueEstatico() {
        return capacidadEstanqueEstatico;
    }

    public static void setCapacidadEstanqueEstatico(int capacidadEstanqueEstatico) {
        Automovil.capacidadEstanqueEstatico = capacidadEstanqueEstatico;
    }

    public static String getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(String colorPatente) {
        Automovil.colorPatente = colorPatente;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCapacidadEstanque() {
        return capacidadEstanque;
    }

    public void setCapacidadEstanque(int capacidadEstanque) {
        this.capacidadEstanque = capacidadEstanque;
    }


    //metodos o funciones
    //Cada vez que quiero acceder a un metodo o atributo propia de la misma clase utilizo el this.
    public String verdetalle(/*aquí irian los parametros*/){
        StringBuilder sb=new StringBuilder();
        sb.append("auto.id = "+this.id);
        sb.append("\n auto.fabricante = " + this.fabricante);
        sb.append("\n auto.modelo = " + this.modelo);
        sb.append("\n auto.color = " + this.color);
        sb.append("\n auto.cilindrada = " + this.cilindrada);
        sb.append("\n auto.patenteColor= "+ Automovil.colorPatente);
        return sb.toString();

    }
    public String acelerar(int rpm){
        return "El auto "+this.fabricante+" acelerando a "+rpm+" rpm.";
    }
    public String frenar (){
        return this.fabricante+" "+modelo+" frenando!";
    }

    public String acelerarFrenar(int rpm){
        String acelerar=this.acelerar(rpm);
        String frenar=this.frenar();

        return acelerar+"\n"+frenar;
    }

    public double calcularConsumo(int km, double porcentajeGasolina){
        //kilometros entre (%de gasolina *total Litros del tanque
        return km/(porcentajeGasolina*this.capacidadEstanque);
    }


    //esto es sobrecarga de metodos,mismo nombre metodo, pero disinto nombre tipo o parametros
    public double calcularConsumo(int km, int porcentajeGasolina){
        //kilometros entre (%de gasolina *total Litros del tanque
        return km/((porcentajeGasolina/100d)*this.capacidadEstanque);
    }


    public static double calcularConsumoEstatico(int km, int porcentajeGasolina){
        return km/((porcentajeGasolina/100d)*Automovil.capacidadEstanqueEstatico);
    }


    //metodo Sobreescrito(Override) para comparar si el objeto es igual
    @Override   //indica que estamos sobreescribiendo el metodo de la clase padres, es informativo nada más
    public boolean equals(Object obj) {
        if (this==obj){
            return true;
        }
        if (!(obj instanceof Automovil)) {//si el objeto no es instancia automovil retornará false
        return false;
        }
        Automovil auto=(Automovil) obj;//hay que hacer un cast
        //estamos comprobando si son iguales el fabricante y el metodo
        return (this.fabricante!=null &&this.modelo !=null &&
                this.fabricante.equalsIgnoreCase(auto.getFabricante())
                && this.modelo.equalsIgnoreCase(auto.getModelo()));

    }

    @Override
    public String toString() {
        return "Automovil{" +
                "id='" + id +'\''+
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindrada='" + cilindrada +'\'' +
                ", capacidadEstanque='" + capacidadEstanque +'\'' +
                '}';
    }
}
