import java.util.Scanner;

public class ArraysNumeroMayor {
    public static void main(String[] args) {
        int []array1=new int[5];

        Scanner sc=new Scanner(System.in);


        for (int i = 0; i < array1.length; i++) {
            System.out.println("Ingrese 1 entero :");
            array1[i]=sc.nextInt();
        }

        int numeroMax=0;

        for (int i = 1; i < array1.length; i++) {
            numeroMax=(array1[numeroMax]>array1[i])?  numeroMax:i;

        }
        System.out.println("array1[numeroMax] = " + array1[numeroMax]);
    }
}