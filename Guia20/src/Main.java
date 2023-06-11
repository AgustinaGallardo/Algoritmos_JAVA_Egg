import java.util.Scanner;

public class Main {
    /**
     * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
     * suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
     * permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
     * El programa deberá comprobar que los números introducidos son correctos, es decir,
     * están entre el 1 y el 9.
     * @param args
     */
    public static void main(String[] args) {
        int [][] matriz = new int[3][3];
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese 9 numeros del 1 al 9 para completar la matriz");

        for(int i =0; i< matriz.length;i++){
            for(int j = 0; j < matriz[i].length;j++) {
                int num;
                do {
                    num = scan.nextInt();
                    if (num < 0 || num > 9) {
                        System.out.println("Numero incorrecto");
                    }
                } while (num < 1 || num > 9);
                matriz[i][j] = num;
            }
        }
        mostrarMatriz(matriz);

        boolean esMagica = esMatrizMagica(matriz);
        if(esMagica){
            System.out.println("Es una matriz magica");
        }else{
            System.out.println("No es una matriz magica");
        }
    }
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean  esMatrizMagica(int[][] matriz){
        int sumaReferencia = 0;
        //primera fila como referencia
        for(int j =0; j< matriz[0].length;j++){
            sumaReferencia += matriz[0][j];
        }
        //por filas
        for (int i = 1; i < matriz.length; i++) {
            int sumaFila = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                sumaFila += matriz[i][j];
            }
            if (sumaFila != sumaReferencia) {
                return false;
            }
        }
            //por col
            for (int j = 0; j < matriz[0].length; j++) {
                int sumaCol = 0;
                for (int i = 0; i < matriz.length; i++) {
                    sumaCol += matriz[i][j];
                }

                if (sumaCol != sumaReferencia) {
                    return false;
                }
            }
            //por diagonales
        int sumaDiagonal1 = 0;
        int sumaDiagonal2 = 0;
        for (int i = 0; i < matriz.length; i++) {
            sumaDiagonal1 += matriz[i][i];
            sumaDiagonal2 += matriz[i][matriz.length - 1 - i];
        }

        if (sumaDiagonal1 != sumaReferencia || sumaDiagonal2 != sumaReferencia) {
            return false;
        }

        return true;
    }

}
