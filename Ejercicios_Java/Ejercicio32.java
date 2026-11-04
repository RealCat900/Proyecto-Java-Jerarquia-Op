import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ventas mensuales: ");
        double ventas = sc.nextDouble();
        boolean bono = (ventas >= 20000);
        System.out.println("Obtiene bono especial: " + bono);
        sc.close();
    }
}
