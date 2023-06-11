import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
         */


    Scanner scan = new Scanner(System.in);

    int num1,num2;
    int eleccion=0;

    do {

        System.out.println("Menu");
        System.out.println("1. Sumar\n" +
                "2. Restar\n" +
                "3. Multiplicar\n" +
                "4. Dividir\n" +
                "5. Salir");

        System.out.println("Que operacion desea realizar");
        eleccion = scan.nextInt();

            System.out.println("Ingrese dos numeros");
                 num1 = scan.nextInt();
                 num2 = scan.nextInt();

             switch (eleccion) {
                     case 1:
                         System.out.println(" El resultado de la suma es: " + sumaNum(num1, num2));
                         break;
                     case 2:
                         System.out.println(" El resultado de la resta es: " + restaNum(num1, num2));
                         break;
                     case 3:
                         System.out.println(" El resultado de la multiplicacion es: " + multiNum(num1, num2));
                         break;
                     case 4:
                         System.out.println(" El resultado de la division es: " + dividir(num1, num2));
                         break;
                     case 5:
                         break;
                        }
    }while(eleccion != 5);
        System.out.println("Gracias hasta la proxima");

    }
    public static int sumaNum(int num1, int num2){ return num1+num2; }
    public static int restaNum(int num1, int num2){
        return num1-num2;
    }
    public static int multiNum(int num1, int num2){
        return num1*num2;
    }
    public static double dividir(int num1, int num2){
        return num1*num2;
    }

}