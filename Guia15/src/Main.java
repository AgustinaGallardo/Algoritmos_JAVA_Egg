import java.util.Scanner;

public class Main {

    /**
     * Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
     * muestre por pantalla en orden descendente.
     *
     */
    public static void main(String[] args) {

        int vector[] = new int[3];

        for(int i = 0; i < vector.length;i++){
            vector[i]=(int)(Math.random()*99+1);
            System.out.println(vector[i]);
        }
        System.out.println("-------------------");
        for(int i= vector.length-1;i >= 0;i--){
            System.out.println(vector[i]);
        }
    }
}