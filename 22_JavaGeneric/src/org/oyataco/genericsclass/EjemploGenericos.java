package org.oyataco.genericsclass;

public class EjemploGenericos {
    public static void main(String[] args) {
        //indicamos el tipo de dato que va a contener el Camion
        Camion<Animal> transporteCaballos=new Camion<>(5);

        transporteCaballos.add(new Animal("Peregrino","Caballo"));
        transporteCaballos.add(new Animal("grillo","caballo"));
        transporteCaballos.add(new Animal("Tunquenq","Caballo"));
        transporteCaballos.add(new Animal("Topocalma","Caballo"));
        transporteCaballos.add(new Animal("FuegoLibre","Caballo"));

        //transporteCaballos.forEach(System.out::println); //Este no serviría ya que tendríamos que imprimir objetos y estamos imprimiendo Animal
        //for (Animal a:transporteCaballos)//este es el mismo caso distinta forma del for
        //for (Camion c:transporteCaballos)// La misma situacion con Camion, requiere un object ya que trabajamos con Object
        for (Animal a : transporteCaballos){

            System.out.println(a.getNombre()+" /tipo: "+ a.getTipo());
        }

        Camion <Maquinaria>transportMaquina=new Camion<>(3);
        transportMaquina.add(new Maquinaria("Bulldozer"));
        transportMaquina.add(new Maquinaria("Grúa Horquilla"));
        transportMaquina.add(new Maquinaria("Perforadora"));

        for (Maquinaria m : transportMaquina){

            System.out.println(m.getTipo());
        }

        Camion <Automovil>transportAuto=new Camion<>(3);
        transportAuto.add(new Automovil("Toyota"));
        transportAuto.add(new Automovil("Mitsubishi"));
        transportAuto.add(new Automovil("Chevrolet"));

        for (Automovil o : transportAuto){

            System.out.println(o.getMarca());
        }
    }
}
