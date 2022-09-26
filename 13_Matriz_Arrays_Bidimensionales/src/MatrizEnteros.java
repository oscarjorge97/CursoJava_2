public class MatrizEnteros {
    public static void main(String[] args) {
        //El primer corchete corresponde a las filas
        //el segundo corchete corresponde a las columnas
        /* Para saber el numero de filas y columnas:
        System.out.println("numero de filas= "+numeros.length);
        System.out.println("numero de columnas= "+numeros[numero de la fila].length);
         */

        /* Para leer un valor se lo asignamos a una variable
        int numero1=numeros[0][0];      Producto mesa=productos[0][0];
        int numero2=numeros[0][1];      Producto tvSony=productos[1][0];
        int numero3=numeros[0][2];      Producto bici=productos[2][0];
         */
        /*Otra forma de inicializar, separados por una coma
        int[][] numeros={ {1,2,3,4},{11,12,13,14} } //primera fila tendra en la columna 0 valor=1, columna 1 valor=2...segunda fila columna 0 valor=11...
        */

        /*Para recorrer la matriz hacemos bucle anidado
         for (int i=0; i<numeros.length;i++){
            for(int j=0; j<numeros[i].length;j++){
                System.out.println("numero= "+numeros[i][j]);
            }
         }
        */

        int[][] numeros=new int[2][4];
        numeros[0][0]=1;
        numeros[0][1]=2;
        numeros[0][2]=3;
        numeros[0][3]=4;

        numeros[1][0]=11;
        numeros[1][1]=12;
        numeros[1][2]=13;
        numeros[1][3]=14;

        System.out.println("numeros de filas: "+numeros.length);
        System.out.println("numero de columnas: "+numeros[0].length);
        System.out.println("primer elemento de la matriz:"+numeros[0][0]);
        System.out.println("ultimo elemento de la matriz: "+numeros[numeros.length-1][numeros[1].length-1]);

        int num1=numeros[0][0];
        int num2=numeros[0][1];
        int num3=numeros[0][2];
        int num4=numeros[0][3];

        int num5=numeros[1][0];
        int num6=numeros[1][1];
        int num7=numeros[1][2];
        int num8=numeros[1][3];

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);
        System.out.println("num7 = " + num7);
        System.out.println("num8 = " + num8);
    }
}
