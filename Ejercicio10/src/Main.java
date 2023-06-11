import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * EJERCICIO 10
         * Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
         * ingresado seguido de tantos asteriscos como indique su valor.
         */

        Scanner scann = new Scanner(System.in);

        Integer num1;
        Integer num2;
        Integer num3;
        Integer num4;


      do {
          System.out.println("ingrese 4 numeros");
              num1 = scann.nextInt();
              num2 = scann.nextInt();
              num3 = scann.nextInt();
              num4 = scann.nextInt();

      }while(num1 < 1 || num1 > 20 || num2 < 1 || num2 > 20 || num3 < 1 || num3 > 20 || num4 < 1 || num4 > 20);

        imprimirNum(num1);
        imprimirNum(num2);
        imprimirNum(num3);
        imprimirNum(num4);
    }


    public static void imprimirNum(Integer num){
        System.out.print(num);
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

}


