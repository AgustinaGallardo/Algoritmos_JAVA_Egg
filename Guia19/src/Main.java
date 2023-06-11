import java.util.Scanner;

public class Main {
    /**
     * Guia 19
     * Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
     * matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
     * signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
     * denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el tamaño que tendrá la matriz");
        int n = scan.nextInt();
        int[][] matriz = new int[n][n];
        cargarMatriz(matriz,n);
        mostrarMatriz(matriz,n);
        int[][] transpuesta = calcularTranspuesta(matriz,n);
        mostrarMatriz(transpuesta,n);
        boolean esAntiSimetrica = esAntiSimetrica(matriz, transpuesta,n);
        if (esAntiSimetrica) {
            System.out.println("Es una matriz antisimétrica");
        } else {
            System.out.println("No es una matriz antisimétrica");
        }
    }
    public static int[][] cargarMatriz(int[][] matriz,int n) {
        System.out.println("Ingrese los numeros que formaran la matriz");
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = scan.nextInt();
            }
        }
        return matriz;
    }
    public static void mostrarMatriz(int[][] matriz,int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static int[][] calcularTranspuesta(int[][] matriz, int n) {
        int[][] transpuesta = new int[4][4];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                transpuesta[i][j] = matriz[j][i];
            }
        }
        return transpuesta;
    }
    public static boolean esAntiSimetrica(int[][] matriz, int[][] transpuesta, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] == transpuesta[i*-1][j*-1]) {
                    return true;
                }
            }
        }
        return false;
    }
}
