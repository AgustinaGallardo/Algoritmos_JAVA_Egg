import java.util.Scanner;

public class Main {

    /**
     * 1. Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
     * usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
     *
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Cuantos minutos quiere calcular");
        int min = scan.nextInt();
        int dias, horas;
        horas = min/60;
        dias = horas/24;
        horas = horas % 24; //% (módulo) para obtener el redto de la división de horas entre 24
        System.out.println("El resultado para " + min + " minutos es de " + dias + " dia/s y " + horas + " hora/s.-");
    }

}