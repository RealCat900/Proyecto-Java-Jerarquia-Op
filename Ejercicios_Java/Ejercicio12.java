import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Precio articulo 1: "); double p1 = sc.nextDouble();
        System.out.print("Precio articulo 2: "); double p2 = sc.nextDouble();
        System.out.print("Precio articulo 3: "); double p3 = sc.nextDouble();
        System.out.print("Dinero disponible: "); double dinero = sc.nextDouble();
        double total = (p1 + p2 + p3);
        boolean alcanza = (total <= dinero);
        System.out.println("Total: " + total);
        System.out.println("El dinero alcanza o sobra: " + alcanza);
        sc.close();
    }
}
