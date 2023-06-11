import java.util.Scanner;

public class Main {
    /**
     * Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
     * equivalente en romano.
     *
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num =0;
        System.out.println("Ingrese un numero del 1 al 10 para devolver su equivalente en romano");
        num = scan.nextInt();
        while(num < 1 || num > 10){
            System.out.println("Numero incorrecto vuelva a ingresar un numero del 1 al 10");
            num = scan.nextInt();
        }
        switch (num) {
            case 1 -> System.out.println("I");
            case 2 -> System.out.println("II");
            case 3 -> System.out.println("III");
            case 4 -> System.out.println("IV");
            case 5 -> System.out.println("V");
            case 6 -> System.out.println("VI");
            case 7 -> System.out.println("VII");
            case 8 -> System.out.println("VIII");
            case 9 -> System.out.println("IX");
            case 10 -> System.out.println("X");
            default -> System.out.println("Numero incorrecto");
        }
        System.out.println("ADIOS");



    }
}