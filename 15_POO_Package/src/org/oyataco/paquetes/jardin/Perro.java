package org.oyataco.paquetes.jardin;

import org.oyataco.paquetes.hogar.Persona;

public class Perro {
    protected String nombre;
    protected String raza;

    //methods
    String jugar(Persona persona){
        return persona.lanzarPelota();
    }
}
