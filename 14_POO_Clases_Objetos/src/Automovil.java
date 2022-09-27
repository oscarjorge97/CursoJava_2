public class Automovil {

    private int id;
    private static int ultimoId;
    private String fabricante;
    private String modelo;
    private ColorEnum color=ColorEnum.GRIS;
    private Motor motor;
    private  Estanque estanque;
    private Persona persona;
    private Rueda [] ruedas;    //array porque tiene 4, 5 o 6 ruedas etc
    private static int capacidadEstanqueEstatico=30;
    private static ColorEnum colorPatente=ColorEnum.NARANJA;
    public static final int VELOCIDAD_MAX_CARRETERA=120;
    public final static int VELOCIDAD_MAX_CIUDAD=60;

    private TipoEnum tipo;
    /*public static final String COLOR_ROJO="Rojo";
    public static final String COLOR_AMARILLO="Amarillo";
    public static final String COLOR_AZUL="Azul";
    public static final String COLOR_BLANCO="Blanco";
    public static final String COLOR_GRIS="Gris oscuro";*/

    //Constructor,  Cuando se crea un constructor por defecto con parametros desaparece el vacío por defecto
    //optimizamos los constructores con menos lineas de codigo usando el this();
    public Automovil(){

        this.id=++ultimoId;
    }
    //Constructores
    public Automovil(String fabricante, String modelo, ColorEnum color, Motor motor, Estanque estanque, Persona persona, Rueda[] ruedas) {
        this(fabricante,modelo,color,motor,estanque);
        this.persona = persona;
        this.ruedas = ruedas;
    }

    public Automovil(String fabricante, String modelo, ColorEnum color, Motor motor, Estanque estanque, Persona persona) {
        this(fabricante, modelo, color, motor,estanque);
        this.persona = persona;
    }


    public Automovil(String fabricante, String modelo, ColorEnum color, Motor motor, Estanque estanque) {
        this(fabricante, modelo, color, motor);
        this.estanque = estanque;
    }

    public Automovil(String fabricante, String modelo, ColorEnum color, Motor motor) {
        this(fabricante,modelo,color);
        this.motor = motor;
    }
    public Automovil(String fabricante, String modelo, ColorEnum color) {
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

    public static ColorEnum getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(ColorEnum colorPatente) {
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

    public ColorEnum getColor() {
        return color;
    }

    public void setColor(ColorEnum color) {
        this.color = color;
    }


    public TipoEnum getTipo() {
        return tipo;
    }

    public void setTipo(TipoEnum tipo) {
        this.tipo = tipo;
    }


    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Estanque getEstanque() {
        return estanque;
    }

    public void setEstanque(Estanque estanque) {
        this.estanque = estanque;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    //metodos o funciones
    //Cada vez que quiero acceder a un metodo o atributo propia de la misma clase utilizo el this.
    public String verdetalle(/*aquí irian los parametros*/){
        String detalle = "auto.id = " + this.id +
                        "\n auto.fabricante = " + this.fabricante +
                        "\n auto.modelo = " + this.modelo;
        if (this.getTipo()!=null) {
            detalle += "\n auto,tipo = " + getTipo().getDescripcion();
        }
                detalle+="\n auto.color = " + this.color +
                        "\n auto.cilindrada = " + this.motor.getCilindrada() +
                        "\n auto.patenteColor= " + colorPatente+
                        "\n auto.conductor= "+ persona;
        if (getRuedas()!=null) {
            for (Rueda r : this.getRuedas()) {
                detalle += "\n" + "fabricante: " + r.getFabricante() + "\t" + "aro: " + r.getAro() + "\t" + "ancho: " + r.getAro();
            }
        }
        return detalle;

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
        return km/(porcentajeGasolina*this.estanque.getCapacidad());
    }


    //esto es sobrecarga de metodos,mismo nombre metodo, pero disinto nombre tipo o parametros
    public double calcularConsumo(int km, int porcentajeGasolina){
        //kilometros entre (%de gasolina *total Litros del tanque
        return km/((porcentajeGasolina/100d)*this.estanque.getCapacidad());
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
         String toString="Automovil{" +
                "id='" + id +'\''+
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindrada='" + motor.getCilindrada() +'\'';
                 if(this.estanque!=null){
                     toString+=", capacidadEstanque='" + estanque.getCapacidad() +'\'' ;
                 }

                toString+='}';
        return toString;
    }
}
