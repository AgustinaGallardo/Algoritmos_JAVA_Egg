import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java.

         */

        Scanner scan = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese la contraseña");
        frase = scan.nextLine();

        if(frase.length() == 8){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }


    }
}