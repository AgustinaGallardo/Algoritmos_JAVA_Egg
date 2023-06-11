import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * Ejercicio9
         * Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
         * bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el
         * resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
         */

        Scanner scan = new Scanner(System.in);
        Integer num1;
        Integer suma;
        suma=0;

        do{
            System.out.println("Ingrese un numero");
            num1 = scan.nextInt();
            if(num1>0){
                suma += num1;
            }
        }while(num1 != 0);
        System.out.println("Se capturo el numero 0. La suma de todos los numeros es de: " + suma);
    }
}