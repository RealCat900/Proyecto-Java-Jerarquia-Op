import java.util.Scanner;

public class Ejercicio36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Subtotal de la compra: "); double subtotal = sc.nextDouble();
        System.out.print("Distancia (km): "); double distancia = sc.nextDouble();
        boolean envioGratis = ((subtotal > 800) || (distancia < 3));
        System.out.println("Califica para envio gratis: " + envioGratis);
        sc.close();
    }
}
