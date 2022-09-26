import java.util.Scanner;

public class ArrayDesplazarPosicion {
    public static void main(String[] args) {
        //Queremos el valor pase al siguiente indice y así sucesivamente
        Scanner sc=new Scanner(System.in);

        int[] numeros=new int[10];
        int ultimo;

        for (int i = 0; i < numeros.length ; i++) {
            System.out.println(+i+"- Ingrese un elemento:");
            numeros[i]=sc.nextInt();
        }

        ultimo=numeros[numeros.length-1];//obtenemos el valor del indice 9 es decir su valor es igual a=10
        //ahora tenemos que partir del penultimo, es decir del indice 8 que contiene el valor 9
        for (int i = (numeros.length-2); i >=0 ; i--) {
        numeros[i+1]=numeros[i];//entonces el valor actual se lo asignamos al i+1, por lo que el valor del indice 8 pasa al indice 9

        }
        numeros[0]=ultimo;// en la posicion 0 tiene que valer 10

        System.out.println("El arreglo:");
        for (int i = 0; i < numeros.length ; i++) {
            System.out.println("Indice "+i+": "+numeros[i]);

        }


    }
}
