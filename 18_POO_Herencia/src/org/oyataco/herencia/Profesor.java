package org.oyataco.herencia;

public class Profesor extends Persona{

    private String asignatura;


    //Constructor
    public Profesor(){

    }

    public Profesor(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Profesor(String nombre, String apellido, String asignatura) {
        super(nombre, apellido);
        this.asignatura = asignatura;
    }

    public Profesor(String nombre, String apellido, int edad, String asignatura) {
        super(nombre, apellido, edad);
        this.asignatura = asignatura;
    }



    //Getter&Setter

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }



    //Methods

    @Override
    public String saludar() {
        return "Buenos días soy el profesor "+getNombre()+" de "+getAsignatura();
    }


    @Override
    public String toString() {
        return super.toString()+
                "\nasignatura='" + asignatura + '\'';
    }
}
