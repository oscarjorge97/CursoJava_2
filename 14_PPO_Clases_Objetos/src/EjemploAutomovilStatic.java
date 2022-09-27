public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil subaru=new Automovil("Subaru","Impreza");
        //los atributos fabricante y modelo ya han sido implementados gracias al constructor
        subaru.setColor(ColorEnum.BLANCO);
        subaru.setMotor(new Motor(2.0,TipoMotor.DIESEL));
        subaru.setTipo(TipoEnum.HATCHBACK);
        System.out.println("Velocidad máxima carretera: "+ Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Velocidad máxima ciudad: "+ Automovil.VELOCIDAD_MAX_CIUDAD);

        Automovil mazda= new Automovil("Mazda","BT-50", ColorEnum.ROJO,new Motor(2.0,TipoMotor.DIESEL));
        mazda.setTipo(TipoEnum.PICKUP);

        Automovil nissan=new Automovil("Nissan","Qhasqai", ColorEnum.AZUL,new Motor(3.0,TipoMotor.DIESEL),new Estanque());
        nissan.setTipo(TipoEnum.COUPE);

        Automovil nissan2=new Automovil("Nissan","Qhasqai", ColorEnum.GRIS,new Motor(5.0,TipoMotor.DIESEL),new Estanque(50));
        Automovil.setColorPatente(ColorEnum.NARANJA);
        nissan2.setTipo(TipoEnum.PICKUP);

        Automovil auto=new Automovil();

        System.out.println("______________________________");

        System.out.println(subaru.verdetalle()+"\n"+
                    "\n"+mazda.verdetalle()+"\n"+
                    "\n"+nissan.verdetalle()+"\n"+
                    "\n"+nissan2.verdetalle());
        System.out.println("Automovil.getColorPatente() = " + Automovil.getColorPatente());
        Automovil.setCapacidadEstanqueEstatico(45);
        System.out.println("Kilometros por litros Estatico subaru= "+subaru.calcularConsumoEstatico(300,60)+"\n"+
                "\n"+"Kilometros por litros Estatico mazda= "+mazda.calcularConsumoEstatico(300,60)+"\n"+
                "\n"+"Kilometros por litros Estatico nissan= "+nissan.calcularConsumoEstatico(300,60));
        System.out.println("_____________________");
        System.out.println(subaru.toString());
        System.out.println(mazda.toString());
        System.out.println(nissan.toString());

        TipoEnum subaruTipo= subaru.getTipo();
        System.out.println("Tipo SUBARU: "+subaruTipo.getNombre());
        System.out.println("Numero de puertas SUBARU: "+subaruTipo.getNumeroPuertas());




    }
}
