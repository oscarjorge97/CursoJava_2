public class MatrizSimetrica {
    public static void main(String[] args) {
        boolean simetrica=true;
        int[][] matriz={
            {1,2,3,4},
            {2,1,0,5},
            {3,0,1,6},
            {4,5,6,7}
        };
        int i=0;
        int j=0;
        salir:
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j <i ; j++) {
                if (matriz[i][j]!=matriz[j][i]){
                 simetrica=false;
                 break salir;
                }
            }
        }

        if (simetrica==true){
            System.out.println("La matriz es simetrica");
        }else{
            System.out.println("La matriz no es simetrica");
        }
    }
}
