import java.util.Scanner;

public class Main {
    /**
     * Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
     * usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
     * numero y si se encuentra repetido
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el numero del vector");
        int n = scan.nextInt();
        int[] vector = new int[n];

        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 99 + 1);
            System.out.println(vector[i]);
        }
        System.out.println("Ingrese que numero quiere buscar en el vector");
        int num = scan.nextInt();

        boolean encontrado=false;
        boolean repetido = false;
        for (int i = 0; i < n; i++) {
            if (vector[i] == num) {
               System.out.println("El numero se encuentra en la posicion " + i );
                encontrado = true;
                if (i != 0 && vector[i] == num) {
                   repetido = true;
                }
            }
        }
            if(!encontrado){
                System.out.println("El numero no se encuentra en el vector");
            }
            if(!repetido){
                System.out.println("No se encuentra repetido en el vector");
            }else {
                System.out.println("Se encuentra repetido en el vector");
            }
    }
}