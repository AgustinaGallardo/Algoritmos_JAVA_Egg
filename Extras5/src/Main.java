import java.util.Scanner;

public class Main {
    /**
     * Una obra social tiene tres clases de socios:
     * o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
     * todos los tipos de tratamientos.
     * o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
     * los mismos tratamientos que los socios del tipo A.
     * o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
     * tratamientos.
     * o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
     * real que represente el costo del tratamiento (previo al descuento) y determine el
     * importe en efectivo a pagar por dicho socio.
     *
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la clase de socio A, B o C");
        String tipoSocio = scan.nextLine();
        System.out.println("Ingrese el costo del tratamiento");
        Double costo = scan.nextDouble();

        double totalPago = 0.0;
        int descuento = 0;
        String tipo = tipoSocio.toUpperCase();
        switch (tipo){
            case "A":
                descuento = 50;
                totalPago = costo - (costo * descuento / 100);
                System.out.println("Su total a pagar era de: " + costo + " con el descuento su total a pagar es de: " + totalPago);
                break;
            case "B":
                descuento = 35;
                totalPago = costo - (costo * descuento / 100);
                System.out.println("Su total a pagar era de: " + costo + " con el descuento su total a pagar es de: " + totalPago);
                break;
            case "C":
                System.out.println("Su total a pagar es de: " + costo);
                break;
            default:
                System.out.println("Incorrecto, vuelve a intentar mas tarde");
                break;
        }
        System.out.println("Hasta pronto");
    }
}