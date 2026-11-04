import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Radio: ");
        double r = sc.nextDouble();
        System.out.print("Altura: ");
        double h = sc.nextDouble();
        double volumen = (3.14159 * (r * r) * h);
        System.out.println("Volumen del cilindro: " + volumen);
        sc.close();
    }
}
