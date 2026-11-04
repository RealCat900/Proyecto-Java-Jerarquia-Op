import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Velocidad registrada (km/h): ");
        double velocidad = sc.nextDouble();
        boolean excede = (velocidad > 110.0);
        System.out.println("Excede el limite de 110 km/h: " + excede);
        sc.close();
    }
}
