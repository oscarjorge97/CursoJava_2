import java.util.Date;

public class EjemploAutomovil {
    public static void main(String[] args) {
        //clases representan datos o comportamientos,es una plantilla o molde para crear los objetos,los objetos tienen atributos
        //atributos son caracteristicas que representan informacion con variables

        Automovil subaru=new Automovil("Subaru","Impreza");//el operador new crea la instancia, la inicializa y guarda el objeto en la memoria, y guarda la referencia de la variable hacia el objeto
        subaru.setMotor(new Motor(2.0,TipoMotor.BENCINA));//= Motor motorSubaru=new Motor(2.0,TipoMotor.BENCINA);
        subaru.setEstanque(new Estanque()); //por defecto tiene 40 litros en el constructor vacio, pero también tiene un constructor para ponerlo
        //los atributos fabricante y modelo ya han sido implementados gracias al constructor
        subaru.setColor(ColorEnum.BLANCO);

        System.out.println(subaru.getFabricante()+"\n"+subaru.getModelo()+"\n"+subaru.getColor()+"\n"+subaru.getMotor().getCilindrada()+"\n"+subaru.getEstanque().getCapacidad());

        //creamos un objeto diferente de la clase automovil
        Automovil mazda= new Automovil("Mazda","BT-50",ColorEnum.ROJO,new Motor(3.0,TipoMotor.DIESEL));
        mazda.setEstanque(new Estanque(45));
        System.out.println(mazda.getFabricante()+"\n"+mazda.getModelo()+"\n"+mazda.getColor()+"\n"+mazda.getMotor().getCilindrada());

        Motor motorNissan =new Motor(2.0,TipoMotor.DIESEL);
        Automovil nissan=new Automovil("Nissan","Qhasqai",ColorEnum.AZUL,motorNissan,new Estanque(50));
        System.out.println(nissan.getFabricante()+"\n"+nissan.getModelo()+"\n"+nissan.getColor()+"\n"+nissan.getMotor().getCilindrada()+"\n"+nissan.getEstanque().getCapacidad());

        //Todos los objetos son distintos por muy parecido que sea
        Automovil nissan2=new Automovil("Nissan","Qhasqai",ColorEnum.AMARILLO,new Motor(3.5,TipoMotor.BENCINA),new Estanque(50));
        System.out.println("nissan ==nissan2?= "+(nissan==nissan2));
        System.out.println("nissan.equals(nissan2)?= "+(nissan.equals(nissan2)));

        //utilizando el metodo equal override
        System.out.println("nissan.equals(nissan2): son iguales con equalsIgnoreCase?= "+(nissan.equals(nissan2)));//compara el fabricante y el modelo.

        Automovil auto=new Automovil();
        Date fecha=new Date();
        System.out.println("Auto es igual a nissan?= "+auto.equals(nissan));
        //esto solo funcionará si sobre-escribimos el equals
        System.out.println("Auto es igual a fecha?= "+auto.equals(fecha));
        System.out.println("______________________________");

        System.out.println(subaru.verdetalle() + "\n"+mazda.verdetalle()+"\n"+nissan.verdetalle());
        System.out.println(subaru.acelerar(2000) + "\n"+mazda.acelerar(3000)+"\n"+nissan.acelerar(4000));
        System.out.println(subaru.frenar()+"\n"+mazda.frenar()+"\n"+nissan.frenar());
        System.out.println();
        System.out.println(subaru.acelerarFrenar(3000)+"\n"+mazda.acelerarFrenar(4000)+"\n"+nissan.acelerarFrenar(5000));
        System.out.println("Kilómetros por litro Subaru "+subaru.calcularConsumo(300,0.75)+"\n"+
                "Kilómetros por litro Mazda "+mazda.calcularConsumo(400,0.6)+"\n"+
                "Kilómetros por litro Nissan "+nissan.calcularConsumo(400,0.7));
        System.out.println();
        System.out.println("Kilómetros por litro Subaru "+subaru.calcularConsumo(300,2)+"\n"+
                "Kilómetros por litro Mazda "+mazda.calcularConsumo(400,2)+"\n"+
                "Kilómetros por litro Nissan "+mazda.calcularConsumo(400,2));
        System.out.println("___________________");
        //Metodo ToString
        System.out.println("Identificador de nissan: "+nissan);//imprimimos el identificador, solo sale si no hemos hecho el override de ToString
        System.out.println("Metodo toString de nissan: "+nissan.toString());//para esto debemos sobre-escribir el metodo ToString

    }
}
