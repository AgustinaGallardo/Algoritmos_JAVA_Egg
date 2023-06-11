import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*
        Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
         */


        Scanner scan = new Scanner(System.in);

        int limitePositivo;
        int num;
        int suma=0;
        System.out.println("Ingrese el limite positivo");
        limitePositivo = scan.nextInt();

        do{
            System.out.println("Ingrese numero");
            num= scan.nextInt();
            suma += num;
        }while(limitePositivo >= suma);

        System.out.println("La suma fue de : " + suma + " y el limite positivo " + limitePositivo);

    }
}