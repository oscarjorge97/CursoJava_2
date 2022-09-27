package org.oyataco.paquetes.jardin;
//Hacemos un import para poder usar la clase aunque esté dentro de otro paquete
import org.oyataco.paquetes.hogar.*;
import static org.oyataco.paquetes.hogar.Persona.saludar; //importando metodo saludar
import static org.oyataco.paquetes.hogar.Persona.GENERO_FEMENINO;
import static org.oyataco.paquetes.hogar.Persona.GENERO_MASCULINO;
import static org.oyataco.paquetes.hogar.ColorPelo.*;


public class EjemploPaquetes {
    public static void main(String[] args) {
        Persona persona=new Persona();
        persona.setNombre("Andrés");
        persona.setApellido("García");
        persona.setColorPelo(CAFE);
        System.out.println(persona.getNombre()+" "+persona.getApellido());

        Perro perro=new Perro();
        perro.nombre="Fox";
        perro.raza="Podenco";
        //Gato gato=new Gato();

        String jugando=perro.jugar(persona);
        System.out.println("jugando = " + jugando);

        String saludo=saludar();
        System.out.println("saludo = " + saludo);

        String generoMujer=GENERO_FEMENINO;
        String generoHombre=GENERO_MASCULINO;
        System.out.println("generoHombre = " + generoHombre);
        System.out.println("generoMujer = " + generoMujer);

    }
}
