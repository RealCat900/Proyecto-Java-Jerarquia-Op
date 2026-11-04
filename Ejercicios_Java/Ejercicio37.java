import java.util.Scanner;

public class Ejercicio37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Precio de costo: "); double costo = sc.nextDouble();
        System.out.print("Precio de venta: "); double venta = sc.nextDouble();
        double margen = ((venta - costo) / costo);
        boolean margenSuficiente = (margen >= 0.30);
        System.out.println("Margen de ganancia: " + margen);
        System.out.println("Margen >= 30%: " + margenSuficiente);
        sc.close();
    }
}
