import java.util.Scanner;

public class Main {

    /**
     * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
     * cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
     *  * * * *
     *  *     *
     *  *     *
     *  * * * *
     *
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del cuadrado");
        int n=scan.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}


