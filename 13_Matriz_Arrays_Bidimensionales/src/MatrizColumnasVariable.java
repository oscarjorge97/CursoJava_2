public class MatrizColumnasVariable {
    public static void main(String[] args) {
        int[][]matriz=new int[3][];
        matriz[0]=new int[2];//aquí indicamos que la primera fila tendrá dos columnas
        matriz[1]=new int[3];
        matriz[2]=new int[4];

        System.out.println("Cantidad de filas: "+matriz.length);
        System.out.println("Fila 0 columnas= "+matriz[0].length);
        System.out.println("Fila 1 columnas= "+matriz[1].length);
        System.out.println("Fila 2 columnas= "+matriz[2].length);

        //añadimos valores
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j]=i*j;
            }
        }


        for (int i = 0; i < matriz.length ; i++) {
            for (int j=0;j<matriz[i].length;j++){
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
