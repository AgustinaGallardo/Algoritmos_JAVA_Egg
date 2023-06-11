import java.util.Scanner;

public class Main {
    /**
     * Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
     * debajo de 1.60 mts. y el promedio de estaturas en general.
     *
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Cuantas personas estan registradas");
        int N = scan.nextInt();
        int menosAltura = 0;
        double promAlturas = 0.0;
        double promAlturaMenor = 0.0;
        for(int i = 1; i < N+1 ;i++){
            System.out.println("Ingrese la altura de la persona n° " + i);
            double altura = scan.nextDouble();
            promAlturas += altura;
            if(altura < 1.60){
                promAlturaMenor += altura;
                menosAltura++;
            }
        }
        System.out.println("El promedio de personas con una altura menor a 1.60 entre " + N + " personas es de "
                + promAlturaMenor/menosAltura + " y el promedio de altura de todas las personas regustradas es de " + promAlturas/N);
    }
}