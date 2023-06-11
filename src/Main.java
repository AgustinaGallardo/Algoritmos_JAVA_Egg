import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /**
             * EJERCICIO 11
        Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
        en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
        reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
        vocales acentuadas) se mantienen sin cambios.*/

        Scanner scan = new Scanner(System.in);
        String frase;
        String fraseConvertida;

        fraseConvertida="";
        System.out.println("Ingrese una frase");
        frase = scan.nextLine();

        fraseConvertida=fraseConvertida(frase);
        System.out.println("Frase original: " + frase);
        System.out.println("Resultado: " + fraseConvertida);
    }
    public static String fraseConvertida(String frase){
        String resultado;
        resultado="";

        for(int i=0;i<frase.length();i++){
            char vocal = frase.charAt(i);
            switch (vocal){
                case 'a':
                case 'A':
                    resultado += "@";
                    break;
                case 'e':
                case 'E':
                    resultado += "#";
                    break;
                case 'i':
                case 'I':
                    resultado += "$";
                    break;
                case 'o':
                case 'O':
                    resultado += "%";
                    break;
                case 'u':
                case 'U':
                    resultado += "*";
                    break;
                default:
                    resultado += vocal;
            }
        }
        return resultado;
    }

}








