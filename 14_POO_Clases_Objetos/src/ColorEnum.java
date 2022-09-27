public enum ColorEnum {
    //siempre se escribe en mayuscula en los Enum debido a que son constantes
    ROJO("Rojo"),
    AMARILLO("Amarillo"),
    AZUL("Azul"),
    BLANCO("Blanco"),
    GRIS("Gris oscuro"),
    NARANJA("Naranja");
    //Ahora para que sea por ejemplo ROJO, pero en minuscula haremos lo siguiente
    private final String color;


    ColorEnum(String color) {
        this.color = color;
        //y ahora añadiremos arriba entre comillas el nombre del color a mostrar
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return this.color;
    }
}
