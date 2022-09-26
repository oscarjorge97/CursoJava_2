import java.util.Scanner;

public class ArraysParesImpares {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int[]array, pares, impares;
        int totalPares=0;
        int totalImpares=0;

        System.out.println("Ingresa 10 numeros:");
        array=new int[10];
        //agregamos los valores al array
        for (int i = 0; i < array.length; i++) {
            array[i]=sc.nextInt();
        }
        //verificamos pares e impares y los contamos
        for (int i = 0; i <array.length ; i++) {
            if (array[i]%2==0){
                totalPares++;
            } else if (array[i]%2!=0) {
                totalImpares++;
            }
        }
        pares=new int[totalPares];
        impares=new int[totalImpares];

        int aumentoPar=0;
        int aumentoImpar=0;

        for (int i = 0; i <array.length ; i++) {
            if (array[i]%2==0){
                pares[aumentoPar++]=array[i];
            } else if (array[i]%2!=0) {
                impares[aumentoImpar++]=array[i];
            }
        }

        System.out.println("Para los pares: ");
        for (int i = 0; i < pares.length; i++) {
            System.out.print(pares[i]+ " ");
        }
        System.out.println();

        System.out.println("Para los impares: ");
        for (int i = 0; i <impares.length ; i++) {
            System.out.print(impares[i]+" ");
        }
    }
}
