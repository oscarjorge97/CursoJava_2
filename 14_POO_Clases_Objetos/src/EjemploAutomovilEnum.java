public class EjemploAutomovilEnum {
    public static void main(String[] args) {

        Automovil subaru=new Automovil("Subaru","Impreza");
        //los atributos fabricante y modelo ya han sido implementados gracias al constructor
        subaru.setColor(ColorEnum.BLANCO);
        subaru.setMotor(new Motor(2.0,TipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setTipo(TipoEnum.HATCHBACK);
        System.out.println("Velocidad máxima carretera: "+ Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Velocidad máxima ciudad: "+ Automovil.VELOCIDAD_MAX_CIUDAD);

        Automovil mazda= new Automovil("Mazda","BT-50", ColorEnum.ROJO,new Motor(3.0,TipoMotor.DIESEL));
        mazda.setTipo(TipoEnum.PICKUP);


        TipoEnum tipo= subaru.getTipo();
        System.out.println("Tipo SUBARU: "+tipo.getNombre());
        System.out.println("Numero de puertas SUBARU: "+tipo.getNumeroPuertas());

        tipo=mazda.getTipo();
        switch (tipo) {
            //este es el switch mejorado sustituyendo los dos puntos por flecha y nos ahorramos de poner el break
            case CONVERTIBLE -> System.out.println("El automovil es deportivo y descapotable de dos puertas");
            case COUPE -> System.out.println("Es un automovil pequeño de dos puertas y típicamente deportivo");
            case FURGON -> System.out.println("Es un automovil utilitario de transporte, de empresas");
            case HATCHBACK -> System.out.println("Es un automovil mediano compacto, aspecto deportivo");
            case PICKUP -> System.out.println("Es un automovil doble cabina o camioneta");
            case SEDAN -> System.out.println("Es un automovil mediano");
            case STATION_WAGON -> System.out.println("Es un automovil más grande, con maleta grande");
            default -> System.out.println("No pertenece a ningún tipo");
        }

        TipoEnum[] tipos=TipoEnum.values();

        for (int i = 0; i < tipos.length; i++) {
            System.out.println((i+1)+"-Tipo: "+tipos[i].getNombre()+"\t"+
                                tipos[i].getDescripcion()+"\t"+
                                tipos[i].getNumeroPuertas()+" puertas");
        }


    }
}
