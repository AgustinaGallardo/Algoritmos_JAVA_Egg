import java.util.Scanner;

public class Main {
    /**
     * Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
     * 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
     * dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
     * se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
     * que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
     * la matriz M en la cual empieza el primer elemento de la submatriz P.
     *
     */
    public static void main(String[] args) {
        int[][] matrizM= new int[10][10];
        int[][] matrizP= new int[3][3];
        cargarMatriz(matrizM);
        cargarMatriz(matrizP);
        mostrarMatriz(matrizM);
        mostrarMatriz(matrizP);
        boolean encontrada = buscarSubmatriz(matrizM, matrizP);
        if (encontrada) {
            System.out.println("La submatriz P está contenida en la matriz M.");
        } else {
            System.out.println("La submatriz P no está contenida en la matriz M.");
        }
    }
    public static int[][] cargarMatriz(int[][] matriz){
        for(int i = 0; i  < matriz.length;i++){
            for(int j = 0; j < matriz.length; j++){
                matriz[i][j]=(int) (Math.random()*99 +1);
            }
        }
        return matriz;
    }
    public static void mostrarMatriz(int[][] matriz){
        for(int i = 0; i < matriz.length;i++){
            for(int j = 0; j< matriz[i].length; j++){
                System.out.print( matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static boolean buscarSubmatriz(int[][] matrizM, int[][] matrizP) {

        //le resto a la matrizM la matriz P para calcular la dimencion de lo que tiene q comparar
        for (int i = 0; i <= matrizM.length - matrizP.length; i++) {
            for (int j = 0; j <= matrizM[0].length - matrizP[0].length; j++) {
                //llamo a matodo esSubmatriz para comprobar y le paso el indice
                if (esSubmatriz(matrizM, matrizP, i, j)) {
                    System.out.println("La submatriz P comienza en la fila " + i + " y columna " + j);
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean esSubmatriz(int[][] matrizM, int[][] matrizP, int filaInicio, int columnaInicio) {
        for (int i = 0; i < matrizP.length; i++) {
            for (int j = 0; j < matrizP[0].length; j++) {
                if (matrizM[filaInicio + i][columnaInicio + j] != matrizP[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }


}