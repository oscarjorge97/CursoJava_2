package org.oyataco.sobrecarga;

public class Calculadora {


    public int sumar (int a, int b){
        return a+b;
    }
    public double sumar (double a, double b){
        return a+b;
    }
    public double sumar (int a, double b){
        return a+b;
    }
    public double sumar (double a, int b){
        return a+b;
    }
    public int sumar (String a, String b){
        int resultado;
        try {
            resultado=Integer.parseInt(a) +Integer.parseInt(b);
        }catch (NumberFormatException e){
            resultado=0;
        }
        return resultado;
    }
    public int sumar (int a, int b, int c){
        return a+b+c;
    }

}
