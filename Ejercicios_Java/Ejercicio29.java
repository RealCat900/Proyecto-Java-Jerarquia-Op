import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Presion sistolica: ");
        int presion = sc.nextInt();
        boolean normal = ((presion >= 90) && (presion <= 120));
        System.out.println("Presion en rango saludable: " + normal);
        sc.close();
    }
}
