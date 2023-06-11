import java.util.Scanner;

public class Main {

    /**
     * Crea una aplicación que a través de una función nos convierta una cantidad de euros
     * introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
     * función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
     * una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
     * (void).
     * El cambio de divisas es:
     * * 0.86 libras es un 1 €
     * * 1.28611 $ es un 1 €
     * * 129.852 yenes es un 1 €
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Cambio de Euros a dólares, yenes o libras.");
        System.out.println("Ingrese a que moneda quiere cambiar");
        String tipoMoneda = scan.next();

        System.out.println("Cuantos dolares quere cambiar");
        Double cantMoneda = scan.nextDouble();
        cambioMoneda(tipoMoneda,cantMoneda);
    }
    private static void cambioMoneda(String tipoMoneda, Double cantMoneda) {
        Double cambio = 0.0;

        if(tipoMoneda.equalsIgnoreCase("LIBRAS")){
            cambio=cantMoneda*0.86;
        }
        else if (tipoMoneda.equalsIgnoreCase("YENES")){
            cambio=cantMoneda*129.852;
        }
        else if (tipoMoneda.equalsIgnoreCase("DOLARES")) {
            cambio=cantMoneda*1.28611;
        }else{
            System.out.println("No es valido el cambio");
            return;
        }
        System.out.println("El cambio para " + cantMoneda + " Euros a " + tipoMoneda +" es de " + cambio);
    }
}