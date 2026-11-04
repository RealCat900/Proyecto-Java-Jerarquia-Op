import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingreso mensual: "); double ingreso = sc.nextDouble();
        System.out.print("Pago tarjeta de credito: "); double pago = sc.nextDouble();
        boolean supera = (pago > (ingreso * 0.30));
        System.out.println("El pago supera el 30% del ingreso: " + supera);
        sc.close();
    }
}
