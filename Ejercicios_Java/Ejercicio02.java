import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cantidad en dolares: ");
        double dolares = sc.nextDouble();
        System.out.print("Tipo de cambio: ");
        double cambio = sc.nextDouble();
        System.out.print("Comision (%): ");
        double comision = sc.nextDouble();
        double totalNeto = ((dolares * cambio) - ((dolares * cambio) * (comision / 100)));
        System.out.println("Total neto en pesos: " + totalNeto);
        sc.close();
    }
}
