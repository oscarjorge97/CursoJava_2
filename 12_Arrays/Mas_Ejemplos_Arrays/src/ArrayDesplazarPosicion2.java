import java.util.Scanner;

public class ArrayDesplazarPosicion2 {
    public static void main(String[] args) {
        //Queremos el valor pase al siguiente indice y así sucesivamente excepto el último con el fin de utilizarlo para agregar cosas
        Scanner sc=new Scanner(System.in);

        int[] numeros=new int[10];
        int elemento,posicion;

        for (int i = 0; i < numeros.length-1 ; i++) {//length -1 para agregar solo 9 posiciones
            System.out.println(+i+"- Ingrese un elemento:");
            numeros[i]=sc.nextInt();
        }

        System.out.println("Introduzca un nuevo elemento");
        elemento= sc.nextInt();

        System.out.println("Posición donde agregar (de 0 a 9)");
        posicion=sc.nextInt();

        for (int i = (numeros.length-2); i >=posicion ; i--) {
        numeros[i+1]=numeros[i];//entonces el valor actual se lo asignamos al i+1, por lo que el valor del indice 8 pasa al indice 9

        }

        numeros[posicion]=elemento;// en la posicion 0 tiene que valer 10

        System.out.println("El arreglo:");
        for (int i = 0; i < numeros.length ; i++) {
            System.out.println("Indice "+i+": "+numeros[i]);

        }


    }
}
