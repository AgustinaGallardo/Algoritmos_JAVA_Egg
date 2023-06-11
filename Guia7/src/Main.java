import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         /* EJERCICIO 7
         Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
    pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
        la función equals() en Java.

         */
        Scanner scan = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese la contraseña");
        frase = scan.nextLine();


        if(frase.equals("Eureka")){
            System.out.println("Bienvenido");
        }else{
            System.out.println("No sabes la clave");
        }
    }
}