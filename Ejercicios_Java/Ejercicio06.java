import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cantidad entera de cambio: ");
        int cambio = sc.nextInt();
        int monedas10 = (cambio / 10);
        int monedas1 = (cambio % 10);
        System.out.println("Monedas de $10: " + monedas10);
        System.out.println("Monedas de $1: " + monedas1);
        sc.close();
    }
}
