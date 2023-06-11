import java.util.Scanner;

public class Main {
    /**
     * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
     * Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese una letra");
        String letraIN = scan.nextLine();
        String letra = letraIN.toLowerCase();
        if(letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")){
            System.out.println("La letra ingresada es una vocal");
        }else{
            System.out.println("La letra ingresada es una consonante");
        }







    }
}