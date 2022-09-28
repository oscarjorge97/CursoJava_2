package org.oyataco.herencia;

public class AlumnoInternacional extends Alumno{    //está heredando de Alumno y también de Persona
    private String pais;
    private double notaIdiomas;



    //Constructor
    public AlumnoInternacional(){

    }

    public AlumnoInternacional(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public AlumnoInternacional(String nombre, String apellido, String pais) {
        super(nombre, apellido);
        this.pais = pais;
    }

    public AlumnoInternacional(String pais, double notaIdiomas) {
        this.pais = pais;
        this.notaIdiomas = notaIdiomas;
    }

    public AlumnoInternacional(String instituto, double notaMatemacica, double notaCastellano, double notaHistoria, String nombre, String apellido, int edad, String pais, double notaIdiomas) {
        super(instituto, notaMatemacica, notaCastellano, notaHistoria, nombre, apellido, edad);
        this.pais = pais;
        this.notaIdiomas = notaIdiomas;
    }


    //Getter&Setter

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getNotaIdiomas() {
        return notaIdiomas;
    }

    public void setNotaIdiomas(double notaIdiomas) {
        this.notaIdiomas = notaIdiomas;
    }



    //Methods

    @Override
    public String saludar() {
        String saludar=super.saludar()+", extranjero del pais "+getPais()+" mi nombre "+getNombre();
        return saludar;
    }

    @Override
    public double calcularPromedio() {
        return (super.calcularPromedio()*3)/4;
    }


    @Override
    public String toString() {
        return super.toString()+
                "\npais='" + pais + '\'' +
                ", notaIdiomas=" + notaIdiomas;
    }
}
