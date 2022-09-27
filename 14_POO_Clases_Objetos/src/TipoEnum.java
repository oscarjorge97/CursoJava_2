public enum TipoEnum {
    SEDAN("Sedan", 4, "Auto mediano"),
    STATION_WAGON("Station Wagon", 5, "Auto grande"),
    HATCHBACK("Hatchback", 5, "Auto compacto"),
    PICKUP("Pickup", 4,"Camioneta" ),
    COUPE("Coupe",2,"Auto pequeño"),
    CONVERTIBLE("Convertible", 2, "Auto deportivo"),
    FURGON("Furgon", 6, "Auto utilitario");


    private final String nombre;
    private final int numeroPuertas;
    private final String descripcion;

    TipoEnum(String nombre, int numeroPuertas, String descripcion) {
        this.nombre = nombre;
        this.numeroPuertas = numeroPuertas;
        this.descripcion = descripcion;
    }
    //No tiene metodo set porque son Final, los Final no se pueden editar
    public String getNombre() {
        return nombre;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public String getDescripcion() {
        return descripcion;
    }


}
