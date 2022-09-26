public class MatrizBuscarElemento {
    public static void main(String[] args) {
        int[][] matrizDeEnteros={ {35,90,3,1978},{15,2020,10,5},{677,127,32767,1999} };

        int elementoBuscar=32767;
        boolean encontrado=false;
        int i=0;//lo inicializamos fuera porque así lo podemos usar fuera del bucle
        int j=0;//lo inicializamos fuera porque así lo podemos usar fuera del bucle

        buscar: for (i = 0; i <matrizDeEnteros.length ; i++) {
            for (j = 0; j < matrizDeEnteros[i].length; j++) {
                if (matrizDeEnteros[i][j]==elementoBuscar){
                    encontrado=true;
                    break buscar;//con este break nos salimos del bucle for para que no siga buscando si se ha encontrado
                }
            }
        }
        if (encontrado==true){
            System.out.println("Encontrado "+elementoBuscar+ "en las cordenadas: "+i+","+j);
        }else {
            System.out.println(elementoBuscar+" no se encontró");
        }

    }
}
