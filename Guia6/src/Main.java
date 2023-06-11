import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* EJERCICIO 6
        6. Crear un programa que dado un numero determine si es par o impar.
         */
        Scanner scan = new Scanner(System.in);
        Integer num;
        System.out.println("Ingrese un numero");
        num = scan.nextInt();

        if(num % 2 ==0){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
    }
}