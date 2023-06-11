import java.util.Scanner;

public class Main {
    /**
     * Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
     * de n números (n>0). El valor de n se solicitará al principio del programa y los números
     * serán introducidos por el usuario. Realice dos versiones del programa, una usando el
     * bucle “while” y otra con el bucle “do - while”.
     *
     *
     *
     *
     * WHILE:
     *  Scanner scan = new Scanner(System.in);
     *         int total = 0;
     *         double prom = 0.0;
     *         int numMayor = Integer.MIN_VALUE;
     *         int numMenor = Integer.MAX_VALUE;
     *         System.out.println("Ingrese la cantidad de numeros que quiere probar");
     *         int N = scan.nextInt();
     *         int i = 0;
     *         while(i < N ) {
     *             System.out.println("Ingrese numeros");
     *             int num = scan.nextInt();
     *             total += num;
     *             if (num > numMayor) {
     *                 numMayor = num;
     *             }
     *             if (num < numMenor) {
     *                 numMenor = num;
     *             }
     *             i++;
     *         }
     *         prom = (double) total / N;
     *         System.out.println("El valor máximo ingresado es: " + numMayor + ", el valor mínimo " + numMenor +
     *                 " y el promedio de " + N + " números (n>0) es de: " + prom);
     *
     *
     *   DO-WHILE:
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int total = 0;
        double prom = 0.0;
        int numMayor = Integer.MIN_VALUE;
        int numMenor = Integer.MAX_VALUE;
        System.out.println("Ingrese la cantidad de numeros que quiere probar");
        int N = scan.nextInt();
        int i = 0;
        do{
            System.out.println("Ingrese numeros");
            int num = scan.nextInt();
            total += num;
            if (num > numMayor) {
                numMayor = num;
            }
            if (num < numMenor) {
                numMenor = num;
            }
            i++;
        }
        while(i < N );
        prom = (double) total / N;
        System.out.println("El valor máximo ingresado es: " + numMayor + ", el valor mínimo " + numMenor +
                " y el promedio de " + N + " números (n>0) es de: " + prom);
    }
}