import java.util.Scanner;

public class Main {
    /**
     * Guia18
     * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
     * traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
     * cambiando sus filas por columnas (o viceversa).
     *
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matriz= new int[4][4];
        cargarMatriz(matriz);
        mostrarMatriz(matriz);
        int[][] transpuesta = calcularTranspuesta(matriz);
        mostrarMatriz(transpuesta);
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
    public static int[][] calcularTranspuesta(int[][] matriz){
        int[][] transpuesta = new int[4][4];
        for(int i = 0; i< matriz.length;i++){
            for(int j = 0; j < matriz[i].length; j++){
                transpuesta[i][j] = matriz[j][i];
            }
        }
        return transpuesta;
    }
}