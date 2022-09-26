import java.util.Scanner;

public class ArraysNotasAlumnos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        double[] claseMatematicas, claseHistoria, claseLenguaje;
        double sumNotaMatematicas=0, sumNotaHistoria=0, sumNotaLenguaje=0;

        claseMatematicas=new double[7];
        claseHistoria=new double[7];
        claseLenguaje=new double[7];

        System.out.println("Ingresa 7 notas de estudiantes para matemáticas");
        //Añadimos las notas de la asignatura
        for(int i=0;i< claseMatematicas.length;i++){
            claseMatematicas[i]=sc.nextDouble();
        }
        //Añadimos las notas de la asignatura
        System.out.println("Ingresa 7 notas de estudiantes para Historia");
        for (int i = 0; i <claseHistoria.length ; i++) {
            claseHistoria[i]=sc.nextDouble();

        }
        //Añadimos las notas de la asignatura
        System.out.println("Ingresa 7 notas de estudiantes para lenguaje");
        for (int i = 0; i <claseLenguaje.length ; i++) {
            claseLenguaje[i]=sc.nextDouble();
        }
        //matematicas:
        for (int i = 0; i <claseMatematicas.length ; i++) {
            sumNotaMatematicas=sumNotaMatematicas+claseMatematicas[i];
        }
        //historia:
        for (int i = 0; i <claseHistoria.length ; i++) {
            sumNotaHistoria+=claseHistoria[i];
        }
        //Lenguaje:
        for (int i = 0; i <claseLenguaje.length ; i++) {
            sumNotaLenguaje+=claseLenguaje[i];
        }
        System.out.println("Promedio clase Matemáticas= "+(sumNotaMatematicas/claseMatematicas.length));
        System.out.println("Promedio clase Historia= "+(sumNotaHistoria/claseHistoria.length));
        System.out.println("Promedio clase Lenguaje= "+(sumNotaLenguaje/claseLenguaje.length));
        System.out.println("Promedio general de asignaturas:= "+(sumNotaMatematicas+sumNotaHistoria+sumNotaLenguaje)/((
                                                claseMatematicas.length+claseHistoria.length+claseHistoria.length)/3));



    }
}
