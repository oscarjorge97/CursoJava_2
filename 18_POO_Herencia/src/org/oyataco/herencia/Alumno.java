package org.oyataco.herencia;

public class Alumno extends Persona{

    private String instituto;
    private double notaMatematica;
    private double notaCastellano;
    private double notaHistoria;




    //Constructor
    public Alumno (){

    }

    public Alumno(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Alumno(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    public Alumno(String nombre, String apellido, int edad, String instituto) {
        super(nombre, apellido, edad);
        this.instituto = instituto;
    }

    public Alumno(String instituto, double notaMatematica, double notaCastellano, double notaHistoria, String nombre, String apellido, int edad) {
        super(nombre,apellido,edad);
        this.instituto = instituto;
        this.notaMatematica = notaMatematica;
        this.notaCastellano = notaCastellano;
        this.notaHistoria = notaHistoria;
    }



    //Getter&Setter
    public String getInstituto() {
        return instituto;
    }

    public void setInstituto(String instituto) {
        this.instituto = instituto;
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public double getNotaCastellano() {
        return notaCastellano;
    }

    public void setNotaCastellano(double notaCastellano) {
        this.notaCastellano = notaCastellano;
    }

    public double getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }



    //Methods

    @Override
    public String saludar() {
        String saludar=super.saludar()+" soy un alumno y mi nombre es "+getNombre();
        return saludar;
    }

    public double calcularPromedio(){

        return (getNotaCastellano()+getNotaHistoria()+getNotaMatematica())/3;
    }


    @Override
    public String toString() {
        return super.toString()+
                "\ninstituto='" + instituto + '\'' +
                ", notaMatematica=" + notaMatematica +
                ", notaCastellano=" + notaCastellano +
                ", notaHistoria=" + notaHistoria+
                ", promedio=" + this.calcularPromedio();
    }
}
