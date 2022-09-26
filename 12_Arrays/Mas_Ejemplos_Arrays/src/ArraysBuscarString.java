import java.util.Scanner;

public class ArraysBuscarString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[]texto=new String[10];


        for (int i = 0; i <texto.length ; i++) {
            System.out.println("Ingrese un texto");
            texto[i]=sc.nextLine();
        }

        System.out.println("\nIngrese el texto a buscar:");
        String textoBuscado= sc.nextLine();
        int contador=0;
        //Mientras que el contador sea menor que la longitud, y el valor de numero sea distinto del numero buscado hará:
        while(contador<texto.length && texto[contador].equalsIgnoreCase(textoBuscado) ){
            contador++;
        }

        if (contador==texto.length){
            System.out.println("Texto no encontrado");
        } else if (texto[contador].equalsIgnoreCase(textoBuscado)) {
            System.out.println("Encontrado en la posicion "+contador);
        }
    }
}
