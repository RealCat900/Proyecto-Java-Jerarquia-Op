import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Radio 1: "); double r1 = sc.nextDouble();
        System.out.print("Radio 2: "); double r2 = sc.nextDouble();
        boolean mayor = ((3.14159 * (r1 * r1)) > (3.14159 * (r2 * r2)));
        System.out.println("Area 1 supera estrictamente a Area 2: " + mayor);
        sc.close();
    }
}
