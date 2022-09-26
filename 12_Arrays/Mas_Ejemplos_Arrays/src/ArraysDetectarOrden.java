import java.util.Scanner;

public class ArraysDetectarOrden {
    public static void main(String[] args) {

        int[] numeros=new int[7];
        Scanner sc=new Scanner(System.in);

        System.out.println("Ingrese 7 números: ");

        for (int i= 0;i< numeros.length; i++) {

        numeros[i]=sc.nextInt();
        }

    boolean ascendente= false;
        boolean descendente=false;
        for (int i = 0; i <numeros.length-1 ; i++) {    //tiene que ser numeros.length-1 porque vamos a compararlo con el elemento siguiente,y compararemos elpenultimo con el ultimo
                                                        //ademas si llegamos al ultimo vamos a comparar con un +1 y nos dirá que se desbordó.
             if (numeros[i]>numeros[i+1]){
                 descendente=true;
             } else if (numeros[i]<numeros[i+1]) {
                 ascendente=true;
             }
        }
        if (ascendente==true && descendente==true){
            System.out.println("Arreglo= desordenado");
        } else if (ascendente==false && descendente==false) {
            System.out.println("Arreglo= todos son iguales");
        } else if (ascendente==true && descendente==false) {
            System.out.println("arreglo= ordenado de forma ascendente");
        } else if (ascendente == false && descendente == true) {
            System.out.println("arreglo= ordenado de forma descendente");
        }


    }
}
