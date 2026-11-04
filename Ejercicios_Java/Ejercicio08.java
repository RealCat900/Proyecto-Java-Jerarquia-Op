import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kilometros recorridos: ");
        double km = sc.nextDouble();
        System.out.print("Litros consumidos: ");
        double litros = sc.nextDouble();
        double rendimiento = (km / litros);
        System.out.println("Rendimiento (km/l): " + rendimiento);
        sc.close();
    }
}
