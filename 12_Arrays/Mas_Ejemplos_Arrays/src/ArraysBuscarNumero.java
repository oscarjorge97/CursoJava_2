import java.util.Scanner;

public class ArraysBuscarNumero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]numeros=new int[10];


        for (int i = 0; i <numeros.length ; i++) {
            System.out.println("Ingrese un número");
            numeros[i]=sc.nextInt();
        }

        System.out.println("\nIngrese un número a buscar:");
        int numeroBuscado= sc.nextInt();
        int contador=0;
        //Mientras que el contador sea menor que la longitud, y el valor de numero sea distinto del numero buscado hará:
        while(contador<numeros.length && numeros[contador]!=numeroBuscado){
            contador++;
        }

        if (contador==numeros.length){
            System.out.println("Número no encontrado");
        } else if (numeros[contador]==numeroBuscado) {
            System.out.println("Encontrado en la posicion "+contador);
        }
    }
}
