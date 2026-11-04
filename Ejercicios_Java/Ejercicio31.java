import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unidades compradas: "); int unidades = sc.nextInt();
        System.out.print("Precio unitario: "); double precio = sc.nextDouble();
        double costoTotal = (unidades * precio);
        boolean descuento = ((unidades > 50) && (costoTotal > 5000));
        System.out.println("Costo total: " + costoTotal);
        System.out.println("Aplica descuento por compra voluminosa: " + descuento);
        sc.close();
    }
}
