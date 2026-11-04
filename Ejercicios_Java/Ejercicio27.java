import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Edad: "); int edad = sc.nextInt();
        System.out.print("Pase VIP (1 si, 0 no): "); int vip = sc.nextInt();
        boolean acceso = ((edad < 12) || (vip == 1));
        System.out.println("Acceso preferencial: " + acceso);
        sc.close();
    }
}
