import java.util.Scanner;

public class Main {
    /** Ejercicio 17:
     * Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
     * de 2 dígitos, etcétera (hasta 5 dígitos).
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cincoDig = 0;
        int cuatroDig = 0;
        int tresDig = 0;
        int dosDig = 0;
        int unDig = 0;
        System.out.println("Ingrese el numero del vector");
        int n = scan.nextInt();
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 99 + 1);
            System.out.println(vector[i]);

         int cantidadDig = cantidadDig(vector[i]);

            switch (cantidadDig){
            case 1:
                cincoDig ++;
                break;
            case 2:
                cuatroDig ++;
                break;
            case 3:
                tresDig ++;
                break;
            case 4:
                dosDig ++;
                break;
            case 5:
                unDig ++;
                break;
            }
        }
        System.out.println("La cantidad de 5 digitos " + cincoDig +
                ". La cantidad de 4 digitos " + cuatroDig +
                ". La cantidad de 3 digitos " + tresDig +
                ". La cantidad de 2 digitos " + dosDig +
                ". La cantidad de 1 digitos " + unDig);
    }
    public static int cantidadDig(int numero){
        if (numero < 10) {
            return 1;
        } else if (numero < 100) {
            return 2;
        } else if (numero < 1000) {
            return 3;
        } else if (numero < 10000) {
            return 4;
        } else {
            return 5;
        }
    }
}