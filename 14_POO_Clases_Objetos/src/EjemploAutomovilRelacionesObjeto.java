public class EjemploAutomovilRelacionesObjeto {
    public static void main(String[] args) {

        Rueda[] ruedasSubaru=new Rueda[5];
        ruedasSubaru[0]=new Rueda("Yokohama",16,7.5);
        ruedasSubaru[1]=new Rueda("Yokohama",16,7.5);
        ruedasSubaru[2]=new Rueda("Yokohama",16,7.5);
        ruedasSubaru[3]=new Rueda("Yokohama",16,7.5);
        ruedasSubaru[4]=new Rueda("Yokohama",16,7.5);
        Persona personaSubaru=new Persona("Luci","Martínez");
        Automovil subaru=new Automovil("Subaru","Impreza");

        subaru.setColor(ColorEnum.BLANCO);
        subaru.setMotor(new Motor(2.0,TipoMotor.DIESEL));
        subaru.setTipo(TipoEnum.HATCHBACK);
        subaru.setPersona(personaSubaru);
        subaru.setRuedas(ruedasSubaru);

        Rueda[] ruedasMazda=new Rueda[5];
        ruedasMazda[0]=new Rueda("Michelin",18,10.5);
        ruedasMazda[1]=new Rueda("Michelin",18,10.5);
        ruedasMazda[2]=new Rueda("Michelin",18,10.5);
        ruedasMazda[3]=new Rueda("Michelin",18,10.5);
        ruedasMazda[4]=new Rueda("Michelin",18,10.5);
        Persona personaMazda=new Persona("Pato","Rodriguez");
        Automovil mazda= new Automovil("Mazda","BT-50", ColorEnum.ROJO,new Motor(2.0,TipoMotor.DIESEL));
        mazda.setTipo(TipoEnum.PICKUP);
        mazda.setPersona(personaMazda);
        mazda.setRuedas(ruedasMazda);

        Rueda[] ruedasNissan=new Rueda[5];
        ruedasNissan[0]=new Rueda("Pirelli",20,11.5);
        ruedasNissan[1]=new Rueda("Pirelli",20,11.5);
        ruedasNissan[2]=new Rueda("Pirelli",20,11.5);
        ruedasNissan[3]=new Rueda("Pirelli",20,11.5);
        ruedasNissan[4]=new Rueda("Pirelli",20,11.5);
        Persona personaNissan=new Persona("Bea","Gonzalez");
        Automovil nissan=new Automovil("Nissan","Qhasqai", ColorEnum.AZUL,new Motor(3.0,TipoMotor.DIESEL),new Estanque(),personaNissan,ruedasNissan);
        nissan.setTipo(TipoEnum.COUPE);

        Rueda[] ruedasNissan2=new Rueda[5];
        ruedasNissan[0]=new Rueda("Pirelli",20,11.5);
        ruedasNissan[1]=new Rueda("Pirelli",20,11.5);
        ruedasNissan[2]=new Rueda("Pirelli",20,11.5);
        ruedasNissan[3]=new Rueda("Pirelli",20,11.5);
        ruedasNissan[4]=new Rueda("Pirelli",20,11.5);
        Persona personaNissan2=new Persona("Lalo","Mena");
        Automovil nissan2=new Automovil("Nissan","Qhasqai", ColorEnum.GRIS,new Motor(5.0,TipoMotor.DIESEL),new Estanque(50),personaNissan2,ruedasNissan2);
        Automovil.setColorPatente(ColorEnum.NARANJA);
        nissan2.setTipo(TipoEnum.PICKUP);

        Automovil auto=new Automovil();

        System.out.println("______________________________");

        System.out.println(subaru.verdetalle()+"\n"+
                    "\n"+mazda.verdetalle()+"\n"+
                    "\n"+nissan.verdetalle());








    }
}
