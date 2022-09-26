

public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil subaru=new Automovil("Subaru","Impreza");
        //los atributos fabricante y modelo ya han sido implementados gracias al constructor
        subaru.setColor(Automovil.COLOR_GRIS);
        subaru.setCilindrada(2.0);
        System.out.println("Velocidad máxima carretera: "+Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Velocidad máxima ciudad: "+Automovil.VELOCIDAD_MAX_CIUDAD);

        Automovil mazda= new Automovil ("Mazda","BT-50",Automovil.COLOR_ROJO,3.0);

        Automovil nissan=new Automovil("Nissan","Qhasqai",Automovil.COLOR_AZUL,5.0,80);

        Automovil nissan2=new Automovil("Nissan","Qhasqai",Automovil.COLOR_AMARILLO,5.0,80);
        Automovil.setColorPatente("Azul");

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




    }
}
