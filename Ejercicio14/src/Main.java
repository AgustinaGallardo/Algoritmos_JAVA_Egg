import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* EJERCICIO 14
     Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo
         */
        Scanner scan = new Scanner(System.in);
        String [] equipo = new String[3];
        String nombre;

        System.out.println("ingrese los nombres de tu equipo");
        for(int i =0;i< equipo.length;i++){
            equipo[i] = scan.next();
        }

        mostrarEquipo(equipo);
    }
    public static void mostrarEquipo(String[] equipo){
        for(int i =0;i< equipo.length;i++){
            System.out.println(equipo[i] );
        }
    }
}