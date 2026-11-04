import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Largo (a): "); double a = sc.nextDouble();
        System.out.print("Ancho (b): "); double b = sc.nextDouble();
        System.out.print("Alto (c): "); double c = sc.nextDouble();
        double areaTotal = ((2 * (a * b)) + (2 * (a * c)) + (2 * (b * c)));
        System.out.println("Area superficial total: " + areaTotal);
        sc.close();
    }
}
