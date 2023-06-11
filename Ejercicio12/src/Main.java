import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* EJERCICIO 12
         Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
         que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
         segundo, sino informe que no lo son.
         */
        Scanner scan = new Scanner(System.in);
        Integer num1;
        Integer num2;

        System.out.println("Ingrese dos numeros");
        num1= scan.nextInt();
        num2= scan.nextInt();

        esMultiplo(num1,num2);

    }
 static void esMultiplo(int num1,int num2){
        if(num1 % num2 == 0){
            System.out.println("Son multiplos");
        }else{
            System.out.println("NO son multiplos");
        }
    }
}